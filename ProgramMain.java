import java.util.Scanner;

public class ProgramMain{
    public static void main(String[] args){
        System.out.println("Hello, world!");
        System.out.println("Input some name:");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        System.out.println("Your name is "+name+".");
        ProgramImport examplar = new ProgramImport(name);
        System.out.println("Ваше имя: "+examplar.oneConstant);
    }
}