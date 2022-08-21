public class MainProgram {
    public static void main(String[] args){
        Popuguy cacadu = new Popuguy("red", 1, 2);
        System.out.println("Papugui:color "+cacadu.color+", size "+cacadu.size);
        System.out.println("He is "+cacadu.age+" years old");
        Integer agePlus = cacadu.age+1;
        System.out.println("He will "+agePlus+" years old year later");
        System.out.println("Add code on GitHub");
    }
}
