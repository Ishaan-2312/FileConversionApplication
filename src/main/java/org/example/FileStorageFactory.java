package org.example;


    public class FileStorageFactory {
        public static FileStorage getFileStorage(String fileType) {
            switch (fileType.toLowerCase()) {
                case "txt":
                    return new TxtFileStorage();
                case "json":
                    return new JsonFileStorage();
                case "pdf":
                    return new PdfFileStorage();
                default:
                    throw new IllegalArgumentException("Unsupported file type: " + fileType);
            }
        }
    }

