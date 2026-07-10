import java.util.ArrayList;
import java.util.List;

public class basicSyntax{
    public  static  void main(String args[]){
        List<Integer> list = new ArrayList<>();
       list.add(40);
       list.add(30);
       list.add(50);
       list.get(1); //fetch the value at this index
       list.indexOf(30); //returns first occuring index of this value
       list.set(1,40); //replace value
       list.remove(3); //remove the value at this index
       list.remove(Integer.valueOf(50)); //remove by value
       list.contains(40); //boolean value, checks if present
       list.isEmpty(); //boolean value, checks if empty
       list.clear(); //removes all values

    }
}