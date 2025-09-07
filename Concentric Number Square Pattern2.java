public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    n = 2*n;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int value1=0, value2=0, values=0;
                value1 = i<n-i ? n-i : i;
                value2 = j<n-j ? n-j : j;
                values = value1<value2 ? value2 : value1;
                System.out.print(values+" ");
            }
          System.out.println();
        }
    }
}

OUTPUT:

9 9 9 9 9 9 9 9 9 
9 8 8 8 8 8 8 8 9 
9 8 7 7 7 7 7 8 9 
9 8 7 6 6 6 7 8 9 
9 8 7 6 5 6 7 8 9 
9 8 7 6 6 6 7 8 9 
9 8 7 7 7 7 7 8 9 
9 8 8 8 8 8 8 8 9 
9 9 9 9 9 9 9 9 9 