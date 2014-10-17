public class Gray {
	public static void main(String [] args){
		System.out.println("Gray");

	}
	private static boolean [][] result;

	private static void inicializar(int n) {
		result = new boolean [(int)Math.pow(n,2)][n];
	}
	public static boolean [][] reverse (boolean [][] a) {

	}
	public static boolean [][] prepend (boolean [][] a ,int position,boolean what, int init,int end) {
		for( int i=init; i<end; i++) {
			a[i][position] = what;
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
