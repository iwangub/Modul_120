package application;

//Default imports
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

//Imports von Aufgabe
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// Erstellen des Root-Nodes
			BorderPane pane = new BorderPane();

			// Erzeugen einer Scene, Container und Fenstergrösse übergeben
			Scene scene = new Scene(pane, 400, 400);

			// Erzeugen der Labels
			Label lbl = new Label("Anrede");
			pane.setTop(lbl);

			// Erzeugen des Textfields
			TextField txtField = new TextField();
			pane.setCenter(txtField);

			// Erzeugen des OK Buttons
			Button btn = new Button("OK");
			pane.setBottom(btn);

			// An Primary Stage übergeben
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
