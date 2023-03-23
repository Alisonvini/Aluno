package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.println("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(aluno.nome 
				+ "\nFINAL GRADE = " + aluno.NotaFinal());
		
		if (aluno.NotaFinal() > 60.0)
			System.out.println("PASS");
			else {
				System.out.println("FAILED" 
						+ "\nMISSING " 
						+ (60 - aluno.NotaFinal())
						+ " POINTS");
				
			}
		
		sc.close();
		
	}

}
