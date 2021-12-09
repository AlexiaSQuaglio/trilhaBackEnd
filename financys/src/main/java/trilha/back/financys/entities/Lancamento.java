package trilha.back.financys.entities;


public class Lancamento {

	private long id;
	private Categoria categoryId;
	private String name;
	private String description;
	private String amount;
	private String date;
	private String type;
	private boolean paid;
	
	public Lancamento(long id, Categoria categoryId, String name, String description, String amount,
			String date, String type, boolean paid) {
			this.id = id;
			this.categoryId = categoryId; 
			this.name = name;
			this.description = description;
			this.amount = amount;
			this.date = date;
			this.type = type;
			this.paid = paid;
		}
		
		public Lancamento() { }
		
		public boolean isPaid() {
			return paid;
		}

		public void setPaid(boolean paid) {
			this.paid = paid;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
		
		public Categoria getCategoryId () {
			return categoryId;
		}
		
		public void setCategoryId(Categoria categoryId) {
			this.categoryId = categoryId;
		}
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		

		public String getAmount() {
			return amount;
		}


		public void setAmount(String amount) {
			this.amount = amount;
		}
		
		public String getDate() {
			return date;
		}


		public void setDate(String date) {
			this.date = date;
		}
		
		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}
	
}
