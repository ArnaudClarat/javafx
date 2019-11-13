package be.ifosupwavre.info.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    /**
     * Launcher
     * Pour tester l’application, utiliser la tâche Application > run
     *
     * @param args no args used
     */
    public static void main(String... args) {
        launch(args);
    }

    /**
     * Méthode principale de lancement de l’application JavaFX
     *
     * @param primaryStage la fenêtre principale
     */
    @Override
    public void start(Stage primaryStage) {
	    try {
		    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("mainvue.fxml"));
		    Parent root = loader.load();
		    Scene scene = new Scene(root);
		    primaryStage.setScene(scene);
		    primaryStage.setTitle("JavaFX Address Manager");
		    primaryStage.show();
	    } catch (Exception e) {
		    e.printStackTrace();
	    }
    }
}
