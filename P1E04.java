
public class P1E04 {

	public static void main(String[] args) {
		  int hora, minuto, segundo, passa, falta;

	        hora = 6;
	        minuto = 28;
	        segundo = 51;

	        passa = segundo + minuto*60 + hora*3600;
	        falta = 86400 - passa;

	        System.out.println("Já se passaram " + passa + " segundos desde o início do dia");
	        System.out.println("Faltam " + falta + " segundos para terminar o dia");

	}

}
