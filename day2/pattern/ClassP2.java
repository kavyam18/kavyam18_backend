package day2.pattern;

// aaaaa
// bbbbb
// ccccc
// ddddd
// eeeee

public class ClassP2 {

	public static void main(String[] args) {
		int a=65;
        int n=5;
        for(int i=0;i<=n;i++) {
        	for(int j=0;j<=n;j++) {
        		System.out.print((char)(a+i));
        	}
        	System.out.println();
        }

	}

}
