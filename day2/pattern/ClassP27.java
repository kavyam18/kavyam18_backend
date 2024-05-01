//      1
//     1*2
//    1*2*3
//   1*2*3*4
//  1*2*2*4*5   

 public class ClassP27 {
    public static void main(String[] args) {
        int n=5; 
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" "); 
            }
            for (int j=1;j<=i;j++){
                if (j== i||j==1||i==n){
                    System.out.print(j + " ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(); 
        }
    }
}
