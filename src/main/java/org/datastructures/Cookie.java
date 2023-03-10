package org.datastructures;

public class Cookie {
    private String color;

    public Cookie(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

Cookie cookieOne = new Cookie("green");

Cookie cookieTwo = new Cookie("blue");
