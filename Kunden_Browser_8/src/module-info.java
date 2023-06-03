module Kunden_Browser_8 {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports application.view to javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens application.view to javafx.fxml;
}
