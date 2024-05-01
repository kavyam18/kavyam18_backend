
//      1
//     212
//    32123
//   4321234
//    32123
//     212
//      1

public class ClassP38 {
    public static void main(String[] args){
        int n=7; 
        int m=(n/2)+1; 

        for (int i=0;i<m;i++){
            for (int j=0;j<(n-1)-2*i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i*2+1;k++){
                System.out.print(k);
            }
            
            System.out.println();
        }
        for (int i=m-2;i>=0;i--){
            for (int j=0;j<(n-1)-2*i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i*2+1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
