module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.devsuperior.hrworker to javafx.fxml;
    exports com.example.devsuperior.hrworker;
}