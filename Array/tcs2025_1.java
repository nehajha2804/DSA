import java.util.*;
public class tcs2025_1{
    public static void main(String args[]){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the string");
        String A =sc.next();

        System.out.println("Enter the number of indices to be changed.");
        int n =sc.nextInt();

        System.out.println("Enter the indices to be changed.");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        func(A, arr);
    }

    public static int func(String A, int arr[]){
        char B[]= A.toCharArray();
        int n=arr.length;
        char arrChange []= new char[n];

        for(int i=0; i<n; i++){
            arrChange[i]=B[arr[i]-1];
        }

        System.out.println(arrChange);

        char min = arrChange[0];
        for(int i=0;i<n;i++){
            if(min>arrChange[i])
            min=arrChange[i];
        }

        System.out.println(min);

        int changes=0;
        for(int i = 0; i < n; i++){
        B[arr[i] - 1] = min;
        changes++;
        }

        String A_new= new String(B);
        System.out.println(A_new);
        System.out.println(changes);

        return changes;

    }
}