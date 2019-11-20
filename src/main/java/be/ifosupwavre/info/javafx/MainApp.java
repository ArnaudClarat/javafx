package be.ifosupwavre.info.javafx;

import be.ifosupwavre.info.javafx.controllers.MainController;
import be.ifosupwavre.info.javafx.model.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.fluttercode.datafactory.impl.DataFactory;

import java.time.ZoneId;
import java.util.ResourceBundle;

public class MainApp extends Application {
    public static void main(String... args) {
        launch(args);
    }

    private ObservableList<Person> people = FXCollections.observableArrayList();
    private ResourceBundle bundle = ResourceBundle.getBundle("i18n");

    @Override
    public void start(Stage primaryStage) {
	    try {
	    	fill_dummies(people);
		    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("mainvue.fxml"), bundle);
		    Parent root = loader.load();
			MainController controller = loader.getController();
			controller.setList(people);
		    Scene scene = new Scene(root);
		    primaryStage.setScene(scene);
		    primaryStage.setTitle("JavaFX Address Manager");
		    primaryStage.show();
	    } catch (Exception e) {
		    e.printStackTrace();
	    }
    }

    private void fill_dummies(ObservableList<Person> people){
		DataFactory factory = new DataFactory() ;
		for (int i = 0; i < 5; i++) {
			Person person = new Person();
			person.setFirstName(factory.getFirstName());
			person.setLastName(factory.getLastName());
			person.setAddress(factory.getAddress());
			person.setCity(factory.getCity());
			person.setZipCode(factory.getNumberBetween(1000,10000));
			person.setEmailAddress(factory.getEmailAddress());
			person.setPhoneNumber(factory.getNumberText(10));
			person.setBirthday(factory.getBirthDate().toInstant()
			.atZone(ZoneId.systemDefault()).toLocalDate());

			people.add(person);
		}
    }
}
