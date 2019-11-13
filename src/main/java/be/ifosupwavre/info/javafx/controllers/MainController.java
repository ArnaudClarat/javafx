package be.ifosupwavre.info.javafx.controllers;

import be.ifosupwavre.info.javafx.model.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {
	@FXML
	private DatePicker dpBirthday;
	@FXML
	private TableView<Person> tablePeople;
	@FXML 
	private TableColumn<Person,String> colFirstName;
	@FXML 
	private TableColumn<Person,String> colLastName;
	@FXML 
	private TextField tfFirstName;
	@FXML 
	private TextField tfLastName;
	@FXML 
	private TextField tfAddress;
	@FXML 
	private TextField tfZipCode;
	@FXML 
	private TextField tfCity;
	@FXML 
	private TextField tfPhoneNumber;
	@FXML 
	private TextField tfEmailAddress;
	@FXML 
	private Button btnNew;
	@FXML 
	private Button btnCommit;
	@FXML 
	private Button btnRollback;
	@FXML 
	private Button btnDelete;
	
	@FXML
	private void doNewPerson(ActionEvent actionEvent) {
	}
	
	@FXML
	private void doCommit(ActionEvent actionEvent) {
	}
	
	@FXML
	private void doRollback(ActionEvent actionEvent) {
	}
	
	@FXML
	private void doDeletePerson(ActionEvent actionEvent) {
	}
	@FXML
	private void doClose(ActionEvent actionEvent) {
	}
	@FXML
	private void doAbout(ActionEvent actionEvent) {
	}
}
