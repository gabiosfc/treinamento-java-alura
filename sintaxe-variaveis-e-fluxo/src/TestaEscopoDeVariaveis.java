public class TestaEscopoDeVariaveis {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("Valor de acompanhado = " + acompanhado);
	}

}
