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
	    FileServiceSystem fss = new FileServiceSystem(tfw, tfr);
	    
	    
	    List<Map<String,String>> better = fss.readFile();
	    System.out.println("Before edit:");
	    System.out.println(better.get(0));
	    
	    fss.addLine("10.6", false);
	    fss.addLine("20.6", true);
	    System.out.println("After edits:");
	    better = fss.readFile();
	    System.out.println(better.get(0));	    
	    
	    
	}
	catch(IOException ec){
	    
	}
	
    }
}
