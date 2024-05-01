
// 1234321
//  23432
//   343
//    4
//   343
//  23432
// 1234321 
public class ClassP36 {
    public static void main(String[] args) {
        int n=7;
        int m=(n/2)+1; 
        for (int i=1;i<=m;i++) {
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=i;k<=n-(i-1);k++){
                System.out.print(k);
            }
            for (int l=n-(i-2);l>=i;l--){
                System.out.print(l);
            }
            System.out.println();
        }
        for (int i=m-1;i>=1;i--){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=i;k<=n-(i-1);k++){
                System.out.print(k);
            }
            for (int l=n-(i-2);l>=i;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
