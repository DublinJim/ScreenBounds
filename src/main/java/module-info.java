module com.example.screenbounds {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.screenbounds to javafx.fxml;
    exports com.example.screenbounds;
}