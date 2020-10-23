
import java.util.Scanner;

public class Classe {
	
	public int Valor1;
	public int Valor2;
	public int Resto;
	public Scanner Leitura = new Scanner(System.in);
	

	public void Calcular () {
		System.out.println("Digite o primeiro número:");
		Valor1 = Leitura.nextInt();
	System.out.println("Digite o segundo  número:");
		Valor2=Leitura.nextInt();
	}
		
	
	public void Conta() {
		while (Valor2 !=0) {
			
			Resto = Valor1 % Valor2;
			Valor1 = Valor2;
			Valor2=Resto;			
			}
	
		System.out.println("O valor do MDC é:"+Valor1);
		
		
	}
		
		
	
	
	
}
