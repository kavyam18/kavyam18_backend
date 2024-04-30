package day2.pattern;

public class ClassP1 {

	public static void main(String[] args) {
        int a=65;
        int n=5;
        for(int i=0;i<=n-1;i++) {
        	for(int j=0;j<=n;j++) {
        		System.out.print((char)(a+j));
        	}
        	System.out.println();
        }

	}

}
