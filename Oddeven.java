import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;

        //Enter the value from keyboard
        System.out.println("Enter the value");
        n=sc.nextInt();

        //check the no. is even or odd
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    
}
    }
