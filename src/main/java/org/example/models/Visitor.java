package org.example.models;

public interface Visitor<Response>{
    public Response visitBook(Book x);
    public Response visitSection(Section x);
    public Response visitTableOfContents(TableOfContents x);
    public Response visitParagraph(Paragraph x);
    public Response visitImageProxy(ImageProxy x);
    public Response visitImage(Image x);
    public Response visitTable(Table x);

}
