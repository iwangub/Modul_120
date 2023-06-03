package application;

import javafx.application.Application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Debugging extends Application {
	double orgSceneX, orgSceneY;
	double orgTranslateX, orgTranslateY;

	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root = new BorderPane();
			StackPane centerContainer = new StackPane();
			HBox bottomContainer = new HBox();
			Scene scene = new Scene(root, 400, 400);

			// Label anzeigen
			Label lbl = new Label("Huhu!");
			lbl.setFont(new Font(40));
			bottomContainer.getChildren().add(lbl);
			root.setBottom(bottomContainer);

			// Button anzeigen
			Button btn = new Button("click here");
			bottomContainer.getChildren().add(btn);

			// Viereck anzeigen
			Rectangle viereck = new Rectangle(110, 40);
			viereck.setFill(Color.RED);
			centerContainer.getChildren().add(viereck);
			root.setCenter(centerContainer);

			primaryStage.setScene(scene);
			primaryStage.show();

			/* ***********************************************************************/
			// ANFANG: Nur für Interessierte und wenn die Zeit reicht
			viereck.setOnMousePressed(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent t) {
					orgSceneX = t.getSceneX();
					orgTranslateX = ((Rectangle) (t.getSource())).getTranslateX();
				}
			});

			viereck.setOnMouseDragged(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent t) {
					double offsetX = t.getSceneX() - orgSceneX;
					double newTranslateX = orgTranslateX + offsetX;
					((Rectangle) (t.getSource())).setTranslateX(newTranslateX);
				}
			});
			// ENDE: Nur für Interessierte und wenn die Zeit reicht
			/* ***********************************************************************/

//            centerContainer.getChildren().addAll(lbl, viereck);
// 
//            Button btnAha = new Button("Aha!");
//            btnAha.setOnAction(new EventHandler<ActionEvent>() {
//                public void handel(ActionEvent event) {
//                    viereck.setTranslateX(viereck.getTranslateX()+5);
//                }
//            };
// 
//            bottomContainer.getChildren().add(btnAha);
//            AnchorPane.setBottomAnchor(btnAha, 10.0);
//            AnchorPane.setRightAnchor(btnAha, 10.0);
// 
//            root.addCenter(centerContainer);
//            root.addBottom(bottomContainer);
// 
//            Scene scene = new Scene(root,300,200);
//            primaryStage.setScene(scene);
//            primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
