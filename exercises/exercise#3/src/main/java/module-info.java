module com.imagemanagementtool.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.imagemanagementtool.calculator to javafx.fxml;
    exports com.imagemanagementtool.calculator;
}