package trilha_back_end_finacys;

import Entidades.Categoria;
import Entidades.Lancamento;

public class FinacysApplication {

	public static void main(String[] args) {
		long id = 4;
		String name = "Salario";
		String description = "Recebimento de salario";
		
		Categoria categoria = new Categoria (id, name, description);
		
		System.out.println("Categoria");
		System.out.println(categoria);
		
		System.out.println("");
		
		long categoryId = 4;
		String amount = "4405.49";
		String date = "15/09/2021";
		String type = "revenue";
		boolean paid = true;
		Lancamento lancamento = new Lancamento (id,categoryId,name,description,amount,date,type,paid);
	
		lancamento.setId(3);
		lancamento.setName("Salario na Empresa x");
		lancamento.setDescription("Adiantamento quinzenal");
		System.out.println("Lancamento");
		System.out.println(lancamento);
		

	}

}
