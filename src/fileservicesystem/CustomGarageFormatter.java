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
 * @author aschindler1
 */
public class CustomGarageFormatter {
    private final String TOTAL_HOURS = "totalHours";
    private final String TOTAL_FEES = "totalFees";
    private final String CHAR_SPACER = "\n";
    
    public String encode (List<Map<String,String>> dataFromApp){
        Map<String,String> mapSet = dataFromApp.get(0);
        String sTotalHours = mapSet.get(TOTAL_HOURS);
        String sTotalFees = mapSet.get(TOTAL_FEES);
        return sTotalHours + CHAR_SPACER + sTotalFees + CHAR_SPACER;
    }
    
    public static void main(String[] args) {
        
    }
}
