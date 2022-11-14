package org.example.services;

public class AlignmentStrategyFactory {
    String strategiesPrototypes;

    public AllignStrategy create(String TextAlignment){
        if (TextAlignment == "left"){
            return new AlignLeft();
        }
        if (TextAlignment == "right"){
            return new AlignRight();
        }
        return null;
    }
}
