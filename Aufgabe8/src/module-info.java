module Aufgabe5 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;

	opens application to javafx.graphics, javafx.fxml;

	opens application.view to javafx.graphics, javafx.fxml;
}
