import java.util.*;

public class tcs2025_2{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=sc.nextInt();

        ArrayList <Integer> board= new ArrayList<>();
        for(int i=1; i<=n; i++){
            board.add(i);
        }

        Collections.shuffle(board);
        System.out.println(func(n,board));
        
    }

    public static int func(int n, ArrayList <Integer> board){

        int arrstudents[]=new int[n];
        for(int i=0; i<n;i++){
            arrstudents[i]=i+1;
        }
        System.out.println(Arrays.toString(arrstudents));
        System.out.println(board);

        int moves=0;    
        return moves;
    }
        

}
