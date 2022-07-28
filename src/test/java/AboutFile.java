import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AboutFile {
    public static void main(String[] args) throws IOException {
        BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
        String s;


        System.out.flush();
        s=b.readLine();
        System.out.println("String is "+s);
    }
}
