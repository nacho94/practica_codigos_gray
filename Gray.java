public class Gray {
	public static void main(String [] args){
		System.out.println("Gray");
		inicializar(4);
		prepend(result,4,false,0,1);
		prepend(result,4,true,1,2);
		reverse(result,1);
		print(result);
	}

	private static boolean [][] result;

	private static void inicializar(int n) {
		result = new boolean [(int)Math.pow(n,2)][n];
	}

	public static boolean [][] reverse (boolean [][] a ,int dimension) {
		int size = (int) Math.pow(dimension,2);
		if (dimension == 1) {
			size = 2;
		}
		int width = a[0].length;
		for (int i=0; i<size; i++) {
			for ( int j=width - dimension; j<dimension; j++) {
				a[i][width - j] = a[i][j];
			}
		}

		return a;
	}

	public static void __d(String msj) {
		System.out.println(msj);
	}

	public static boolean [][] prepend (boolean [][] a ,int position,boolean what, int init,int end) {
		for( int i=init; i<end; i++) {
			a[i][position - 1] = what;
		}
		return a;
	}

	public static void print (boolean [][] a) {
		for( int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] ? "1" : "0");
			}
			System.out.println();
		}
	}

	public static boolean[][] gray(int n,boolean [][] codigos) {
		if(n >= 2) {

		} else {
			return codigos;
		}
		return null;
	}
}
