package application.model;

import java.time.*;
import javafx.beans.property.*;

public class KundeModel {

	private SimpleStringProperty vorname = new SimpleStringProperty();
	private SimpleStringProperty nachname = new SimpleStringProperty();
	private SimpleStringProperty strasse = new SimpleStringProperty();
	private SimpleIntegerProperty plz = new SimpleIntegerProperty();
	private SimpleStringProperty ort = new SimpleStringProperty();
	private SimpleStringProperty email = new SimpleStringProperty();
	private SimpleObjectProperty<LocalDate> kundeSeit = new SimpleObjectProperty<LocalDate>();
	private SimpleBooleanProperty hasNewsletter = new SimpleBooleanProperty();

	public SimpleStringProperty vornameProperty() {
		return vorname;
	}

	public SimpleStringProperty nachnameProperty() {
		return nachname;
	}

	public SimpleStringProperty strasseProperty() {
		return strasse;
	}

	public SimpleIntegerProperty plzProperty() {
		return plz;
	}

	public SimpleStringProperty ortProperty() {
		return ort;
	}

	public SimpleStringProperty emailProperty() {
		return email;
	}

	public SimpleObjectProperty<LocalDate> kundeSeitProperty() {
		return kundeSeit;
	}

	public SimpleBooleanProperty hasNewsletterProperty() {
		return hasNewsletter;
	}

	public KundeModel() {
	}

	public KundeModel(String vorname, String nachname) {
		this.vorname.setValue(vorname);
		this.nachname.setValue(nachname);
	}

}
