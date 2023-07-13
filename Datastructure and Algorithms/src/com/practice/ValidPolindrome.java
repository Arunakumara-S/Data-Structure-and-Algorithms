package com.practice;

public class ValidPolindrome {
	public static void main(String args[]) {
		String s="A man, a plan, a canal: Panama";
//		s=s.replace(",", " ");
//		s=s.replace(" ", "");
//		s=s.replace(":", "");
//		s=s.replaceAll("\\s", " ");
//		String str = "Hello+-^Java+ -Programmer^ ^^-- ^^^ +!";  
//		str = str.replaceAll("[,:]", ""); 
//		str=str.toLowerCase().replace(" ","" );
//		String s="";
//		System.out.println(str);
//		for(int i=str.length()-1;i>=0;i--) {
//			s=s+str.charAt(i);
//		}
//		if(str.equals(s))
//		{
//			boolean bool = true;
//			return bool;
//		}
		
//		System.out.println(s);
		 s=s.replaceAll("[,:]","");
	        s=s.replaceAll(" ","");
	        String str = "";
	        System.out.println(s);
	        for(int i=s.length()-1;i>=0;i--){
	            str=str+s.charAt(i);
	        }
	        System.out.println(str);
	        if(str.equals(s)){
//	            bool=true;
	        	System.out.println("True");
	        }
	}

}
