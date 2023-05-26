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
			BorderPane root = new BorderPane();

			// Erzeugen einer Scene, Container und Fenstergrösse übergeben
			Scene scene = new Scene(root, 400, 400);

			// Erzeugen der Nodes
			Label lbl = new Label("Anrede");
			TextField txtField = new TextField();
			Button btn = new Button("OK");

			// Position der Elemente definieren
			root.setTop(lbl);
			root.setCenter(txtField);
			root.setBottom(btn);

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
