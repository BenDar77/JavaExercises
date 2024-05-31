module com.example.benasdarguzas03_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.benasdarguzas03_2 to javafx.fxml;
    exports com.example.benasdarguzas03_2;
}