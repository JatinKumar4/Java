import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        double num=0;
        Scanner sc=new Scanner(System.in);
        //Enter any two number
        System.out.println("Enter two numbers");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        //Enter operator
        System.out.println("Enter the operator:+,-,*,/,%");
        char operator=sc.next().charAt(0);
        switch(operator){
            case'+':
                num=a+b;
                break;
                case'-':
                num=a-b;
                break;
                case'*':
                num=a*b;
                break;
                case'/':
                num=a/b;
                break;
                case'%':
                num=a%b;
                break;
                default:
                System.out.println("you enter wrong input");

            }
            System.out.println(num);

        }


        

    }
    

