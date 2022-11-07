package org.example;

import javax.naming.Context;

public class AlignRight implements AllignStrategy {
    String text;

    @Override
    public String render(String paragraph) {
        return "******** " + paragraph;
    }

}
