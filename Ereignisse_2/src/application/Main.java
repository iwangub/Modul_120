package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Main extends Application {

	private Label output;

	@Override
	public void start(Stage primaryStage) {
		try {

			// Root Node erstellen und an Scene anfügen
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 100);

			// Output Label erstellen
			output = new Label("0");
			root.setCenter(output);

			//// HBox und Buttons innerhalb der Box erstellen -- START -- ////
			HBox hBox = new HBox();

			// Button Inktementieren erstellen
			Button btnInk = new Button("Inkrementieren");
			btnInk.setPrefWidth(120); // Set preferred width to fill available space
			btnInk.setDefaultButton(true); // Dieser Button auf default

			// Methode für btnInk
			btnInk.setOnAction((event) -> {
				int currentValue = Integer.parseInt(output.getText());
				output.setText(String.valueOf(currentValue + 1));
				System.out.println("Button Inkrement clicked!!");
			});

			// Button Reset erstellen
			Button btnReset = new Button("_Reset"); // Unterstreichen Sie den Buchstaben "R"
			btnReset.setPrefWidth(120); // Set preferred width to fill available space
			btnReset.setOnAction(event -> buttonResetPressed(event));
			btnReset.setMnemonicParsing(true); // Aktivieren Sie die Verarbeitung des Tastenkürzels

			// Button Dekrementieren erstellen
			Button btnDek = new Button("Dekrementieren");
			btnDek.setPrefWidth(120); // Set preferred width to fill available space
			// Action für Button Dektrement mit Methode 6
			btnDek.setOnAction(event -> buttonDekrementPressed(event));

			hBox.setAlignment(Pos.BOTTOM_CENTER);
			hBox.setSpacing(10); // Add spacing between buttons
			hBox.getChildren().addAll(btnInk, btnReset, btnDek);
			//// HBox und Buttons innerhalb der Box erstellen -- DONE -- ////

			// Node hBox anhängen
			root.setBottom(hBox);

			// Ausgabe
			primaryStage.setTitle("Ereigniss 2");

			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Methode für btnReset
	private void buttonResetPressed(ActionEvent event) {
		output.setText("0");
		System.out.println("Button Reset clicked!!");
	}

	// Methode für btnDek
	private void buttonDekrementPressed(ActionEvent event) {
		int currentValue = Integer.parseInt(output.getText());
		output.setText(String.valueOf(currentValue - 1));
		System.out.println("Button Dekrement clicked!!");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
