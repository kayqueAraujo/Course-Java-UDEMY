import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double celsius, farenheit;
		String resp;
		do {
			System.out.println("Insira uma temp em celsius: ");
			celsius = sc.nextDouble();
			farenheit = (celsius * 9 / 5) + 32;
			System.out.println("Equivalente a farenheit: " + farenheit);
			System.out.println("Deseja repetir ? (s/n) ");
			resp = sc.next();
		} while(resp.equals("s"));
		System.out.println("Programa finalizado!");
		sc.close();
	}
 
}
