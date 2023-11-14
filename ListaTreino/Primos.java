
import java.util.Scanner;
public class Primos {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n;
		
		System.out.println("Entre com o número");
		n = in.nextInt();
		if(n%2 == 0) {
			System.out.println(n+" Não é primo");
		}else {
			System.out.println(n+" É primo");
		}
		in.close();
	}

}
