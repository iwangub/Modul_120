package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class Teacher extends Application {
	// Macht die PrimaryStage allen Methoden dieser Klasse verfügbar
	// Siehe u.a. buttonPressed Eventhandler
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;

			// Layoutcontainer erstellen
			HBox container = new HBox();

			// Button erstellen
			Button btnTest = new Button("Klick mich!");
			// Ereignisbehandlungsroutine für Button Klick registrieren
			btnTest.setOnAction((event) -> buttonPressed(event)); // Diese Methode ist weiter unten.
			// Button dem Container hinzufügen
			container.getChildren().add(btnTest);

			// Textfeld erstellen
			TextField txt = new TextField();
			// Ereignisbehandlungsroutine für Tastendruck registrieren
			txt.setOnKeyPressed((event) -> keyPressed(event)); // This event occurs when a key has been pressed.
			// txt.setOnKeyTyped((event) -> keyTyped(event)); // This event occurs when a
			// character-generating key was typed (pressed and released).
			// Textfeld dem Container hinzufügen
			container.getChildren().add(txt);

			Scene scene = new Scene(container, 300, 200);
			// Ereignisbehandlungsroutine für Mausklick registrieren
			scene.setOnMouseClicked(event -> mouseClicked(event));
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void buttonPressed(ActionEvent event) {
		System.out.println("Klick!");
		primaryStage.close(); // Platform.exit();
		// https://docs.oracle.com/javase/8/javafx/api/javafx/application/Platform.html#exit--
	}

	private void mouseClicked(MouseEvent event) {
		// Mauskoordinaten via event Objekt ausgeben.
		// System.out.println(String.format("Maus wurde geklickt an X:%s, Y:%s",
		// event.getX(), event.getY()));
		System.out.println("Maus wurde geklickt: " + event.getX() + "  " + event.getY());
	}

	private void keyPressed(KeyEvent event) {
		System.out.println(event.getText());
		// System.out.println(event.getCode()); // nur zur Demo
	}

	// Siehe auch Zeile 39
	private void keyTyped(KeyEvent event) {
		System.out.println(event.getCharacter());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
