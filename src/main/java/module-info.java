module com.example.opdarcheryapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.opdarcheryapp to javafx.fxml;
    exports com.example.opdarcheryapp;
}