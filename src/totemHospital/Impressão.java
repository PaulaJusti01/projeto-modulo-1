package totemHospital;

import java.util.Scanner;

public class Impressão {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		int contCorona=0, contPed=0, contGeral = 0, contGeri=0;
		int idade, sintomas;
		
		while(true) {
		System.out.println("\nDigite seu nome completo: ");
		String nome = ler.nextLine();
		System.out.println("\nDigite o cpf:");
		String cpf = ler.nextLine();
			do {
				System.out.println("\nDigite sua idade: ");
				idade = ler.nextInt();
				ler.nextLine();
			}while(idade<0 || idade>130);
			do {
				System.out.println("\nQuais sintomas você apresenta? \n1--Febre alta e falta de ar (COM AMBOS) \n2--Outros");
				sintomas = ler.nextInt();
				ler.nextLine();
			}while(sintomas<1 || sintomas>2);
		
		Paciente paciente = new Paciente(nome, cpf, idade, sintomas);
		if(sintomas == 1) {
			contCorona++;
			System.out.println("Por favor dirija-se ao 4° andar(Ala vermelha) através do elevador 1");
			System.out.println("Sua senha será chamada no painel \tSENHA: "+contCorona);
		}
		else if(sintomas == 2) {
			if(idade>0 && idade<=12) {
				contPed++;
				System.out.println("Por favor dirija-se ao 1° andar(Ala Pediatrica) através do elevador 1");
				System.out.println("Sua senha será chamada no painel \tSENHA: "+contPed);
			}
			else if(idade>12 && idade<60) {
				contGeral++;
				System.out.println("Por favor dirija-se ao 2° andar(Ala Geral) através do elevador 1");
				System.out.println("Sua senha será chamada no painel \tSENHA: "+contGeral);
			}
			else if(idade>60 && idade<=130) {
				contGeri++;
				System.out.println("Por favor dirija-se ao 3° andar(Ala Geriatrica) através do elevador 1");
				System.out.println("Sua senha será chamada no painel \tSENHA: "+contGeri);
			}
		}
	}
  }
}