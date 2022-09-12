import java.util.Scanner;

public class JavaProgram{
    public static void main(String[] args){
        Scanner inputInt = new Scanner(System.in);
        System.out.print("Input num:");
        Integer Int_my = inputInt.nextInt();
        try{
            Integer notZero = 1;
            double result = notZero/Int_my;
        } catch(ArithmeticException curExpection){
            System.out.println("На ноль то делить нельзя!");
        }
    }
}