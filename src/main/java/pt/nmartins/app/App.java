package pt.nmartins.app;


import java.util.ArrayList;

public class App{



    public static void main(String[] args) {

        for (String arg : args) {

            int a = sumAllCharsInStringLoopImpl(arg);
            int b = sumAllCharsInStringRecursiveImpl(arg, 0);

            System.out.println("For string; \"" + arg + "\" the results are: ");
            System.out.println("\t With loop: " + a);
            System.out.println("\t Without loop: " + b + "\n");

        }

    }



    public static final int SHIFT = 48;

    public static int sumAllCharsInStringLoopImpl(String s )
    {
        int charSum=0;

        final char[] chars = s.toCharArray();

        for (char c : chars){

            int d = (int) c;

            if (d>= SHIFT && d<=SHIFT+9){
                charSum+=d-SHIFT;
            }
        }
        return charSum;
    }


    public static int sumAllCharsInStringRecursiveImpl(String s, int charSum)
    {
        if(s.isEmpty()){
            return charSum;
        }

        char[] chars = s.toCharArray();
        int d = chars[chars.length-1];

       if (d>= SHIFT && d<=SHIFT+9){
            charSum+=d-SHIFT;
        }

        if (chars.length==1) {
            return charSum;
        }
        return sumAllCharsInStringRecursiveImpl(s.substring(0,s.length()-1), charSum);

    }

}










