module Aufgabe5 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	exports application.view to javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens application.view to javafx.fxml;
	opens application.model to javafx.fxml;
}
