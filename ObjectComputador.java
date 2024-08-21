package aula4;

public class ObjectComputador {

	public static void main(String[] args) {
		Computador computador1 = new Computador();
		Computador computador2 = new Computador();
		
		computador1.setObjeto("PC");
		computador1.setModelo("Ryzen 5");
		computador1.setCor("Preto");
		computador1.setMarca("NTC");
		computador1.setPreco("R$2.509,99");
		
		computador2.setObjeto("PC");
		computador2.setModelo("Ryzen 5");
		computador2.setCor("Preto");
		computador2.setMarca("TT INFO");
		computador2.setPreco("R$2.499,00");
		
		System.out.println("-------COMPUTADOR1-------");
		System.out.println(computador1.getObjeto());
		System.out.println(computador1.getModelo());
		System.out.println(computador1.getCor());
		System.out.println(computador1.getMarca());
		System.out.println(computador1.getPreco());
		System.out.println(computador1.ligar());
		System.out.println(computador1.desligar());
		System.out.println(computador1.navegar());
		System.out.println("-------------------------");
		
		System.out.println("-------COMPUTADOR2-------");
		System.out.println(computador2.getObjeto());
		System.out.println(computador2.getModelo());
		System.out.println(computador2.getCor());
		System.out.println(computador2.getMarca());
		System.out.println(computador2.getPreco());
		System.out.println(computador2.ligar());
		System.out.println(computador2.desligar());
		System.out.println(computador2.navegar());
		System.out.println("-------------------------");

	}

}
