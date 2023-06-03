package application.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainViewController {

	// Referenz zum Primärfenster
	private Stage primaryStage; // NEU: Notwendig, um zu unterscheiden --> Modality

	public void setStage(Stage s) { // NEU: Wird vom Main.java aufgerufen s = Primary (Haupt) Stage
		this.primaryStage = s;
	}

	@FXML
	private void showEditView(ActionEvent event) {

		try {
			// Die EditView laden
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("EditView.fxml"));
			Parent editView = loader.load();

			// Eine neue Stage für die EditView erstellen
			Stage editStage = new Stage();
			editStage.setTitle("Kunde bearbeiten");
			editStage.initModality(Modality.WINDOW_MODAL); // NEU: Funktioniert nur wenn editStage "unter" primaryStage
															// steht (siehe weiter unten)

			// Die PrimaryStage wird der EditStage mitgeteilt
			editStage.initOwner(this.primaryStage); // NEU: Nur so wird "Kunde bearbeiten" Modal gemacht (siehe weiter
													// oben)

			// Laden des Controller
			EditViewController editController = loader.getController();

			// Übergabe des erstellten Fensters
			editController.setStage(editStage);

			// Eine neue Scene mit der EditView erstellen, der EditStage übergeben und
			// anzeigen
			editStage.setScene(new Scene(editView));

			editStage.showAndWait();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
