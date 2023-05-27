package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


//Funktioniert nicht! Bitte Fehler korrigieren.


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage fenster) {
		StackPane wurzel = new StackPane();
		Scene szene = new Scene(wurzel, 400, 200);


		
		Label lblHallo = new Label("Hallo UIFZ'ler!");
		
		lblHallo.setFont(new Font("Arial", 30));
		lblHallo.setTextFill(Color.BLUE);

		wurzel.getChildren().add(lblHallo);
		

		fenster.setTitle("Begrüssung");
		fenster.setScene(szene);
		fenster.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

