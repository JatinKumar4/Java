import java.util.*;
public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Enter the number
        System.out.println("enter the number");
        int n[]=new int[5];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        int temp=n[5];
        for(int i=5;i>=0;i--){
            n[i+1]=n[i];
        }
        for(int i=0;i<n.length;i++){
            System.out.println("The values are:"+n[i]);
        }

    }
    
}
