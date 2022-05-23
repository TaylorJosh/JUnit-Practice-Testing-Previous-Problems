package sumoflist;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.*;

@DisplayName("Test SumOfList")
public class SumOfListTest {
    @Test
    @DisplayName("Test sum")


    public void testSum() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(5);
        list.add(5);
        assertEquals(15, SumOfList.sum(list));
    }
}
