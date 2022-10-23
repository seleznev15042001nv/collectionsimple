module com.example.collectionsimple {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.collectionsimple to javafx.fxml;
    exports com.example.collectionsimple;
}