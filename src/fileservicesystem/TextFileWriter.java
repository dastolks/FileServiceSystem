/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservicesystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alec
 */
public class TextFileWriter implements FileWriterStrategy {
    private FileFormatterStrategy fss;
    private String filePath;

    public TextFileWriter(String filePath) {
       setFilePath(filePath);
    }

    public TextFileWriter(FileFormatterStrategy fss, String filePath) {
        setFileFormatterStrategy(fss);
        setFilePath(filePath);
    }
    
    @Override
    public void addLine(String lineAdded, boolean append) throws IOException{
	File data = new File(filePath);
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));
	out.println(lineAdded);
	out.close();
    }
    @Override
    public void addLine(String lineAdded, String characterInBetween, boolean append) throws IOException{
	File data = new File(filePath);
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));
	out.println(lineAdded + characterInBetween);
	out.close();
    }
    
    @Override
    public FileFormatterStrategy getFileFormatterStrategy() {
        return fss;
    }

    @Override
    public void setFileFormatterStrategy(FileFormatterStrategy fss) {
        if(fss == null){
            throw new IllegalArgumentException();
        }
        else{
            this.fss = fss;
        }
        
    }

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public void setFilePath(String filePath) {
        if(filePath == null || filePath.length() == 0){
            throw new IllegalArgumentException();
        }
        else{
            this.filePath = filePath;
        }
    }   
       
}
