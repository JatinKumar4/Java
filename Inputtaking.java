import java.util.Scanner;
public class Inputtaking{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Enter name
        System.out.println("Enter the name");
        String name=sc.nextLine();
        //Enter age
        System.out.println("Enter age");
        int age=sc.nextInt();
        //Enter class
        System.out.println("Enter class");
        int cls=sc.nextInt();
        //Taking character as input
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);

        //the output are
        System.out.println("The name is"+name);
        System.out.println("The age is"+age);
        System.out.println("The class is"+cls);
        System.out.println("The character is:"+ch);
    }
  
}