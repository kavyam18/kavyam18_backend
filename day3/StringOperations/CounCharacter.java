import java.util.Scanner;

public class CountCharacter 
{  
public static void main(String args[])   
{  
String str;  
int i, len;  
int count[] = new int[256];  
Scanner scanner = new Scanner(System.in);  
System.out.print("Please enter a string: ");   
str = scanner.nextLine();  
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
}  