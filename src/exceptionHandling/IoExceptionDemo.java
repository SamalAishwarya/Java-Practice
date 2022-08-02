package exceptionHandling;

import java.io.File;

public class IoExceptionDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
       // IOException
       // file.createNewFile();   //checked Exception  (compile time exception)
    }
}
