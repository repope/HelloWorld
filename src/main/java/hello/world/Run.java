package hello.world;

import java.io.*;

public class Run {



    public Run() {

    }


    void fast(String... args) throws IOException {

        System.out.println("whoa whoa");
    }



    public static void main(String...args) throws IOException {
        new Run().fast(args);
    }
}
