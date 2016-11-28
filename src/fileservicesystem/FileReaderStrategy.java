/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservicesystem;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alec
 */
public interface FileReaderStrategy {

    public abstract FileFormatterStrategy getFileFormatterStrategy();

    public abstract String getFilePath();

    public abstract List<Map<String, String>> readFile() throws IOException;

    public abstract void setFileFormatterStrategy(FileFormatterStrategy fss);

    public abstract void setFilePath(String filePath);
    
}
