/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservicesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alec
 */
public class TextFileReader implements FileReaderStrategy {
    private FileFormatterStrategy fss;
    private String filePath;

    public TextFileReader(String filePath) {
       setFilePath(filePath);
    }

    public TextFileReader(FileFormatterStrategy fss, String filePath) {
        setFileFormatterStrategy(fss);
        setFilePath(filePath);
    }

    @Override
    public List<Map<String,String>> readFile() throws IOException{
        File dataToRetrieve = new File(filePath);
        BufferedReader in = new BufferedReader(new FileReader(dataToRetrieve));
        List<String> lines = new ArrayList<>();
	String line = in.readLine();
	while(line != null){
            lines.add(line);
            line = in.readLine();  // strips out any carriage return chars
	}
        return fss.decode(lines);      
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
