package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);

			// Viereck erstellen
			Rectangle viereck = new Rectangle(80, 40);
			viereck.setFill(Color.RED);
			root.setCenter(viereck);

			// HBox erstellen
			HBox bottomContainer = new HBox();

			// Button "btnLinks"
			Button btnLinks = new Button("Links!");

			btnLinks.setOnAction((event) -> {
				System.out.println("Hello btnLinks");
				viereck.setTranslateX(viereck.getTranslateX() - 5);
			});

			Button btnAha = new Button("Aha!");

			btnAha.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					viereck.setTranslateX(viereck.getTranslateX() + 5);
				}
			});

			bottomContainer.getChildren().add(btnLinks);
			bottomContainer.getChildren().add(btnAha);
			root.setBottom(bottomContainer);
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
