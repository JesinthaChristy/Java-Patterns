public class Main
{
	public static void main(String[] args) {
	    int n=3;
	    int k=1;
        for(int i=1;i<=n;i++){
                if(i%2==0){
                    int s = n+k;
                    for(int j=n;j>0;j--,s--){
                        System.out.print(s+" ");
                        k=s;
                    }
                }
                else if(i%2!=0){
                    int p;
                    if(i==1){
                        p=1;
                    }else{
                        p= n+k;
                    }for(int j=1;j<=n;j++,p++){
                        System.out.print(p+" ");
                        k=p;
                    }
                }System.out.println();
        }
    }
}



OUTPUT:

1 2 3 
6 5 4 
7 8 9 