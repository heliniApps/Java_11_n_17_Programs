module com.academy.eventhandlinganduithread {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.academy.eventhandling to javafx.fxml;
    exports com.academy.eventhandling;
}