import java.util.ArrayList;
import java.util.List;

public class basicSyntax{
    public  static  void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(10); //to add elements
        list.add(30);
        list.add(40);
        list.get(1); //returns element at the index
        list.indexOf(30); //retuens the first  occurring index of given element
        list.set(2,40); //replaces the element at the index"2" to the new given value "40"
        list.remove(3); //removes by index
        list.remove(Integer.valueOf(10)); //removes by value
        list.contains(40); //boolean value, checks if it contains the given value
        list.isEmpty(); //boolean value, checks if the list is empty
        list.clear(); //removes all elements

        list.add(90);
        list.add(80);
        list.add(70);
        list.get(1); //fetches by index
        list.indexOf(70);//fetches the first index of given value
        list.set(2,50); //replaces the given idex with new value
        list.remove(3); //removes by index
        list.remove(Integer.valueOf(70)); //removes by value
        list.contains(90); //boolean value, checks if contains
        list.isEmpty(); //boolean value, checks if its empty
        list.clear(); //removes all elements

    }
}