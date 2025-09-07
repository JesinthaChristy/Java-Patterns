public class Main
{
	public static void main(String[] args) {
		int n=7;
		int num=n;
		for(int i=0;i<n;i++){
		    for(int j=0;j<=i;j++){
		        System.out.print("*");
		    }
		    for(int k=num*2-1;k>1;k--){
		        System.out.print(" ");
		    }num--;
		    for(int l=0;l<=i;l++){
		        System.out.print("*");
		    }
		    System.out.println();
		} num = 1;
		
		for(int i=n;i>0;i--){
		    for(int j=i;j>0;j--){
		        System.out.print("*");
		    }
		    if(num<=n){
		      for(int k=1;k<num*2-1;k++){
		        System.out.print(" ");
		      } num++; 
		    }
		    for(int l=i;l>0;l--){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		num = n;
			for(int i=0;i<n;i++){
		    for(int j=0;j<=i;j++){
		        System.out.print("*");
		    }
		    for(int k=num*2-1;k>1;k--){
		        System.out.print(" ");
		    }num--;
		    for(int l=0;l<=i;l++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
	}
}


OUTPUT:

*            *
**          **
***        ***
****      ****
*****    *****
******  ******
**************
**************
******  ******
*****    *****
****      ****
***        ***
**          **
*            *
*            *
**          **
***        ***
****      ****
*****    *****
******  ******
**************


