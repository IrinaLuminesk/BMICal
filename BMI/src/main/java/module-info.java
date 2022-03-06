module com.mycompany.bmi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bmi to javafx.fxml;
    exports com.mycompany.bmi;
}
