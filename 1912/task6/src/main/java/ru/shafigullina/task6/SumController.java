package ru.shafigullina.task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField nTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextField.getText().toString());
        if (N < 0) {
            resLabel.setText("Число должно быть положительным.");
            return;}
        int count = 0;
        int sum = 0;
        int tempN = N;
        while (tempN > 0) {
            int digit = tempN % 10;
            sum += digit;
            count++;
            tempN /= 10;
        }
        resLabel.setText("Кол-во цифр: " + count + ", сумма цифр " + sum);
    }
}