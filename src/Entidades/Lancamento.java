package Entidades;

public class Lancamento {
	private long id;
	private long categoryId;
	private String name;
	private String description;
	private String amount;
	private String date ;
	private String type ;
	private boolean paid;
	
	public Lancamento(long id, long categoryId, String name, String description, String amount,
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
	
	public long getCategoryId () {
		return categoryId;
	}
	
	public void setCategoryId(long categoryId) {
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

	public String toString() {
		return "id: "+ id + "\n" + "Nome: " + name + "\n" 
			     + "Descri��o: " + description + "\n" + "type: " + type + "\n" +
			     "amount: " + amount +"\n" + "date: " + date + "\n" +
			     "categoryId: " + categoryId + "\n" + "paid: " + paid;
	}
	
}
