package archivosGit;

public class Archivo3 {

	private double answer;
	
	public double multiplicacion (double a, double b) {
		double multiplicacion=a*b;
		answer=multiplicacion;
		return answer;
	}
	
	public double divisionReal (double a, double b) {
		double divReal=a/b;
		answer=divReal;
		return answer;
	}
	
	public int resto(double a, double b) {
		int aInt = (int)a;
		int bInt= (int)b;
		int modulo = bInt%aInt;
		answer = modulo;
		return (int)answer;
	}
	
}
