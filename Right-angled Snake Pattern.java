public class Main
{
	public static void main(String[] args) {
		int n=5;		
		System.out.println();
	    	int k=1;
        	for(int i=1;i<=n;i++){        
        	if(i%2==0){
              		int s = k+i;
                	for(int j=1;j<=i;j++,s--){
                    		System.out.print(s+" ");
                    		k=s;
                	}
          	}
          	else if(i%2!=0){
              		int p;
              		if(i==1){
                  		p=1;
                	}else if(i==n){
                    		p=n-1+k;
                	}
                	else{
                   		p= n-i+k;
                	}for(int j=1;j<=i;j++,p++){
                    		System.out.print(p+" ");
                    		k=p;
                	}
          	}System.out.println();
        }
		
     }
}


OUTPUT:

1 
3 2 
4 5 6 
10 9 8 7 
11 12 13 14 15
