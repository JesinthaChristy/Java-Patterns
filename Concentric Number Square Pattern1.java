public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    n = 2*n;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int value1=0, value2=0, values=0;
                value1 = i>n-i ? n-i : i;
                value2 = j>n-j ? n-j : j;
                values = value1>value2 ? value2 : value1;
                System.out.print(values+" ");
            }
          System.out.println();
        }
    }
}

OUTPUT:

1 1 1 1 1 1 1 1 1 
1 2 2 2 2 2 2 2 1 
1 2 3 3 3 3 3 2 1 
1 2 3 4 4 4 3 2 1 
1 2 3 4 5 4 3 2 1 
1 2 3 4 4 4 3 2 1 
1 2 3 3 3 3 3 2 1 
1 2 2 2 2 2 2 2 1 
1 1 1 1 1 1 1 1 1
