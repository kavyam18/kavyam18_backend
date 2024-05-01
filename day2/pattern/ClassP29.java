//     A
//    BAB
//   CBABC
//  DCBABCD
// EDCBABCDE

public class ClassP29 {
    public static void main(String[] args) {
        int n=5; 
        for (int i=0;i<n;i++){
            for (int j=0;j<(n-i)-1;j++){
                System.out.print(" "); 
            }
            for (int j=0;j<=i;j++){
                System.out.print((char)('a' + i - j)); 
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)('a' + j + 1)); 
            }
            System.out.println(); 
        }
    }
}


