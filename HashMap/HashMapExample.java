import java.util.HashMap;
public class HashMapExample{
    public static void main(String args[]){
        HashMap <Integer, Integer> map = new HashMap <>();
        //jo cheez dhundhna hai woh key main daalo and jo information pr kaam kr rhe hai woh value main rkho
        
        //map.put(key,value) is used to add a key-value pair in the HashMap
        map.put(8,0);
        map.put(9,1);
        map.put(10,1);

        // map.get(key) returns value associated with the key associated with the value
        System.out.println(map.get(8));


        /* map.getOrDefault(key, 0) gets the 
        value of corresponding to the key if present. else return the 
        given default value*/
        System.out.println(map.getOrDefault(10,0)); //here the default value is 0
        System.out.println(map.getOrDefault(11,1)); //here the default value is 1

        // map.containsKey(key);
        System.out.println(map.containsKey(8));
        
        //map.containsValue(Value)
        System.out.println(map.containsValue(1));
        // map.remove(key);
        // map.keySet();
        // map.entrySet();

    }
}

       