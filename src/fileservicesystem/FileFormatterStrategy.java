/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservicesystem;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Alec
 */
public interface FileFormatterStrategy {

    public abstract List<Map<String, String>> decode(List<String> dataFromFile);

    public abstract String encode(List<Map<String, String>> dataFromApp);
    
}
