public class Gray {
	public static void main(String [] args){
		System.out.println("Gray");

	}
	private static boolean [][] result;

	private static void inicializar(int n) {
		result = new boolean [2^n][n];
	}

	public static boolean[][] gray(int n,boolean [][] codigos) {
		if(n >= 2) {

		} else {
			return codigos;
		}
		return null;
	}
}
