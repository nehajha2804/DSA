public class validPallindrome{
    public static void main(String args[]){
        String s = "racecar";
        System.out.println(isPallindrome((s)));
       
    }
    public static boolean isPallindrome(String s){
        int left = 0;
        int right =s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))!=
            Character.toUpperCase(s.charAt(right))){
                return false;
            }
        }
    return true;
    }
}