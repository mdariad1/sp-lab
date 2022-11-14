package org.example.models;

public interface Visitor{
    public void visitBook(Book x);
    public void visitSection(Section x);
    public void visitTableOfContents(TableOfContents x);
    public void visitParagraph(Paragraph x);
    public void visitImageProxy(ImageProxy x);
    public void visitImage(Image x);
    public void visitTable(Table x);

}
