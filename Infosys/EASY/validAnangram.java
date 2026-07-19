import java.util.Arrays;

public class validAnangram{
    public static void main(String args[]){
        String S= "racecar";
        String T= "carrace";
    }

    public static boolean isAnangram(String S, String T){
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);

        return Arrays.equals(s,t);
    }
}