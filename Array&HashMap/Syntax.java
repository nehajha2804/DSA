import java.util.HashMap;

public class Syntax{
    public static void main(String args[]){
        //HashMap declaration
        HashMap <Integer, String> map= new HashMap <>();

        //put function
        map.put(1, "Neha");
        map.put(2, "Sneha");
        map.put(3, "Adarsh");
        map.put(4, "Ayesha");

        System.out.println(map);

        //get function
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));

        map.remove(4);
        System.out.println(map);

        //contains key
        System.out.println(map.containsKey(3));

        //contains Value
        System.out.println(map.containsValue("Neha"));

        //clone function
        System.out.println(map.clone());

        //isEmpty
        System.out.println(map.isEmpty());

        //clear function
        map.clear();
        
    }
}