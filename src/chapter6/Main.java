package chapter6;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        int a = in.read(); //1byte, ASCII
        System.out.println(a);
    }
}
