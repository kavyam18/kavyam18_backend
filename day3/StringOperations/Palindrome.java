public class Palindrome {

	public static void main(String[] args) {

	    String str = "EYE";
	    char[] arr = str.toCharArray();
	    char[] newarr = new char[arr.length];
	    int j = arr.length-1;
	    for(int i=0;i<=arr.length-1;i++)
	    {
	    	newarr[j] = arr[i];
	    	j--;
	    }
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
