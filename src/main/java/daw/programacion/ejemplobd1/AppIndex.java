package daw.programacion.ejemplobd1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppIndex extends Application {

    //Atributos
    public static Connection conexion;
    @Override
    public void start(Stage stage) throws IOException {
        //Scene
        FXMLLoader fxmlLoader = new FXMLLoader(AppIndex.class.getResource("APPView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        //Stage
        stage.setTitle("App BD MySQL");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {

        String url = """
                jdbc:mysql://localhost:3306/database?allowPublicKeyRetrieval=true&useSSL=false
                """;
        conexion = null;
        try {
        conexion = DriverManager.getConnection(url, "user", "password");
            System.out.println("Conectado a la base de datos");
    } catch (SQLException e) {
            System.out.println("SQLException: "+ e.getMessage());
            System.out.println("SQLState: "+ e.getSQLState());
            System.out.println("Errorcode: "+ e.getErrorCode());
        }

        launch();
    }
}