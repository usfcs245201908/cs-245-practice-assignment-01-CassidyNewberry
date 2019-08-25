public class Practice01MathIterative implements Practice01Math{
	public int fib (int n) throws Exception {

		if(n<0){
			throw new Exception("Number needs to be greater than 0");
		}


		int a[]= new int [n+2];
		int i;


		a[0]=0;
		a[1]=1;

		for (i=2; i<=n; i++){
				a[i]= a[i-1] + a[i-2];
		}

		return a[n];

	}

	public int fact( int n ) throws Exception {

		int factor=1;

		if(n<0){
			throw new Exception("Number needs to be greater than 0");
		}

		for (int i=2; i<=n ; i++){
			factor=factor*i;
		}

		return factor;



	}
}