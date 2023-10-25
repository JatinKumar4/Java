import java.util.Scanner;
public class SimpleInterest {
    public static double SimpleInterest(int p,int r,int t){
        
        
        //the logic of simple interest is
        double SI=(p*r*t)/100;
        System.out.println("the value of si:"+SI);
        return SI;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal");
        int p=sc.nextInt();
        System.out.println("Enter rate");
        int r=sc.nextInt();
        System.out.println("Enter time");
        int t=sc.nextInt();
        double res = SimpleInterest(p,r,t);
        System.out.println(res);
        // SimpleInterest obj=new SimpleInterest();
        // obj.SimpleInterest();
    }
    
}
