package com.jap.ballad;

import java.io.*;

public class Ballad {
    public static void main(String[] args) {
        Ballad ballad = new Ballad();
        ballad.readPoemFromAFile("src/main/resources/ballad.txt");
    }

    public String readPoemFromAFile(String fileName) {
        String result = "";
        //noinspection //ReassignedVariable
        // Write the logic to read from a file
        try (FileReader reader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result = result.concat(line + "\n");
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return result;
    }
}