import java.io.BufferedReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JavaProgram{
    public static void main(String[] args){
        File fileDir = new File("PATH_TO_FILE");
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF-8"));
        String str;
    }
}