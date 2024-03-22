module com.example.zero_stock {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zero_stock to javafx.fxml;
    exports com.example.zero_stock;
}