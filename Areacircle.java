import java.util.Scanner;
public class Areacircle {
    public static void main(String[] args){
        double r;
        Scanner sc=new Scanner(System.in);
        //Enter the radius
        System.out.println("Enter the radius");
        r=sc.nextFloat();
        double area=3.14*r*r;
        System.out.println("the area of circle:"+area);


    }
    
}
