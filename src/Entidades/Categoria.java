package Entidades;

public class Categoria {
	private long id;
	private String name;
	private String description;
	
	public Categoria(long id, String name, String description) {
			this.id = id;
			this.name = name;
			this.description = description;
			
		}
		
	public Categoria() { }
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	public String toString() {
		return "id: "+ id + "\n" + "Nome: " + name + "\n" 
			     + "Descri��o: " + description; 
			     
	}
	}
