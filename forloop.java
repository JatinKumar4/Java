import java.util.Scanner;

public class forloop {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        //Enter value
        System.out.println("Enter value");
        n=sc.nextInt();
        
        // this is traditional for loop
        for(int i=0;i<n;i++){
          System.out.println("Hello World");
        }
    }
    

 
  {
        //Enhance for loop
        String nameArr[]={"RAM","SHYAM","MOHAN"};
        for(String name: nameArr){
            System.out.println(name);
        }
    }
    
}

