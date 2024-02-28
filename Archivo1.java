package archivosGit;

public class Archivo1 {
		
	private double answer;

	public double suma (double a, double b) {
		double suma=a+b;
		answer=suma;
		return answer;
	}
	
	public int division (int a, int b) {
		double division=a/b;
		answer=division;
		return (int) answer;
		
	}
	

	public double potReal(int a, int b) {
		double potencia = Math.pow(a, b);
		answer = potencia;
		return answer;
	}
	
	private double esperado;
	

	private String nombre="Jorge";
	private String apellido="Rodriguez";

	
}
