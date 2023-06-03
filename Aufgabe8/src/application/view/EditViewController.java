package application.view;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class EditViewController {
	private Stage stage;

	public void setStage(Stage s) {
		this.stage = s;
		
	}

	@FXML
	private void saveButtonPressed(ActionEvent event) {
		this.stage.close();
	}

	@FXML
	private void cancelButtonPressed(ActionEvent event) {
		this.stage.close();

	}
}
