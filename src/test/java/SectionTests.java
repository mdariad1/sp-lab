import org.example.models.Element;
import org.example.models.Image;
import org.example.models.Paragraph;
import org.example.models.Section;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SectionTests {

    @Test
    public void  givenSection_whenChildHasNoParent_thenAddChild(){
        Section section = new Section("test");
        Element child = new Image("");

        section.add(child);
    }

    @Test
    public void  givenSection_whenChildHasNoParentAndSameSection_thenThrowException(){
        Section section = new Section("test");
        Element child = new Image("");

        section.add(child);

        assertThrows(UnsupportedOperationException.class, () -> section.add(child));
    }

    @Test
    public void  givenSection_whenChildHasNoParentAndDifferentSection_thenThrowException(){
        Section section = new Section("test");
        Element child = new Image("");

        section.add(child);

        Section section1 = new Section("");
        assertThrows(UnsupportedOperationException.class, () -> section1.add(child));
    }

    @Test
    public void  givenSection_whenChildAndParentAreTheSame_thenThrowException(){
        Section section = new Section("test");

        assertThrows(UnsupportedOperationException.class, () -> section.add(section));
    }

    @Test
    public void  givenLeaf_whenCallAggregateMethod_thenThrowException(){
        Element e = new Image("test");


        assertThrows(UnsupportedOperationException.class, () -> e.add(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.remove(new Paragraph("")));
        assertThrows(UnsupportedOperationException.class, () -> e.get(0));

    }



}

