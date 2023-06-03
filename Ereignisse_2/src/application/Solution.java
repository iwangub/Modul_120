package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Solution extends Application {

	Label lblZahl;
	Double btnBreite = 110.0;

	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Auf und Ab!");

		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 380, 100);

		HBox hboxBottom = new HBox();
		hboxBottom.setAlignment(Pos.CENTER);
		hboxBottom.setSpacing(10); // Lösung Ereignisse 2.docx / Teil 2 ODER weiter oben --> new HBox(10)
		hboxBottom.setPadding(new Insets(0, 0, 10, 0));

		// Methode 5 in "Ereignisse.docx"
		Button btnInkrementieren = new Button("_Inkrementieren"); // Lösung Ereignisse 2.docx / Teil 2 (Mnemonic)
		btnInkrementieren.setMinWidth(btnBreite);
		// btnInkrementieren.setMnemonicParsing(true); // Lösung Ereignisse 2.docx /
		// Teil 2
		btnInkrementieren.setDefaultButton(true); // Lösung Ereignisse 2.docx / Teil 2

		btnInkrementieren.setOnAction((event) -> lblZahl.setText("" + (Integer.parseInt(lblZahl.getText()) + 1)));
		// oder, schöner?
		btnInkrementieren
				.setOnAction((event) -> lblZahl.setText(String.valueOf((Integer.parseInt(lblZahl.getText()) + 1))));
		hboxBottom.getChildren().add(btnInkrementieren);

		// Methode 6 in "Ereignisse.docx"
		Button btnReset = new Button("_Reset");
		btnReset.setMinWidth(btnBreite);
		// btnReset.setMnemonicParsing(true);
		btnReset.setOnAction((event) -> resetPressed(event)); // Lamdba
		hboxBottom.getChildren().add(btnReset);

		// Methode 6 in "Ereignisse.docx"
		Button btnDekrementieren = new Button("_Dekrementieren");
		btnDekrementieren.setMinWidth(btnBreite);
		// btnInkrementieren.setMnemonicParsing(true);
		btnDekrementieren.setOnAction((event) -> dekrementierenPressed(event));

		hboxBottom.getChildren().add(btnDekrementieren);

		lblZahl = new Label("0");
		lblZahl.setFont(new Font(20));
		root.setCenter(lblZahl);

		root.setBottom(hboxBottom);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private void dekrementierenPressed(ActionEvent event) {
		lblZahl.setText("" + (Integer.parseInt(lblZahl.getText()) - 1));
	}

	private void resetPressed(ActionEvent event) {
		lblZahl.setText("" + 0);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
