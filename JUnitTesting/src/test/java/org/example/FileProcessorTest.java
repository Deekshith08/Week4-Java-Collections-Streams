package org.example;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {
    FileProcessor file = new FileProcessor();
    String fileName = "test.txt";
    String content = "new content";
    @Test
    void testWriteAndRead() throws IOException{
        file.writeToFile(fileName,content);
        String res = file.readFromFile(fileName);
        assertEquals(content,res);
    }
    @Test
    void testFileExists(){
        File f = new File(fileName);
        assertTrue(f.exists(),"File doesn't exists");
    }
    @Test
    void testReadNonExistentFile(){
        assertThrows(IOException.class, ()->file.readFromFile("fie.txt"));
    }
}