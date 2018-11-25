package application;

import java.awt.Label;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainControler {

	@FXML
	private Label outputLabel;
	private void buttonAction(ActionEvent e) {
		Random random = new Random();
		int a = random.nextInt(50);
		outputLabel.setText(Integer.toString(a));
	}
}
