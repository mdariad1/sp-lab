package org.example.services;

import org.example.models.entities.*;
import org.example.models.interfaces.Element;
import org.example.models.interfaces.Visitee;
import org.example.models.interfaces.Visitor;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONVisitor implements Visitor<JSONObject> {
    @Override
    public JSONObject visitBook(Book x) {
        JSONObject jo = new JSONObject();
        jo.put("type", Book.class.toString());

        jo = visitSection(x, jo);


        return jo;
    }

    @Override
    public JSONObject visitSection(Section x) {
        JSONObject jo = new JSONObject();
        jo.put("type", Section.class.toString());
        return visitSection(x, jo);
    }

    private JSONObject visitSection(Section x, JSONObject jo) {

        jo.put("title", x.getTitle());

        JSONArray children = new JSONArray();
        for (Element e:x.getChildren()) {
            children.put(((Visitee)e).accept(this));
        }
        jo.put("children", children);

        return jo;
    }

    @Override
    public JSONObject visitTableOfContents(TableOfContents x) {
        JSONObject jo = new JSONObject();
        jo.put("type", TableOfContents.class.toString());
        jo.put("something", x.getSomething());


        return jo;
    }

    @Override
    public JSONObject visitParagraph(Paragraph x) {
        JSONObject jo = new JSONObject();
        jo.put("type", Paragraph.class.toString());
        jo.put("text", x.getText());
        jo.put("strategy", x.getStrategy());

        return jo;
    }

    @Override
    public JSONObject visitImageProxy(ImageProxy x) {
        return null;
    }

    @Override
    public JSONObject visitImage(Image x) {
        JSONObject jo = new JSONObject();
        jo.put("type", Image.class.toString());
        jo.put("url", x.getUrl());

        return jo;
    }

    @Override
    public JSONObject visitTable(Table x) {
        JSONObject jo = new JSONObject();
        jo.put("type", Table.class.toString());
        jo.put("content", x.getSomething());

        return jo;
    }
}
