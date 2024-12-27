module ru.shafigullina.task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shafigullina.task6 to javafx.fxml;
    exports ru.shafigullina.task6;
}