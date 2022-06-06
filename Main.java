import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String args[]){
        int choice;
        String input;
        String order;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome!!! MENU");
        System.out.println("1.. Converting a given string to upper case or lower case");
        System.out.println("2.. Identify whether numeric values are in a given string");
        System.out.println("3..Identify whether a given string is a valid number or not"); 
        System.out.println("4..Remove  numeric values  string and then convert the string to uppercase or lower Case.");
        System.out.println("5. a length given in meters to feet and vice versa and centimeter to inches and vice versa.");
        System.out.println("6.kilograms to pounds and vice versa, and mass given in milligram to ounce and vice versa.");
        System.out.println("7.hours to minutes and vice versa, and time given in minutes to seconds and vice versa.");

        System.out.println("Enter choice( 1-7:");
        
        Scanner sd = new Scanner(System.in); 
        choice = sd.nextInt();

         String name = sc.nextLine();

        
        switch (choice) {
            case 1:

            CatA.ben(name);
                
               break;
        
            case 2:

                CatA.ten(name);

                break;

            case 3:

                CatA.parthree(name);
            
            case 4:

                CatA.zero(name);
         
            break;
        
            case 5:
                 Cat2Pa.dom(name);

        break;
        
            case 6:
                Cat2Pa.set(name);
            break;

        

            case 7:

            Cat2Pa.leo(name);
            break;

            default:

            
            System.out.println("ERRORR");

            break;

        }
        
    }
}
