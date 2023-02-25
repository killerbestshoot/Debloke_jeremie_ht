module com.example.debloke_jeremie_ht {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.debloke_jeremie_ht to javafx.fxml;
    exports com.example.debloke_jeremie_ht;
}