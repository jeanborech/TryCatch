package TratamentoExceções;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_TryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		try {
		String[] vect = sc.nextLine().split(" "); //split usado para dividir uma string em pequenos pedaços
		int posicao = sc.nextInt();
		System.out.println(vect[posicao]); //vetor na posição digitada
		}
		catch (ArrayIndexOutOfBoundsException e) {  //exceção caso tenha posição fora do vetor
            System.out.println("Posição inválida!");
            e.printStackTrace(); // para mostrar a exceção que está acontecendo 
		}
		catch (InputMismatchException e) {  //exceção caso digite um valor da psição que não seja tipo int/número
			System.out.println("Erro de valor de entrada!");
		}
		
		System.out.println("Fim do programa");
		
		sc.close();
	}

}
