package com.liferay.sales.selenium.api;

public enum MarkMethod {
    BORDER("border = '2px solid red'"),
    BACKGROUND("backgroundColor = 'red'");

    private final String styleString;

    MarkMethod(final String styleString) {
        this.styleString = styleString;
    }

    public String getStyleString() {
        return styleString;
    }
}
