module com.devbak.appli_gestionpatient {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.devbak.appli_gestionpatient to javafx.fxml;
    exports com.devbak.appli_gestionpatient;
}