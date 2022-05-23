package mynameis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void mynameistest()
    {
        assertEquals("My name is: JoshuaTaylor", App.myNameIs("My name is: ", "Joshua", "Taylor"));
    }
}
