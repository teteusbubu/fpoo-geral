import java.util.Scanner;

public class Media {

	String[] alunos = {"Ana", "Jo�o", "Maria", "Carlos"};
	float[] notas = new float [4];
	Scanner objScanner = new Scanner(System.in);
	
	public void listarAlunos() {
		
		//System.out.println("1� aluno(a): " + alunos[0]);
		//System.out.println("2� aluno(a): " + alunos[1]);
		//System.out.println("3� aluno(a): " + alunos[2]);
		//System.out.println("4� aluno(a): " + alunos[3]);
		
		for(int indice = 0; indice < alunos.length; indice++) {
				
			//System.out.println((indice + 1) + "� ALUNO(A): " + alunos[indice]);
			
			System.out.println("NOTAS DO ALUNO(A): " + alunos[indice]);
			
				int cont = 0;
				while(cont < 4) {
				
					System.out.println("DIGITE A " + (cont + 1) + "� NOTA");
					notas[cont] = objScanner.nextFloat();
					cont++;
			}
				
		}
		
		System.out.println("LISTAGEM DE NOTAS");
		int cont = 0;
		while(cont < notas.length) {
			
			System.out.println( (cont + 1) + "� NOTA: " + notas [cont]);
			cont++;
		}
	
	System.out.println("TOTAL DE ALUNOS: " + alunos.length);
	}
}	
