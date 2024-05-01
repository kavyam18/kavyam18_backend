// 543212345
//  4321234
//   32123
//    212
//     1

    public class CLassP32 {
    public static void main(String[] args) {
        int n=5; 
        int k=n;
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" "); 
            }
            for (int j=0;j<n-i;j++){
                System.out.print(k);
                k--;
            }
            k=n-i;
            for (int j=1;j<=n-i;j++){
                System.out.print(j); 
            }
            System.out.println(); 
        }
    }
}








  










