package uk.gov.insolvency.inssdev.applicationservices.b3test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    /**
     * A static method to return the contents of input.txt from the current directory, to act as a development
     * placeholder for data input.
     *
     * You don't need to improve this method if you don't want to, but you're welcome to change how data is read in
     * from input.txt if you like.
     *
     * @return  a string containing the full contents of input.txt
     */
    private static String inputData() {
        Path dataPath = Paths.get("./input.txt");
        try {
            return Files.readString(dataPath, StandardCharsets.US_ASCII);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Done");
    }
}
