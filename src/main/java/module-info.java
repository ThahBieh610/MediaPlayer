module com.example.fxmlplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.fxmlplayer to javafx.fxml;
    exports com.example.fxmlplayer;
}