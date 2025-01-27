package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class JsonFileStorage implements FileStorage {
    @Override
    public void storeFile(File inputFile, String outputFilePath) throws IOException {
        String content= Files.readString(inputFile.toPath());
        String jsonContent = "{ \"content\": \"" + content.replace("\n", "\\n").replace("\"", "\\\"") + "\" }";
        try(FileWriter fileWriter=new FileWriter(outputFilePath)){
            fileWriter.write(jsonContent);

        }
        System.out.println("File converted and saved as JSON: " + outputFilePath);
    }
}
