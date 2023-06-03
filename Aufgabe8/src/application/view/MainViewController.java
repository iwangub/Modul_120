package application.view;

import java.io.IOException;

import application.Main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainViewController {

	@FXML
	private void showEditView(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("EditView.fxml"));
		Parent editView = loader.load();

		Stage editStage = new Stage();
		editStage.setTitle("Kunde bearbeiten");

		editStage.setScene(new Scene(editView));
		
		
		// Dem Controller die Stage mitteilen
		EditViewController editController = loader.getController();
		editController.setStage(editStage);
		
		
		editStage.showAndWait();
		
	}
}
