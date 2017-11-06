/*
 * Copyright (C) 2017  TextMd
 *
 * This file is part of TextMd.
 *
 * TextMd is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.desive;

import com.desive.nodes.TabFactory;
import com.desive.stages.EditorStage;
import com.desive.stages.SettingsStage;
import com.desive.stages.dialogs.DialogFactory;
import com.desive.utilities.*;
import javafx.application.Application;
import javafx.stage.Stage;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.IOException;

/*
 Created by Jack DeSive on 10/7/2017 at 9:28 PM
*/
public class TextMd extends Application{

    private Settings settings;
    private Dictionary languageDictionary;
    private Fonts fonts;
    private Http http;

    private TabFactory tabFactory;
    private DialogFactory dialogFactory;

    private EditorStage editorStage;
    private SettingsStage settingsStage;

    private String ARTIFACT_ID = null, VERSION = null;
    private final Logger logger = LoggerFactory.getLogger(TextMd.class);

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.close(); // Throw away the default stage

        languageDictionary = new Dictionary();
        http = new Http();
        fonts = new Fonts();
        tabFactory = new TabFactory(languageDictionary, dialogFactory, primaryStage);
        dialogFactory = new DialogFactory(languageDictionary);
        settings = new Settings(tabFactory);

        loadUtilities();
        loadPomVariables();
        loadFonts();

        logger.info("Starting {} {}" , ARTIFACT_ID, VERSION);

        settingsStage = new SettingsStage(languageDictionary);
        editorStage = new EditorStage(languageDictionary, tabFactory, dialogFactory, settingsStage);
        settingsStage.initOwner(editorStage);
        dialogFactory.initOwner(editorStage);

        editorStage.show();
    }

    private void loadFonts(){
        if(Settings.LOAD_FONTS_AT_RUNTIME) {
            logger.info("Using \'{}\' fonts", fonts.COURIER_PRIMAL_NAME);
            if(!fonts.fontExits(fonts.COURIER_PRIMAL_NAME)){
                fonts.registerFont(fonts.COURIER_PRIMAL_URL, fonts.COURIER_PRIMAL_NAME);
                fonts.registerFont(fonts.COURIER_PRIMAL_ITALICS_URL, fonts.COURIER_PRIMAL_ITALICS_NAME);
                fonts.registerFont(fonts.COURIER_PRIMAL_BOLD_URL, fonts.COURIER_PRIMAL_BOLD_NAME);
                fonts.registerFont(fonts.COURIER_PRIMAL_BOLD_ITALICS_URL, fonts.COURIER_PRIMAL_BOLD_ITALICS_NAME);
            }
        } else {
            logger.info("Using \'{}\' font", fonts.COURIER_REGULAR_NAME);
        }

    }

    private void loadPomVariables() {
        logger.debug("Loading maven pom.xml variables");
        MavenXpp3Reader reader = new MavenXpp3Reader();
        try {
            Model model = reader.read(new FileReader("pom.xml"));
            ARTIFACT_ID = model.getArtifactId();
            VERSION = model.getVersion();
        } catch (IOException | XmlPullParserException e) {
            e.printStackTrace();
        }
    }

    private void loadUtilities(){
        new Utils();
        new Dictionary();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
