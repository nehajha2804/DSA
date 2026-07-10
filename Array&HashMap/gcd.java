import java.util.*;

public class gcd{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the digits");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(gcd(a,b));
    System.out.println(lcm(a,b));

 }

 public static int gcd(int a, int b){
    while(b!=0){
        int temp=b;
        b=a%b; // '%'' gives remainder
        a=temp;
    }
    return a;
 }

 public static int lcm(int a, int b){
    int lcm=(a*b)/gcd(a,b); // '/' gives quotient
    return lcm;
 }
}