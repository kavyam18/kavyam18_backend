public class ReverseString {

	public static void main(String[] args) {
		
    //   String str = "Kavya";
    //   for(int i=str.length()-1;i>=0;i--)
    //   {
    // 	  System.out.print(str.charAt(i));
    //   }
	// }

	    String str = "Kavya";
	    char[] arr = str.toCharArray();
	    char[] newarr = new char[arr.length];
	    int j = arr.length-1;
	    for(int i=0;i<=arr.length-1;i++)
	    {
	    	newarr[j] = arr[i];
	    	j--;
	    }
	    String revstr = new String(newarr);
	    System.out.println("Original String is:"+str);
	    System.out.println("Reversed String is :"+revstr);
	}
}


