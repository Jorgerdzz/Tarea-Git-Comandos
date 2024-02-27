package archivosGit;

public class Archivo2 {

	private double answer;
	
	public double resta (double a, double b) {
		double resta=a-b;
		answer=resta;
		return answer;
	}
	
	public double sumaTresValores (double a, double b, double c) {
		double suma2=a+b+c;
		answer=suma2;
		return answer;
	}
	
	public int potEntera(int a, int b) {
		int potenciaInt = (int) Math.pow(a, b);
		answer = potenciaInt;
		return (int)answer;
	}
	
	private double esperado;
}
