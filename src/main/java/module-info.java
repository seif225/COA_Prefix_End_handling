module com.example.coa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coa to javafx.fxml;
    exports com.example.coa;
}