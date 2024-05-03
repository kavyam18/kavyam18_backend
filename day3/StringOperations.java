public class StringOperations{
    //isPalindrome
    public void isPalindrome(String str){
        
	    String revstr = new String(newarr);
	    if(str.equals(revstr))
	       {
		System.out.println("True:String is palindrome");
	      }
	     else
	      {
		System.out.println("False:String is not palindrome");
	      }
     System.out.println();
	}
    }

    //CountEachCharacter
public void countCharacter(int[] count){
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


//isPanagram
public static void isPanagaram(String str){
    int[] freq = new int[26];
    str=str.toUppercase();
    for(int i=0;i<str.length();i++){
        freq[str.charAt(i)-65]++;
    }
    for(int i=0;i<freq.length;i++){
        if(freq[i]==0){
        return false;
        }else{
        return true;
        }
    }

//main method
public static void main(String[] args) {
//CountEachCharacter
//     String str;  
// int i, len;  
// int count[] = new int[256];  
// Scanner scanner = new Scanner(System.in);  
// System.out.print("Please enter a string: ");   
// str = scanner.nextLine();  
// len = str.length(); 

        //        Panagram
        // String str="john";
        // StringOperations so = new StringOperations();
        // System.out.println(so.isPanagaram(str));


	    String str = "EYE";
	    char[] arr = str.toCharArray();
	    char[] newarr = new char[arr.length];
        int j = arr.length-1;
        for(int i=0;i<=arr.length-1;i++)
	    {
	    	newarr[j] = arr[i];
	    	j--;
	    }
        StringOperations so = new StringOperations();
        so.isPalindrome(str);
        System.out.println(so.isPanagaram(str));
        so.countCharacter()

}