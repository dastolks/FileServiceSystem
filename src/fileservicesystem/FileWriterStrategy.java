/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservicesystem;

import java.io.IOException;

/**
 *
 * @author Alec
 */
public interface FileWriterStrategy {

    public abstract void addLine(String lineAdded, boolean append) throws IOException;

    public abstract void addLine(String lineAdded, String characterInBetween, boolean append) throws IOException;

    public abstract FileFormatterStrategy getFileFormatterStrategy();

    public abstract String getFilePath();

    public abstract void setFileFormatterStrategy(FileFormatterStrategy fss);

    public abstract void setFilePath(String filePath);
    
}
