package bajpai.edu.testskills;

import java.io.BufferedReader;
import java.util.*;

class RemoveCommentsFromCPPFileVolterra {
    public static void removeComments(String[] source) {
        boolean inBlock = false;
        StringBuilder newline = new StringBuilder();
        List<String> ans = new ArrayList();
        for (String line: source) {
            int i = 0;
            char[] chars = line.toCharArray();
            if (!inBlock) newline = new StringBuilder();
            while (i < line.length()) {
                if (!inBlock && i+1 < line.length() && chars[i] == '/' && chars[i+1] == '*') {
                    inBlock = true;
                    i++;
                } else if (inBlock && i+1 < line.length() && chars[i] == '*' && chars[i+1] == '/') {
                    inBlock = false;
                    i++;
                } else if (!inBlock && i+1 < line.length() && chars[i] == '/' && chars[i+1] == '/') {
                    break;
                } else if (!inBlock) {
                    newline.append(chars[i]);
                }
                i++;
            }
            if (!inBlock && newline.length() > 0) {
                ans.add(new String(newline));
            }
        }
        System.out.println(ans);
    }
    
    public static void removeCommentsSubmittedProgramFixed(String[] source) {
        Boolean isMultiLineComment = false;
        StringBuilder result = new StringBuilder("");
        
       List<String> res = new ArrayList();
        for(String input : source){
        	if (!isMultiLineComment)
        		result = new StringBuilder("");
        	int i = 0;
         //System.out.println(input+"####");
            while(i < input.length()){
            //  System.out.print(i);
            	if(!isMultiLineComment && i+1 < input.length()  && input.charAt(i) == '/' && input.charAt(i+1) == '*')
              {
                      isMultiLineComment = true;
                      i++;
              }else if(isMultiLineComment && i+1 < input.length()   && input.charAt(i) == '*' && input.charAt(i+1) == '/')
                      {
                          isMultiLineComment = false;
                          i++;
                      }
                      else if(!isMultiLineComment && input.charAt(i) == '/' && i+1 < input.length() && input.charAt(i+1) == '/')
                           break;
                        else
                            if(!isMultiLineComment)
                              result.append(input.charAt(i));
          i++;
        }
          if(!isMultiLineComment && result.length() >0)
            res.add(new String(result));
      }
        System.out.print(res.toString());
    }
    
    public static void main(String args[])
    {
    	removeCommentsSubmittedProgramFixed(new String[] {
    		"/* ashdauid aud audasd gasdasgda"
    		,"ashdashd  iasdh */"
    		, "#sdhfsf "
    		,"//usuif u sdfsufd "
    		,""
    	});
    	
    	System.out.println("\n\n###############################################################################\n");    	
    	removeComments(new String[] {
        		"/* ashdauid aud audasd gasdasgda"
        		,"ashdashd  iasdh */"
        		, "#sdhfsf "
        		,"//usuif u sdfsufd "
        		,""
        	});
    }
    
}





