import java.util.Arrays;

class rotationOfString{
    public static void main(String args[]){
        String s = "neet";
        rotationOfArray(s);
    }

    public static void rotationOfArray(String s){
        char [] S = s.toCharArray();
        int n=S.length;
        
        int j=n-1;
        for(int i=0; i<n/2; i++){
            char temp =  S[j];
            S[j] = S[i];
            S[i] = temp;
            j--;
        }

        System.out.println(Arrays.toString(S));
    }
}