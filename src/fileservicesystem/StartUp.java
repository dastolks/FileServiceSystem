/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservicesystem;

import java.io.*;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alec
 */
public class StartUp {
    public static void main(String[] args) {
	try{
	    FileWriterStrategy tfw = new TextFileWriter(new CustomGarageFormatter(), "src" + File.separatorChar + "CustomGarageFormat.txt");
	    FileReaderStrategy tfr = new TextFileReader(new CustomGarageFormatter(), "src" + File.separatorChar + "CustomGarageFormat.txt");
	    List<Map<String,String>> better = tfr.readFile();
	    System.out.println(better.get(0));
	    
	    tfw.addLine("20.6", false);
	    tfw.addLine("10.6", true);
	    
	    better = tfr.readFile();
	    System.out.println(better.get(0));	    
	    
	}
	catch(IOException ec){
	    
	}
	
    }
}
