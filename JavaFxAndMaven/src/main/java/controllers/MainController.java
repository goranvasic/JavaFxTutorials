package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
	@FXML private Button btn1;
	
	@FXML private void btn1Clicked(ActionEvent event) {
		System.out.println("Click!");
	}
}
