import java.util.Scanner;


public class InteractRunner {

    public static void main(String [] arg){
        Scanner reader = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String exit = "no";
            String saveResult  = "no";
            while(!exit.equals("yes")){
                String first;
                if (!saveResult.equals("yes")) {
                    calc.cleanResult();
                    System.out.println("Enter first arg : ");
                     first = reader.next();
                } else {
                    first = Double.toString(calc.getResult());
                }

                System.out.println("Enter second arg : ");
                String second = reader.next();

                System.out.println("type of manipulation : '+' '-' '*' '/' '^' ");
                String manipulation = reader.next();
                if (manipulation.equals("+")) calc.add(Double.valueOf(first),Double.valueOf(second));
                else if (manipulation.equals("-")) calc.subtraction(Double.valueOf(first),Double.valueOf(second));
                else if (manipulation.equals("*")) calc.multiplication(Double.valueOf(first),Double.valueOf(second));
                else if (manipulation.equals("/")) calc.division(Double.valueOf(first),Double.valueOf(second));
                else if (manipulation.equals("^")) calc.involution(Double.valueOf(first),Double.valueOf(second));
                else System.out.println("error");


                System.out.println("REsult : " + calc.getResult());

                System.out.println("exit : yes/no");
                exit = reader.next();
                System.out.println("save result : yes/no");
                saveResult = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}