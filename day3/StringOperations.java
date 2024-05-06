package day3;

import java.util.Arrays;

public class StringOperations {
	
//Palindrome
	public static boolean isPalindrome(String str) {

		String s1 = reverse(str);
		return str.equals(s1);
	}
//Reverse String
	public static String reverse(String str) {
		String str1 = "";
		char[] arr = str.toCharArray();
		for (int i = 0; i <= arr.length - 1; i++) {
			str1 = arr[i] + str1;
		}
		return str1;
	}
	
	//Panagram
	public static boolean isPanagaram(String str){
	    int[] freq = new int[26];
	    str=str.toUpperCase();
	    for(int i=0;i<str.length();i++){
	        freq[str.charAt(i)-65]++;
	    }
	    for(int i=0;i<freq.length;i++){
	        if(freq[i]==0){
	        return false;
	        }
	       
	        }
	    return true;
	    }

	//CountWords
	public static int count(String str)  
    {  
      int count=0;  
        char ch[]= new char[str.length()];     
        for(int i=0;i<str.length();i++)  
        {  
            ch[i]= str.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  
	//CountVowels
	public static int countVowels(String str) {
	  str = str.toLowerCase();
      int count = 0;
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'
            || str.charAt(i) == 'u') 
            {
            count++;
        }
    }
    return count;
}
	//CountEachCharacter
	public static void countCharacter(String str) {
		int i, len;  
		int count[] = new int[256];  
		len = str.length();  
		for (i = 0; i < len; i++)   
		{  
		count[(int) str.charAt(i)]++;  
		}  
		for (i = 0; i < 256; i++)   
		{  
		if (count[i] != 0)   
		{  
		System.out.println((char) i + " --> " + count[i]);  
		}  
		}  
		}  
	
	//CheckAllVowels
	public static boolean checkAllVowels(String str) {
        str = str.toLowerCase();
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' && ch == 'e' && ch == 'i' && ch == '0' && ch == 'u') 
            {
             found=true;
        }
        
    }
        return found;
	}
	
	//Anagram
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() == str2.length()) {
		      char[] charArray1 = str1.toCharArray();
		      char[] charArray2 = str2.toCharArray();
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);
		      boolean result = Arrays.equals(charArray1, charArray2);
		      if(result) {
		        return true;
		      }
		    }
		return false;
	}
	//main
	public static void main(String[] args) {

		String str = "EYE";
		String str1 = "EYEr";
		String str2 = "EYEf";
		System.out.println(reverse(str));
		System.out.println(isPalindrome(str));
		System.out.println(isPanagaram(str));
		System.out.println(count(str));
		System.out.println(countVowels( str));
		countCharacter(str);
		System.out.println(checkAllVowels(str));
		System.out.println(isAnagram( str1, str2));
	}

}
