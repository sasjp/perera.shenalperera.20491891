import java.util.ArrayList;
import java.util.List;

public class CatA {
    String name =  "";
    public static void ben(String name){
        

        System.out.println("Name:" + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase:" + name.toLowerCase());

    }
    public static void ten(String name){
        
        List<Integer> li = new ArrayList<Integer>();

        for(char c: name.toCharArray()){
            if(c < '0' || c > '9'){

            }else{
                li.add(Character.getNumericValue(c));
            }
        }

        System.out.print(li);

        int sum = 0;

        for(int i = 0; i <= li.size(); i++){
            sum += li.get(i);
        }
        System.out.println("sum of :: " +sum);
    }
    public static void parthree(String name){
        String num = "";
        double result;
        try{
            result = Double.parseDouble(num);
            System.out.println("String contains anumber :" + num);
        }catch(NumberFormatException e){
            System.out.println("This String do not contain a number: "+ num);

            return;
        }
    }
    public static void zero(String name){
        //Input =1234Almighty6969Java420;
        //Output -Almighty
        //Output -12345678910123

         
         String name02 = name.replaceAll("[0-9]","");
        
        System.out.println(name02.toUpperCase());
        System.out.println(name02.toLowerCase());
    }
    
}
