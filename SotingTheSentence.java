import java.util.*;
class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        // Spliting the Numbers from the string
        for(String str : s.split(" ")){
            int lastIndex = str.length() - 1;
            int index = str.charAt(lastIndex)-'0';
            String ActualWord = str.substring(0, lastIndex);
            map.put(index, ActualWord);   
        }      
        
        //Building the Actual string
        
        StringBuilder ActualString = new StringBuilder();
        for(Map.Entry<Integer, String> indexWord : map.entrySet()){
            ActualString.append(indexWord.getValue());
            ActualString.append(" ");
        }
        return ActualString.toString().trim();
    }
}
