package be.ifosupwavre.info.javafx.controllers;

import be.ifosupwavre.info.javafx.model.Person;
import javafx.beans.property.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.time.LocalDate;

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
		Person person = new Person();
		tablePeople.getItems().add(person);
		tablePeople.getSelectionModel().select(person);
	}
	
	@FXML
	private void doCommit(ActionEvent actionEvent) {
		personViewModel.commit();
	}
	
	@FXML
	private void doRollback(ActionEvent actionEvent) {
		personViewModel.rollback();
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

	public void setList(ObservableList<Person> people) {
		tablePeople.setItems(people);
	}

	private PersonViewModel personViewModel = new PersonViewModel();

	@FXML
	public void initialize(){
		colFirstName.setCellValueFactory(celldata -> celldata.getValue().firstNameProperty());
		colLastName.setCellValueFactory(celldata -> celldata.getValue().lastNameProperty());

		tfPhoneNumber.setTextFormatter( new TextFormatter<>( change -> {
			if (change.getControlNewText().isEmpty()) return change;

			DecimalFormat format = new DecimalFormat();
			ParsePosition parsePosition = new ParsePosition(0);
			Number number = format.parse(change.getControlNewText(), parsePosition);
			if (number == null || parsePosition.getIndex() < change.getControlNewText().length()) {
				return null;
			} else return change;
		}));

		tfFirstName.textProperty().bindBidirectional(personViewModel.firstName);
		tfLastName.textProperty().bindBidirectional(personViewModel.lastName);
		// TODO Faire les autres lignes

		tablePeople.getSelectionModel().selectedItemProperty().addListener(
				((observable, oldValue, newValue) -> personViewModel.setPerson(newValue))
		);
	}
}
