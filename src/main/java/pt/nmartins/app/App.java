package pt.nmartins.app;



public class App 
{


    public static final int SHIFT = 48;

    public static int summAllCharsInStringLoopImpl(String s )
    {
        int charSumm=0;

        final char[] chars = s.toCharArray();

        for (char c : chars){

            int d = (int) c;

            if (d>= SHIFT && d<=SHIFT+9){
                charSumm+=d-SHIFT;
            }
        }

        System.out.println( "For the string " + s + " the result is: " + charSumm );
        return charSumm;
    }


    public static int summAllCharsInStringRecursiveImpl(String s, int charSumm)
    {

        char[] chars = s.toCharArray();
        int d = chars[chars.length-1];

       if (d>= SHIFT && d<=SHIFT+9){
            charSumm+=d-SHIFT;
        }

        if (chars.length==1) {
            return charSumm;
        }
        return summAllCharsInStringRecursiveImpl(s.substring(0,s.length()-1), charSumm);

    }

}
