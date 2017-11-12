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

package com.desive.nodes.editor.toolbar;

import com.desive.nodes.TabFactory;
import com.desive.nodes.tabs.EditorTab;
import com.desive.utilities.Dictionary;
import com.desive.views.EditorView;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.util.Arrays;

/*
 Created by Jack DeSive on 11/7/2017 at 9:30 PM
*/
public class ViewSelectorPane extends HBox {

    private ImageView code, view, split;
    private Label label;
    private TabFactory tabFactory;

    public ViewSelectorPane(Dictionary dictionary, TabFactory tabFactory) {

        this.tabFactory = tabFactory;

        HBox labelContainer = new HBox();
        label = new Label(dictionary.STAGE_EDITOR_VIEW_SELECTOR_LABEL);
        label.getStyleClass().add("toolbar-view-selector-label");
        labelContainer.setAlignment(Pos.CENTER);
        labelContainer.getChildren().add(label);


        code = new ImageView(new Image("assets/icons/editor_code_view_icon.png"));
        view = new ImageView(new Image("assets/icons/editor_webview_view_icon.png"));
        split = new ImageView(new Image("assets/icons/editor_split_view_icon.png"));

        setImageSizes(25, 25, code, view, split);

        code.setOnMouseClicked(event -> switchEditorPaneView(EditorView.CODE_ONLY));
        view.setOnMouseClicked(event -> switchEditorPaneView(EditorView.VIEW_ONLY));
        split.setOnMouseClicked(event -> switchEditorPaneView(EditorView.SPLIT_VIEW));

        code.getStyleClass().add("toolbar-button");
        view.getStyleClass().add("toolbar-button");
        split.getStyleClass().add("toolbar-button");

        getChildren().addAll(
                labelContainer,
                code,
                split,
                view
        );
    }

    private void switchEditorPaneView(EditorView view) {
        ((EditorTab) tabFactory.getSelectedTab()).getEditorPane().setView(view);
    }

    private void setImageSizes(double width, double height, ImageView... views) {
        Arrays.asList(views).forEach(view -> {
            view.setFitHeight(height);
            view.setFitWidth(width);
        });
    }

}