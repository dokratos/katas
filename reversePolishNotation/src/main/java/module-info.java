module com.example.reversepolishnotation {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.reversepolishnotation to javafx.fxml;
    exports com.example.reversepolishnotation;
}