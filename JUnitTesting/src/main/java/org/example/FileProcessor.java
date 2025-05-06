package org.example;

import java.io.*;

public class FileProcessor {
    String fileName = "file.txt";
    String content = "hello this is raju";
    void writeToFile(String fileName, String content) throws IOException{
        FileWriter fw = new FileWriter(fileName);
        fw.write(content);
        fw.close();
    }
    String readFromFile(String fileName) throws IOException{
        BufferedReader fr = new BufferedReader(new FileReader(fileName));
        String line = fr.readLine();
        return line;
    }
}
