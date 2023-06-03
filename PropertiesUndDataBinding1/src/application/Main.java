package application;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		Kunde kunde = new Kunde();
		kunde.setVorname("Tina");
		kunde.nameProperty().setValue("Turner");
		kunde.strasseProperty().setValue("Neustrasse 666");

		try {
			VBox root = new VBox(5);
			root.setPadding(new Insets(5, 5, 0, 5));

			Scene scene = new Scene(root, 250, 200);

			TextField txtVorname = new TextField();
			txtVorname.setText(kunde.getVorname());

			TextField txtName = new TextField();
			txtName.setText(kunde.nameProperty().getValue());

			TextField txtStrasse = new TextField();
			txtStrasse.setText(kunde.strasseProperty().getValue());

			Button btnSpeichern = new Button("Speichern");

			btnSpeichern.setOnAction((event) -> {
				kunde.nameProperty().setValue(txtName.getText());
				kunde.strasseProperty().setValue(txtStrasse.getText());
			});

			Label lblName = new Label();
			lblName.textProperty().bind(kunde.nameProperty());

			Label lblStrasse = new Label();
			lblStrasse.textProperty().bind(kunde.strasseProperty());

			root.getChildren().addAll(txtVorname, txtName, txtStrasse, btnSpeichern, lblName, lblStrasse);

			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}

class Kunde {
	private String vorname;
	private SimpleStringProperty name = new SimpleStringProperty();
	private SimpleStringProperty strasse = new SimpleStringProperty();

	// Keine Property für den Vorname (so lassen)
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public SimpleStringProperty nameProperty() {
		return name;
	}

	public SimpleStringProperty strasseProperty() {
		return strasse;
	}
}
