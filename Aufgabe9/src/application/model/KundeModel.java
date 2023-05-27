package application.model;

public class KundeModel {
	// Privates Attribut
	private String name;
	private String nachname;

	// Getter
	public String getName() {
		return this.name;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public KundeModel(String name, String nachname) {
		super();
		this.name = name;
		this.nachname = nachname;
	}

}
