package application.view;

import application.model.KundeModel;

import javafx.event.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.beans.property.*;

public class EditViewController {

	// Zum speichern der Referenz auf das Fenster
	private Stage stage;


	public void setStage(Stage s) {
		this.stage = s;
	}

	/**
	 * Schliesst das Fenster
	 */
	@FXML
	private void saveButtonPressed(ActionEvent event) {
		
		/*
		// Zugriff auf Wert nun via Property (Getter & Setter)

		KundeModel kundeTest = new KundeModel();
		kundeTest.nameProperty().setValue("Turner");
		
		String output = kundeTest.nameProperty().getValue();
		
		System.out.println(output);
*/
		this.stage.close();
	}

	/**
	 * Schliesst das Fenster
	 */
	@FXML
	private void cancelButtonPressed(ActionEvent event) {
		this.stage.close();
	}

}
