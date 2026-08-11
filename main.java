package soma;

import java.util.Scanner;

    public class main {

	public static void main (String[]args) {
		int n1;
		int sn1; //sucessor
		int an1;//antecessor
		
		Scanner entrada = new Scanner (System.in);
		System.out.println ("Digite um número: ");
		n1= entrada.nextInt();

		sn1=n1+1;
		an1=n1-1;
		
		System.out.println ("O sucessor deste número é: " + sn1);
		System.out.println ("o antecessor deste número é: " + an1);
		
		entrada.close();
		
	}
}
