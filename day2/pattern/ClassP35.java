
// 1234321
//  12321
//   121
//    1
//   121
//  12321
// 1234321

public class ClassP54 {
    public static void main(String[] args){
        int n=7; 
        for (int i=1;i<=n/2+1;i++){
            for (int j=1;j<i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=n-2*(i-1);k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i=n/2;i>=1;i--){
            for (int j=1;j<i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=n-2*(i-1);k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
