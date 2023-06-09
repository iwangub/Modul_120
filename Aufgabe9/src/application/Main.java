
package application;

import application.model.KundeModel;
import application.view.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// Laden des Layout Containers via FXMLLoader
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("view/MainView.fxml"));
			Parent rootLayout = loader.load();

			// Dem MainViewController wird die PrimaryStage mitgeteilt
			MainViewController mainController = loader.getController(); // NEU
			mainController.setStage(primaryStage); // NEU

			// TEST
			KundeModel testKunde = new KundeModel();
			testKunde.vornameProperty().setValue("Hans");
			System.out.println(testKunde.vornameProperty().getValue());
			// TEST DONE

			// Scene erstellen und anzeigen
			Scene scene = new Scene(rootLayout);
			primaryStage.setTitle("Kunden-Browser");
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
