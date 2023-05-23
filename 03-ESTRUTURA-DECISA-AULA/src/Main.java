
public class Main {

	public static void main(String[] args) {

		OperadoresRelacionais objRelacionais = new OperadoresRelacionais();
		DecisaoSimples objDecisaoSimples = new DecisaoSimples();
		EstruturaDecisaoTexto objDecisaoTexto = new EstruturaDecisaoTexto();
		
		//objRelacionais.testesLogicos();
		
		//objDecisaoSimples.testeMenor(50, 50);
		//objDecisaoSimples.testeMenorIgual(50, 50);
		//objDecisaoSimples.testeMaior(50, 10);
		//objDecisaoSimples.testeDiferente(9, 9);
		//objDecisaoSimples.testeIgual(5,8);
		//objDecisaoSimples.testeMaiorIgual(100,20);
		
		objDecisaoTexto.testeVazio("SESI/SENAI DESENVOLVIMENTO DE SISTEMAS");
		objDecisaoTexto.testeIgual("SESI", "SENAI");
		objDecisaoTexto.testeIgual("SESI", "SESDTII");
		objDecisaoTexto.testeIgual("SENAI", "SENAI");
	}

}
 