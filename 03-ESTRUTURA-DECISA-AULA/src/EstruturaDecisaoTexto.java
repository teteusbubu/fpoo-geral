
public class EstruturaDecisaoTexto {

	//� VAZIO
	public void testeVazio(String texto) {
		if(texto.isEmpty()) {
			System.out.println("DIGITE UM TEXTO");
		}else {
			System.out.println("OBRIGADO POR DIGITAR O TEXTO");
		}
	}
	
	//� IGUAL
	public void testeIgual(String texto1, String texto2) {
		if(texto1.equalsIgnoreCase(texto2)) {
			System.out.println("OS TEXTOS S�O IGUAIS");
		}else {
			System.out.println("OS TEXTOS S�O DIFERENTES");
		}
	}
	
	//QUAL O TAMANHO
	
	
}
