/**
 * Copyright (c) 2013, The National Archives <digitalpreservation@nationalarchives.gov.uk>
 * http://www.nationalarchives.gov.uk
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package uk.gov.nationalarchives.csv.validator.api.java;

/**
 * Abstract type for CSV Schema Parser and CSV Validation errors
 */
public abstract class FailMessage {
    private final String message;
    private final int lineNumber;
    private final int columnIndex;
    private final String resourceTag;

    /**
     * @param message The failure message
     * @param lineNumber The original line number in the file
     * @param columnIndex Zero-based column index
     * @param resourceTag ResourceTag parameter
     */
    public FailMessage(final String message, final int lineNumber, final int columnIndex,final String resourceTag) {
        this.message = message;
        this.lineNumber = lineNumber;
        this.columnIndex = columnIndex;
        this.resourceTag = resourceTag;
    }
    /**
     * @param message The failure message
     * @param lineNumber The original line number in the file
     * @param columnIndex Zero-based column index
     */
    public FailMessage(final String message, final int lineNumber, final int columnIndex) {
        this.message = message;
        this.lineNumber = lineNumber;
        this.columnIndex = columnIndex;
        this.resourceTag = "general.tag";
    }

    public String getMessage() {
        return message;
    }

    public int getLineNumber()
    {
        return lineNumber;
    }

    public int getColumnIndex()
    {
        return columnIndex;
    }
    public String getResourceTag(){
        return resourceTag;
    }
}