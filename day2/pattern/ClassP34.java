   
//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******

public class ClassP35 {
    public static void main(String[] args) {
        int n=7; 
        int s=(n/2)*2+1; 
        for (int i=1;i<=n/2+1;i++){
            for (int j=1;j<=(n/2+1)-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n/2;i>=1;i--) {
            for (int j=1;j<=(n/2+1)-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
