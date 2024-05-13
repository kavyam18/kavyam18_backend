package day7;

public class AssesmentProgram {

	

		public static void main(String[] args) {
			int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {3, 4, 5, 6, 7, 8};
	        int res = 0;
	        int[] arr3 = new int[arr1.length + arr2.length];
	        for (int i = 0; i < arr1.length; i++) {
	            arr3[res] = arr1[i];
	            res++;
	        }
	        for (int i = 0; i < arr2.length; i++) {
	            arr3[res] = arr2[i];
	            res++;
	        }
	        for(int i=0;i<arr3.length-1;i++){
	        	for(int j=0;j<arr3.length-1;j++) {
	        		if(arr3[i]<arr3[j]) {
	        			int temp = arr3[j];
	        			arr3[j] = arr3[i];
	        			arr3[i] = temp;
	        		}
	        	}
	        	
	        }
	        for(int i =0;i<arr3.length;i++) {
	            System.out.println(arr3[i]);
	    }
//			Output: 1 2 3 2 1
//			        1 2   2 1 
//			        1       1
			int n=3;
			for(int i=n;i>0;i--) {
				for(int j=1;j<n*2;j++) {
					if(j<=i) {
						System.out.print(j+" ");
					}else if(n*2-j<=i) {
						System.out.print(n*2-j+" ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			
//			int n=3;
//			int x=n,y=n;
//			for(int i=1;i<n;i++) {
//				for(int j=1;j<n*2;j++) {
//					if(j<=x) 
//					{
//					System.out.print(j+"");
//				    }
//					else if(j>=y)
//					{
//					System.out.print(n*2-j+" ");
//				    }else {
//					System.out.print(" ");
//				}	
//				}
//				System.out.println();
//				x--;
//				y++;
				
			}

	
	}

