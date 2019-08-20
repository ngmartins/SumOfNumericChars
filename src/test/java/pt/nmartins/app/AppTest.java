package pt.nmartins.app;

import static org.junit.Assert.*;
import static pt.nmartins.app.App.*;

import org.junit.Test;

import java.util.ArrayList;

public class AppTest 
{

    String s = "0ut5yst3m5";
    int result =13;

    @Test
    public void testLoopImpl()
    {
        assertEquals( result, sumAllCharsInStringLoopImpl(s) );
    }

    @Test
    public void testRecursiveImpl()
    {
        assertEquals(result, sumAllCharsInStringRecursiveImpl(s, 0) );
    }

    @Test
    public void runBothImpInSeveralSamples() {

        ArrayList<String> samples = new ArrayList<String>();
        {

            samples.add("0ut5yst3m5");
            samples.add("4lw4y5 45k Why");
            samples.add("01001111 01110101 01110100 01110011 01111001 01110011 01110100 01100101 01101101 01110011");
            samples.add("@#$% ");
            samples.add("B3 H4ppy! ");
            samples.add("ePi1000");
            samples.add("Ju5t c0d1ng");
            samples.add("B1ch4D0D3m0n10N40P4ss4r4s!");
            samples.add("M4rt3l0D3Th0r");

            for (String sample : samples) {

                int a = sumAllCharsInStringLoopImpl(sample);
                int b = sumAllCharsInStringRecursiveImpl(sample, 0);

                System.out.println("For string; \"" + sample + "\" the results are: ");
                System.out.println("\t With loop: " + a);
                System.out.println("\t Without loop: " + b + "\n");

                assertEquals(a, b);
            }
        }
    }
}
