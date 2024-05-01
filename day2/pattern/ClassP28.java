//      A 
//     ABA
//    ABCBA
//   ABCDCBA
//  ABCDEDCBA    
public class ClassP28{
    public static void main(String[] args) {
        int A=65;
        int n=5; 
        for (int i=0;i<n;i++){
            for (int j=0;j<(n-i)-1;j++) {
                System.out.print(" "); 
            }
            for (int j=0;j<=i;j++){
                System.out.print((char)('A' + j)); 
            }
            for (int j=i-1;j>=0;j--) {
                System.out.print((char)('A' + j));
            }
            System.out.println(); 
        }
    }
}
