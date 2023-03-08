module daw.programacion.ejemplobd1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    requires java.sql;
    requires mysql.connector.java;

    opens daw.programacion.ejemplobd1 to javafx.fxml;
    exports daw.programacion.ejemplobd1;
}