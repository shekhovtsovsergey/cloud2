module com.geekbrains.sep22.geekcloudclient {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.geekbrains.common;

    opens com.geekbrains.sep22.geekcloudclient to javafx.fxml;
    exports com.geekbrains.sep22.geekcloudclient;
}