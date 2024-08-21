package aula4;

public class ObjectFornecedor {

	public static void main(String[] args) {
		
		Fornecedor fornecedor1 = new Fornecedor();
		
		fornecedor1.setId(44);
		fornecedor1.setRazaosocial("Petróleo Brasileiro S.A.");
		fornecedor1.setNomefantasia("Petrobrás");
		fornecedor1.setCnpj("33.000.167/0001-01");
		fornecedor1.setEndereco("Av. República do Chile, 65-Centro, RJ");
		fornecedor1.setTelefone("(21) 3224-2312");
		fornecedor1.setEmail("sac@petrobras.com.br");
		fornecedor1.setInscricaoestadual("33.000.167/0001-01");
		
		System.out.println("------------FORNECEDOR1------------");
		System.out.println(fornecedor1.getId());
		System.out.println(fornecedor1.getRazaosocial());
		System.out.println(fornecedor1.getNomefantasia());
		System.out.println(fornecedor1.getCnpj());
		System.out.println(fornecedor1.getEndereco());
		System.out.println(fornecedor1.getTelefone());
		System.out.println(fornecedor1.getEmail());
		System.out.println(fornecedor1.getInscricaoestadual());
		System.out.println("-----------------------------------");
		

	}

}
