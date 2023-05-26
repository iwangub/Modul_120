package application;

//Default imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			// Erstellung vom node root
			// VBox container = new VBox();
			// HBox container = new HBox();
			// FlowPane container = new FlowPane();
			// StackPane container = new StackPane();
			AnchorPane container = new AnchorPane();

			
			// Erstellung von node viereck
			Rectangle viereck = new Rectangle(80, 40);
			viereck.setFill(Color.BURLYWOOD);
			container.getChildren().add(viereck);

			
			// Erstellung von node Label1
			Label lbl1 = new Label("Hello");
			lbl1.setFont(new Font(20));
			container.getChildren().add(lbl1);

			
			// Erstellung von node Label2
			Label lbl2 = new Label("Altstetten");
			lbl2.setFont(new Font(20));
			lbl2.setTextFill(Color.BLUE);
			container.getChildren().add(lbl2);
			AnchorPane.setRightAnchor(lbl2, 10.0);

			
			// Erstellung von node Label3
			Label lbl3 = new Label("Wie geht's Ihnen?");
			lbl3.setFont(new Font(20));
			lbl3.setTextFill(Color.AQUA);
			container.getChildren().add(lbl3);
			AnchorPane.setBottomAnchor(lbl3, 10.0);

			
			// Anzeige instanzieren und primaryStage Methoden 
			Scene scene = new Scene(container, 200, 200);
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
