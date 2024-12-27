package ru.shafigullina.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SumController {

    @FXML
    private TextField kTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int K = Integer.parseInt(kTextField.getText().toString());
        String res;
        switch (K){
            case 1:
                res = "плохо";
                break;
            case 2:
                res = "неудовлетворительно";
                break;
            case 3:
                res = "удовлетворительно";
                break;
            case 4:
                res = "хорошо";
                break;
            case 5:
                res = "отлично";
                break;
            default:
                res = "ошибка";
                break;

        }
        resLabel.setText(res);

    }

}


