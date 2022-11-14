package org.example.services;

public class AlignRight implements AllignStrategy {
    String text;

    @Override
    public String render(String paragraph) {
        return "*** " + paragraph;
    }

}
