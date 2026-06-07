import java.util.HashMap;

public class Transversal{
    public static void main(String args[]){
        HashMap <Integer, String> map= new HashMap<>();
        map.put(1, "Java");
        map.put(2,"Python");
        map.put(3, "C");
        map.put(4, "Ruby");

        //.keySet and .values return the keys and values in Set DataStructure
        System.out.println(map.values());
        System.out.println(map.keySet());

        //printing key
        for(Integer key: map.keySet()){
            System.out.println(key);
        }

       
        //printing values
        for(String value: map.values()){
            System.out.println(value);
        }
        

        //printing values using key
        for(Integer i: map.keySet()){
            System.out.println(map.get(i));
        }

    }
}