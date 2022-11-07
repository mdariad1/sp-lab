package org.example;

import javax.naming.Context;

public class AlignLeft implements AllignStrategy {
    String text;

    @Override
    public String render(String paragraph) {
        return paragraph + " ********";
    }


}
