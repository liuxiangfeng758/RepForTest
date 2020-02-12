package com.personal.minicode.test;

import java.util.ArrayList;
import java.util.List;

public class NumberConvert {

	public static String numberConvert(Integer[] numbers) {  		     
	       if(numbers == null || numbers.length == 0){
	    	   return ""; 
	       }
	       //��ʼ�������
	       List<String> result =new ArrayList<>();
	       result.add("");
	       String [] btnArray = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};    
	       for(int i =0 ; i < numbers.length ;i++)  
	       {  
		        List<String> res = new ArrayList<>(); 
		        //��ȡ��ǰ���ֶ�Ӧ��������ĸ
		        String letter = btnArray[numbers[i]];  
		        //�����Ѿ���������б�ȡ��ÿһ��Ԫ�أ����͵�ǰ���ֶ�Ӧ�ĵ�ÿһ���ַ�������
		        for(int j = 0 ; j < result.size();j++)  
		        {  
		        	//������ǰ���ֶ�Ӧ�������ַ�  
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
