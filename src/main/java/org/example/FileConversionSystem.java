package org.example;

import java.io.File;
import java.io.IOException;

public class FileConversionSystem {
    public static void main(String[] args) {
        //Can use Scanner for User Input or Spring Boot for Web Application
        String inputFilePath = "C:\\Users\\acer\\Desktop\\Alumni sponsoeship.txt";
        String outputFormat = "txt";
        String outputFilePath = "C:\\Users\\acer\\Desktop\\shared_file.txt";

        try {
            File inputFile = new File(inputFilePath);

            if (!inputFile.exists()) {
                System.out.println("Input file does not exist: " + inputFilePath);
                return;
            }


            FileStorage fileStorage = FileStorageFactory.getFileStorage(outputFormat);


            fileStorage.storeFile(inputFile, outputFilePath);
        } catch (IOException e) {
            System.err.println("Error during file conversion: " + e.getMessage());
        }
    }
    }

