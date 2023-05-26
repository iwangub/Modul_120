package application;

// Default imports
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

// Imports von Aufgabe
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		// Erstellen des Root-Nodes
		StackPane pane = new StackPane();

		// Erzeugen einer Scene, Container und Fenstergrösse übergeben
		Scene scene = new Scene(pane, 400, 400);

		// Erzeugen eines Labels (Node)
		Label lbl = new Label("Hallo JavaFX");
		pane.getChildren().add(lbl);
		Label lbl2 = new Label("Hallo Label 2");
		pane.getChildren().add(lbl2);

		// Position der Labels definieren
		StackPane.setAlignment(lbl, Pos.TOP_CENTER); // Labels oben zentriert ausrichten
		StackPane.setAlignment(lbl2, Pos.BOTTOM_CENTER); // Labels unten zentriert ausrichten

		// An Primary Stage übergeben
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
