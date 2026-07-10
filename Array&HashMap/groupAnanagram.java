import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnanagram{
    public static void main(String args[]){
        String strs[] = {"act","pots","tops","cat","stop","hat"};
        System.out.println(isAnangram(strs));
       
    }

    public static List<List<String>> isAnangram (String strs[]){
        HashMap <String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char s[] = str.toCharArray();
            Arrays.sort(s);
            String sorted = new String(s);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }
}