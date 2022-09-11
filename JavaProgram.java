import java.util.Scanner;

public class JavaProgram{
    public static void main(String[] args){
        function();
    }
    public static void function(){
        Integer constant = 4;
        for (int i = 0; i<5; i++){
            Scanner in = new Scanner(System.in);
            Integer inInteger = in.nextInt();
            System.out.println(inInteger.equals(constant));
            if (inInteger.equals(constant)){
                break;
            }
        }
    }
}
