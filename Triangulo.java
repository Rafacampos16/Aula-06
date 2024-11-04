import java.util.Scanner;

public class Triangulo {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in );
		int a, b, c, lados;
		
		System.out.print("Entre com o numero de lados: ");
		lados = leia.nextInt();
		
		if (lados != 3) {
			System.out.println("Não é um triangulo");
			
		}else{
			System.out.print("Entre com o valor de \'a\':  ");
			a = leia.nextInt();
			
			System.out.print("Entre com o valor de \'b\':  ");
			b = leia.nextInt();
			
			System.out.print("Entre com o valor de \'c\':  ");
			c = leia.nextInt();
			
			if (a < b + c && b < c + a && c < a + b){
				if (a == b && a == c && b == c){
			System.out.println("O triangulo é Esquilatero");
			}
			
			else if (a == b && b != c || a == c &&  a != b || b == c && c != a) {
				System.out.println("O triangulo é Isoceles");
			}
			
			else if (a != c && c != b && b != a){
				System.out.println("O triangulo é Escaleno");
			}
				} else {
					System.out.println("Não é um triangulo!");
				}
		}	
	}
}


