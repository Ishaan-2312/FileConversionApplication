package org.example;

import java.io.*;
import java.nio.file.Files;

public class TxtFileStorage implements FileStorage{


    @Override
    public void storeFile(File inputFile, String outputFilePath) throws IOException {
        String content= Files.readString(inputFile.toPath());
        try(FileWriter fileWriter=new FileWriter(outputFilePath)){
            fileWriter.write(content);
        }
        System.out.println("File converted and saved as TXT: " + outputFilePath);
    }
}
