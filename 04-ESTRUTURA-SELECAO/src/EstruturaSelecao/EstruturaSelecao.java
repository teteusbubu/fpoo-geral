package EstruturaSelecao;

public class EstruturaSelecao {

	private String genero;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		switch (genero) {
		case "masculino":
			this.genero = genero;
			break;
			
		case "feminino":
			this.genero = genero;
			break;
			
		case "outros":
			this.genero = genero;
			break;
			
		default:
				System.out.println("DADO INV�LIDO");
				System.exit(0);
		}
		this.genero = genero;
	}
}
