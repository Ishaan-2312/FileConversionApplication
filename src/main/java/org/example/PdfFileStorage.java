package org.example;



import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class PdfFileStorage  implements FileStorage {
    @Override
    public void storeFile(File inputFile, String outputFilePath) throws IOException {
        String content = Files.readString(inputFile.toPath());
// Create the PDF Conversion logic as per latest implementation of PdfWriter

        PdfWriter pdfWriter = new PdfWriter(outputFilePath);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);


        Document document = new Document(pdfDocument);


        document.add(new Paragraph(content));


        document.close();

        System.out.println("File successfully converted and saved as PDF: " + outputFilePath);
    }



        }


