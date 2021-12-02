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
		
		System.out.println("========================================================");
		
		long categoryId = 4;
		String amount = "4405.49";
		String date = "15/09/2021";
		String type = "revenue";
		boolean paid = true;
		Lancamento lancamento = new Lancamento (id,categoryId,name,description,amount,date,type,paid);
		
		System.out.println("Lancamento");
		System.out.println(lancamento);
		
		Categoria categoria1 = new Categoria();
		categoria1.setDescription("Recebimento de salario");
		categoria1.setId(4);
		categoria1.setName("Salario");

		Lancamento lancamento2 = new Lancamento();
		lancamento2.setId(3);
		lancamento2.setName("Salario na Empresa x");
		lancamento2.setDescription("Adiantamento quinzenal");
		lancamento2.setCategoryId(4);
		lancamento2.setPaid(true);
		lancamento2.setType("revenue");
		lancamento2.setDate("15/09/2021");
		lancamento2.setAmount("4405.49");
	}

}
