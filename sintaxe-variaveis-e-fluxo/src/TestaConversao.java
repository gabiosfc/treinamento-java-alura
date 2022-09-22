public class TestaConversao {
	public static void main(String[] args) {
		
		double salario = 2400.00;
		int valor = (int) salario;
		
		System.out.println("O valor é " + valor);
		
		int x = 2000000; //int cabe 32 bits
		long numeroGrande = 12345678912l; // long cabe 64 bits
		short valorPequeno = 2131; //short cabe 16 bits - 1
		byte b = 127; //byte vai até 127
		
		float pontoFlutuante = 3.14f; //usar o "f" no final para não confundir com double
				
	}
	
}
