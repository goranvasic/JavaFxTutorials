package controller.tab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import controller.MainController;

public class Tab1Controller {
	
	private MainController main;
	
	@FXML public Label lbl1;
	@FXML private TextField txt1;
	@FXML private Button btn1Save;
	@FXML private Button btn1Send;
	
	@FXML private void btn1SaveClicked(ActionEvent event) {
		System.out.println("Btn 1 save clicked");
		
		lbl1.setText(txt1.getText());
	}
	
	@FXML private void btn1SendClicked(ActionEvent event) {
		System.out.println("Btn 1 send clicked");
		// Send text from txt1 to lbl2 on Tab 2
		main.setTab2LabelText(txt1.getText());
	}

	public void init(MainController mainController) {
		main = mainController;
	}
}
