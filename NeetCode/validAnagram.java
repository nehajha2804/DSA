import java.util.HashMap;
public class validAnagram{
    public static void main(String args[]){
        String s="racecar";
        String m="racecar";
        System.out.println(isAnagram(s,m));

    }

    public static boolean isAnagram(String s, String m){
        char sArr[] = s.toCharArray();
        char mArr[] = m.toCharArray();
        HashMap <Character, Integer> map = new HashMap<>();
        for(char ch:sArr){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(char mh:mArr){
        if(!map.containsKey(mh)){
            return false;
        }

        map.put(mh,map.get(mh)-1);
        
        if(map.get(mh)==0){
            map.remove(mh);
        }

        }
       
        return map.isEmpty();
    }
}