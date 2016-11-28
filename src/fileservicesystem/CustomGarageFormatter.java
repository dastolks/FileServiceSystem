/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservicesystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author aschindler1
 */
public class CustomGarageFormatter implements FileFormatterStrategy {
    private final String TOTAL_HOURS = "totalHours";
    private final String TOTAL_FEES = "totalFees";
    private final String CHAR_SPACER = "\n";
    
    public CustomGarageFormatter(){
        
    }
    
    @Override
    public String encode (List<Map<String,String>> dataFromApp){
        Map<String,String> mapSet = dataFromApp.get(0);
        String sTotalHours = mapSet.get(TOTAL_HOURS);
        String sTotalFees = mapSet.get(TOTAL_FEES);
        return sTotalHours + CHAR_SPACER + sTotalFees + CHAR_SPACER;
    }
    
    @Override
    public List<Map<String,String>> decode (List<String> dataFromFile){
        String sTotalHours = dataFromFile.get(0);
        String sTotalFees = dataFromFile.get(1);        
        List<Map<String,String>> appInfo = new ArrayList<>();
        Map<String,String> record = new HashMap<>();
        
        record.put("totalFees", sTotalFees);
	record.put("totalHours", sTotalHours);
        appInfo.add(record);
        return appInfo;
    }
    
    public static void main(String[] args) {
        CustomGarageFormatter cgf = new CustomGarageFormatter();
        List<Map<String,String>> testMap = new ArrayList<>();
        Map<String, String> record = new HashMap<>();
        record.put("totalHours", "20.5");
        record.put("totalFees", "26.80");
        testMap.add(record);
        System.out.println(cgf.encode(testMap));
        
        
        
    }
}
