package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileStorage {
    void storeFile(File inputFile, String outputFilePath)throws IOException;


}
