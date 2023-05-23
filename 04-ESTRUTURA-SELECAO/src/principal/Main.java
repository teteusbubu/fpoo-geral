package principal;

import operacional.EstruturaSelecao;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EstruturaSelecao objEstruturaSelecao = new EstruturaSelecao();
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("INFORME UM VALOR PARA GENERO:");
		objEstruturaSelecao.setGenero(objScanner.next());
	}

}
