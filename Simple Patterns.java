// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n=5;
	
	// Pattern 1
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<=4;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("*********************");
	
	// Pattern 2
        for (int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }for(int k=0;k<4;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("*********************");
	
	// Pattern 3
        for(int i=0;i<4;i++){
            for(int k=0;k<i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<6;j++){
                System.out.print("* ");
            }System.out.println();
        }System.out.println("*********************");
	
	// Pattern 4
        for(int i=4;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<4;k++){
                System.out.print(" *");
            }
            System.out.println();  
            
        }System.out.println("*********************");
        
	// Pattern 5
	int num1 = 5;
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
              System.out.print("  ");
            }for(int l=(num1*2)-1;l>=1;l--){
                if(l==(num1*2)-1 || l==1 || i==0){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }num1--;
            System.out.println( );
        }
        System.out.println("*********************");
        
	// Pattern 6
	int num = n;
        for(int i=0;i<=n*2-1;i++){
            if(i<n){
                for(int j=0;j<i;j++){
                   System.out.print("*"); 
                }
            }else{
                for(int j=num;j>0;j--){
                    System.out.print("*");
                }num--;
            }
            System.out.println();
        }
        System.out.println("*********************");
        
	// Pattern 7
	int number = n;
        for(int i=1;i<5;i++){
            for(int j=n;j>i;j--){
              System.out.print("  ");
            }for(int l=1;l<=(i*2)-1;l++){
                    System.out.print(" *");
            }
            System.out.println();
       }
        
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
              System.out.print("  ");
            }for(int l=(number*2)-1;l>=1;l--){
                    System.out.print(" *");
            }number--;
            System.out.println();
       }
    }
}

   
OUTPUT:

* * * * * 
  * * * * 
    * * * 
      * * 
        * 
*********************
* * * * 
  * * * * 
    * * * * 
      * * * * 
        * * * * 
*********************
* * * * * * 
  * * * * * * 
    * * * * * * 
      * * * * * * 
*********************
       * * * *
     * * * *
   * * * *
 * * * *
*********************
 * * * * * * * * *
   *           *
     *       *
       *   *
         *
*********************
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
*********************
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *      