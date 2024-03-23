package org.example;

public enum Karoseria {
    RED("#FF0000"),
    WHITE("#FFFFFF"),
    BLACK("#000000");
    private final String hexValue;

    Karoseria(String hexValue) {
        this.hexValue = hexValue;
    }

    public String getHexValue() {
        return hexValue;
    }
}

