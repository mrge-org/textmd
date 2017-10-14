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

package com.desive.nodes;

import javafx.geometry.NodeOrientation;
import javafx.scene.control.Tab;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/*
 Created by Jack DeSive on 10/13/2017 at 6:59 PM
*/
public class EditorTab extends Tab {

    private EditorPane editorPane;

    public EditorTab(EditorPane editorPane) {

        this.editorPane = editorPane;

        this.setContent(this.editorPane);
    }

    public void computeTabName(){
        String filePath = editorPane.getFile().getPath();
        Text text;
        if(filePath.length() > 20){
            text = new Text(filePath.substring(filePath.length()-20, filePath.length()));
        }else{
            text = new Text(filePath);
        }
        text.setFill(Color.valueOf("f8f8f2"));
        this.setGraphic(new StackPane(text));
        this.getGraphic().setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
    }

    public EditorPane getEditorPane() {
        return editorPane;
    }
}