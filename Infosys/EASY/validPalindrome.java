class validPalindrome{
    public static void main(String args[]){
        String s= "RaceCar";
        isValidPalindrome(s);
    }

    public static boolean isValidPalindrome(String s){
        char S[] = s.toCharArray();
        int left=0;
        int right = S.length-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(S[left])){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(S[right])){
                right--;
            }

            while(Character.toLowerCase(S[left])!=Character.toLowerCase(S[right])){
                return false;
            }

            left--;
            right++;
        }
        return true;
    }
}