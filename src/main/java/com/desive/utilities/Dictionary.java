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

package com.desive.utilities;

/*
 Created by Jack DeSive on 10/24/2017 at 4:25 PM
*/
public class Dictionary {

    public static Dictionary instance;

    // Editor Stage
    public static String STAGE_EDITOR_TITLE = "TextMd - Editor";

    // Settings Stage
    public static String STAGE_SETTINGS_TITLE = "TextMd - Settings";

    // Editor Toolbar
    public static String TOOLBAR_EDITOR_FILE_MENU = "File",
            TOOLBAR_EDITOR_EDIT_MENU = "Edit",
            TOOLBAR_EDITOR_VIEW_MENU = "View",
            TOOLBAR_EDITOR_HELP_MENU = "Help",
            TOOLBAR_EDITOR_IMPORT_MENU = "Import",
            TOOLBAR_EDITOR_EXPORT_MENU = "Export",
            TOOLBAR_EDITOR_OPEN_MENU = "Open",
            TOOLBAR_EDITOR_SETTINGS_ITEM = "Settings",
            TOOLBAR_EDITOR_PRETTIFY_ITEM = "Prettify Code",
            TOOLBAR_EDITOR_REFRESH_VIEW_ITEM = "Refresh View",
            TOOLBAR_EDITOR_UNDO_ITEM = "Undo",
            TOOLBAR_EDITOR_REDO_ITEM = "Redo",
            TOOLBAR_EDITOR_NEW_ITEM = "New",
            TOOLBAR_EDITOR_SAVE_ITEM = "Save",
            TOOLBAR_EDITOR_SAVE_AS_ITEM = "Save as",
            TOOLBAR_EDITOR_IMPORT_URL_ITEM = "URL",
            TOOLBAR_EDITOR_IMPORT_FILE_ITEM = "File",
            TOOLBAR_EDITOR_EXPORT_HTML_ITEM = "HTML",
            TOOLBAR_EDITOR_EXPORT_HTML_CSS_ITEM = "HTML/CSS",
            TOOLBAR_EDITOR_EXPORT_DOCX_ITEM = "Docx",
            TOOLBAR_EDITOR_EXPORT_PDF_ITEM = "PDF",
            TOOLBAR_EDITOR_EXPORT_PDF_CSS_ITEM = "PDF/CSS",
            TOOLBAR_EDITOR_EXPORT_JIRA_ITEM = "JIRA",
            TOOLBAR_EDITOR_EXPORT_YOUTRACK_ITEM = "YouTrack",
            TOOLBAR_EDITOR_EXPORT_TEXT_ITEM = "Plain Text",
            TOOLBAR_EDITOR_EXPORT_CONFLUENCE_ITEM = "Confluence",
            TOOLBAR_EDITOR_EXIT_ITEM = "Exit",
            TOOLBAR_EDITOR_OPEN_FILE_ITEM = "File",
            TOOLBAR_EDITOR_OPEN_URL_ITEM = "URL";

    // Settings View Tab
    public static String SETTINGS_VIEW_REFRESH_RATE_LABEL_TOOLTIP = "How fast to refresh the HTML in the view",
            SETTINGS_VIEW_REFRESH_RATE_FIELD_TOOLTIP = "Default: 1 second(s)",
            SETTINGS_VIEW_REFRESH_RATE_LABEL = "View refresh rate:",
            SETTINGS_VIEW_PRETTIFY_CODE_LABEL = "Always Prettify",
            SETTINGS_VIEW_PRETTIFY_CODE_LABEL_TOOLTIP = "Use Google Prettify by default",
            SETTINGS_VIEW_TAB_HEADER_LABEL = "View";

    // Settings Editor Tab
    public static String SETTINGS_EDITOR_REFRESH_RATE_LABEL = "Highlight refresh rate:",
            SETTINGS_EDITOR_REFRESH_RATE_LABEL_TOOLTIP = "How fast to refresh the editors highlighting",
            SETTINGS_EDITOR_REFRESH_RATE_FIELD_TOOLTIP = "Default: 500 millisecond(s)",
            SETTINGS_EDITOR_TAB_HEADER_LABEL = "Editor";

    // Dialogs
    public static String DIALOG_EXCEPTION_TITLE = "Oops, an exception!",
            DIALOG_EXCEPTION_IMPORT_CONTENT = "Error importing markdown",
            DIALOG_EXCEPTION_EXPORT_HTML_CONTENT = "Error exporting HTML",
            DIALOG_EXCEPTION_EXPORT_HTML_CSS_CONTENT = "Error exporting HTML/CSS",
            DIALOG_EXCEPTION_EXPORT_DOCX_CONTENT = "Error exporting Docx",
            DIALOG_EXCEPTION_EXPORT_PDF_CONTENT = "Error exporting PDF",
            DIALOG_EXCEPTION_EXPORT_PDF_CSS_CONTENT = "Error exporting PDF/CSS",
            DIALOG_EXCEPTION_EXPORT_JIRA_CONTENT = "Error exporting JIRA formatted text",
            DIALOG_EXCEPTION_EXPORT_YOUTRACK_CONTENT = "Error exporting YouTrack formatted text",
            DIALOG_EXCEPTION_EXPORT_CONFLUENCE_CONTENT = "Error exporting Confluence markup",
            DIALOG_EXCEPTION_EXPORT_PLAIN_TEXT_CONTENT = "Error exporting Plain Text",
            DIALOG_EXCEPTION_SAVING_MARKDOWN_CONTENT = "Error saving Markdown",
            DIALOG_EXCEPTION_OPENING_MARKDOWN_CONTENT = "Error opening Markdown",
            DIALOG_EXCEPTION_OPENING_MARKDOWN_URL_CONTENT = "Error opening Markdown from URL",
            DIALOG_IMPORT_URL_TITLE = "Import from URL",
            DIALOG_IMPORT_URL_CONTENT = "Enter a url to pull markdown from.",
            DIALOG_EXPORT_SUCCESS_TITLE = "Exported Successfully",
            DIALOG_EXPORT_SUCCESS_HTML_CONTENT = "Exported HTML successfully.",
            DIALOG_EXPORT_SUCCESS_HTML_CSS_CONTENT = "Exported HTML/CSS successfully.",
            DIALOG_EXPORT_SUCCESS_DOCX_CONTENT = "Exported Docx successfully.",
            DIALOG_EXPORT_SUCCESS_PDF_CONTENT = "Exported PDF successfully.",
            DIALOG_EXPORT_SUCCESS_PDF_CSS_CONTENT = "Exported PDF/CSS successfully.",
            DIALOG_EXPORT_SUCCESS_JIRA_CONTENT = "Exported JIRA formatted text successfully.",
            DIALOG_EXPORT_SUCCESS_YOUTRACK_CONTENT = "Exported YouTrack formatted text successfully.",
            DIALOG_EXPORT_SUCCESS_CONFLUENCE_CONTENT = "Exported Confluence markup successfully.",
            DIALOG_EXPORT_SUCCESS_PLAIN_TEXT_CONTENT = "Exported Plain Text successfully.",
            DIALOG_OPEN_URL_TITLE = "Open from URL",
            DIALOG_OPEN_URL_CONTENT = "Enter a url to pull markdown from.",
            DIALOG_FILE_NOT_SAVED_TITLE = "File is not saved!",
            DIALOG_FILE_NOT_SAVED_CONTENT = "Would you like to save this document?";

    public Dictionary() {
        instance = this;
    }

    public static Dictionary getInstance() {
        return instance;
    }
}
