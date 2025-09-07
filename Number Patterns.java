public class Main
{
	public static void main(String[] args) {
	    int n=6;
	    // Pattern 1
	    for(int i=1;i<=n;i++){
	        for(int j=n;j>i;j--){
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i;k++){
	            System.out.print(i+" ");
	        }System.out.println();
	    }
	    System.out.println();
	    
	    // Pattern 2
	     
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(j+" ");
	        }System.out.println();
	    }
	    for(int i=0;i<n-1;i++){
	        for(int j=n,k=1;j>i+1;j--,k++){
	            System.out.print(k+" ");
	        }System.out.println();
	    }
	    System.out.println();
	   
	    // Pattern 3
	    int k=1;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(k+" ");
	            k++;
	        }System.out.println();
	    }
	    
	    System.out.println();
	    
	    // Pattern 4 
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            if((i+j)%2!=1){
	                System.out.print("1 ");
	            }else{
	                System.out.print("0 ");
	            }
	       }System.out.println();
	    }
	    System.out.println();
	    
	    // Pattern 5
	    for(int i=1;i<=n;i++){
	        for(int j=n;j>i;j--){
	            System.out.print("  ");
	        }
	        for(int l=i;l>=1;l--){
	            System.out.print(l+" ");
	        }
	        for(int m=2;m<=i;m++){
	            System.out.print(m+" ");
	        }
	        System.out.println();
	    }
	    System.out.println();
	    
	    // Pattern 6
	    for(int i=0;i<n;i++){
	        for(int j=0;j<i;j++){
	            System.out.print(" ");
	        }for(int m=n,l=i+1;m>i;m--,l++){
	            System.out.print(l+" ");
	        }
	        System.out.println();
	    }
	    
	    for(int i=n;i>1;i--){
	        for(int j=i;j>2;j--){
	            System.out.print(" ");
	        }for(int m=i-1,l=i;m<=n;m++,l++){
	            System.out.print(m+" ");
	        }
	        System.out.println();
	    }
	    System.out.println();
	    
	  }
}


OUTPUT:

     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 

          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6 

1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
    5 6 
   4 5 6 
  3 4 5 6 
 2 3 4 5 6 
1 2 3 4 5 6 