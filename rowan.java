import java.util.Scanner;

public class rowan {
    public static void main(String[] args){
        int myFizz = 0;
        while (myFizz < 100){
        myFizz++;

            System.out.println(myFizz);
            if(myFizz % 3 == 0 && myFizz % 5 == 0){
                System.out.println("FIZZBUZZ");
            } else if(myFizz % 3 == 0){
                System.out.println("FIZZ");
            } else if(myFizz % 5 == 0){
                System.out.println("BUZZ");
            } else{
                System.out.println("huh");

            
            }





        }
        
        
        
    }

    
}