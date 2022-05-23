package fifthitem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getFifthItemTest()
    {
        ArrayList<String> favfoods1test = new ArrayList<>();
        favfoods1test.add("corn");
        favfoods1test.add("chips");
        favfoods1test.add("wings");
        favfoods1test.add("tacos");
        favfoods1test.add("pizza");

        assertEquals("Your fifth favorite food is: pizza", FifthItem.getFifthItem(favfoods1test));
    }
}
