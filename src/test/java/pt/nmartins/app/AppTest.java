package pt.nmartins.app;

import static org.junit.Assert.*;
import static pt.nmartins.app.App.summAllCharsInStringLoopImpl;
import static pt.nmartins.app.App.summAllCharsInStringRecursiveImpl;

import org.junit.Test;

public class AppTest 
{

    String s = "0ut5yst3m5";
    int result =13;

    @Test
    public void testLoopImpl()
    {
        assertEquals( result, summAllCharsInStringLoopImpl(s) );
    }

    @Test
    public void testRecursiveImpl()
    {
        assertEquals(result,summAllCharsInStringRecursiveImpl(s, 0) );
    }
}
