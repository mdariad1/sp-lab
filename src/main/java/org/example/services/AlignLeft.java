package org.example.services;

public class AlignLeft implements AllignStrategy {
    String text;

    @Override
    public String render(String paragraph) {
        return paragraph + " ***";
    }


}
