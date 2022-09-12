public class JavaProgram{
    public static void main(String[] args){
        Integer zero = 0;
        try{
            Integer notZero = 1;
            double resule = notZero/zero;
        } catch(ArithmeticException curExpection){
            System.out.println("На ноль то делить нельзя!");
        }
    }
}