/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservicesystem;

import java.io.File;

/**
 *
 * @author aschindler1
 */
public class FileServiceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String filePath = "src" + File.separatorChar + "CustomGarageFormat.txt";
       FileFormatterStrategy frf = new CustomGarageFormatter();
       
    }
    
}
