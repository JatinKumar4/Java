import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        //Enter the value
        System.out.println("Enter the value");
        n=sc.nextInt();
        
        //logic
        for(i=1;i<=10;i++){
        System.out.println(n+"*"+i+"="+n*i);
        }
    }
    
}
