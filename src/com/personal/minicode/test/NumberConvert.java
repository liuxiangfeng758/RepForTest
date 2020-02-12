package com.personal.minicode.test;

import java.util.ArrayList;
import java.util.List;

public class NumberConvert {

	public static String numberConvert(Integer[] numbers) {  		     
	       if(numbers == null || numbers.length == 0){
	    	   return ""; 
	       }
	       //初始化结果集
	       List<String> result =new ArrayList<>();
	       result.add("");
	       String [] btnArray = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};    
	       for(int i =0 ; i < numbers.length ;i++)  
	       {  
		        List<String> res = new ArrayList<>(); 
		        //获取当前数字对应的所有字母
		        String letter = btnArray[numbers[i]];  
		        //遍历已经处理过的列表，取出每一个元素，并和当前数字对应的的每一个字符加起来
		        for(int j = 0 ; j < result.size();j++)  
		        {  
		        	//遍历当前数字对应的所有字符  
		            for(int k = 0; k< letter.length(); k++)
		            {  
		                res.add(result.get(j)+letter.charAt(k));  
		            }  
		        }  
		        result = res;  
	       }  

	       return translateOutput(result);  
	   }  
   
	private static String translateOutput(List<String> result){
		String resultString = "";
		if(result == null || result.size() == 0){
			return resultString;
		}
		for (String letter : result){
			resultString = resultString + letter + " ";
		}
	    return resultString;
   }

}
