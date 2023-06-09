package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class Main extends Application {
	// Macht die PrimaryStage allen Methoden dieser Klasse verfügbar
	// Siehe buttonPressed Eventhandler
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;

			// Layoutcontainer erstellen
			BorderPane root = new BorderPane();
			HBox container = new HBox();
			Scene scene = new Scene(root, 300, 200);

			// Button erstellen
			Button btn = new Button("Klick mich!");

			// Ereignisbehandlungsroutine für Button Klick registrieren
			btn.setOnAction(event -> buttonPressed(event));

			// Button dem Container hinzufügen
			container.getChildren().add(btn);
			root.setCenter(container);

			// Textfeld erstellen
			TextField textField = new TextField();

			// Ereignisbehandlungsroutine für Tastendruck registrieren
			textField.setOnKeyPressed(event -> keyPressed(event));

			// Handling key pressed event
			Label lbl = new Label();
			container.getChildren().add(lbl);

			// Textfeld dem Container hinzufügen
			container.getChildren().add(textField);

			// Ereignisbehandlungsroutine für Mausklick registrieren
			scene.setOnMouseClicked(event -> mouseClicked(event));

			// Primary Stage anzeigen
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Action Event for buttonPressen
	private void buttonPressed(ActionEvent event) {
		System.out.println("Button Clicked, Application will be closed now!");
		this.primaryStage.close();
	}

	// Action Event for mouseClicked
	private void mouseClicked(MouseEvent event) {
		double x = event.getX(); // X-Koordinate des Mausklicks
		double y = event.getY(); // Y-Koordinate des Mausklicks
		String message = "Maus wurde geklickt an X: " + x + ", Y: " + y;
		System.out.println(message);
	}

	// Action Event for keyPressed
	private void keyPressed(KeyEvent event) {
		System.out.println(event.getText());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
