public class Hollowsquare {
    public static void main(String[] args){
        for(int i=0;i<5;i++){

            for(int j=0;j<5;j++){
                //isme pehli row or pehla column me star hai
                //or isme 4th row or 4th column me star banana hai
                if(i==0||j==0||i==4||j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    
}
