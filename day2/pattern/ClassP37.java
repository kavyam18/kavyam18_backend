
// 4321234
//  32123
//   212
//    1
//   212
//  32123
// 4321324

public class ClassP37 {
    public static void main(String[] args) {
        int n=7; 
        int m=(n/2)+1;  
        for (int i=0;i<m;i++){
            for (int j=0;j<i*2;j++){
                System.out.print(" ");
            }
            for (int k=n-i;k>=i+1;k--){
                System.out.print(k);
            }
            for (int l=i+1;l<=n-i;l++){
                System.out.print(l);
            }
            System.out.println();
        for (int i=m-2;i>=0;i--){
            for (int j=0;j<i*2;j++){
                System.out.print(" ");
            }
            for (int k =n-i;k>=i+1;k--){
                System.out.print(k);
            }
            for (int l=i+1;l<=n-i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
}