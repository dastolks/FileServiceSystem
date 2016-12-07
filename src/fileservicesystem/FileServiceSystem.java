/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservicesystem;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author aschindler1
 */
public class FileServiceSystem {
    private FileWriterStrategy fws;
    private FileReaderStrategy frs;
    
    public FileServiceSystem(FileWriterStrategy fw, FileReaderStrategy fr){
	fws = fw;
	frs = fr;
    }
    public final List<Map<String, String>> readFile() throws IOException{
	return frs.readFile();	
    }
    public void addLine(String lineAdded, boolean append) throws IOException{
	fws.addLine(lineAdded, append);
    }
    public void addLine(String lineAdded, String characterInBetween, boolean append) throws IOException{
	fws.addLine(lineAdded, characterInBetween, append);
    }    
}
