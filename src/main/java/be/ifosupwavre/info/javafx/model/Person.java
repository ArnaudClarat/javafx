package be.ifosupwavre.info.javafx.model;

import javafx.beans.property.*;

import java.time.LocalDate;

public final class Person {
	private StringProperty firstName = new SimpleStringProperty();
	private StringProperty lastName = new SimpleStringProperty();
	private StringProperty address = new SimpleStringProperty();
	private IntegerProperty zipCode = new SimpleIntegerProperty();
	private StringProperty city = new SimpleStringProperty();
	private StringProperty phoneNumber = new SimpleStringProperty();
	private StringProperty emailAddess = new SimpleStringProperty();
	private ObjectProperty<LocalDate> birthdate = new SimpleObjectProperty<LocalDate>();
	
	public String getFirstName() {
		return firstName.get();
	}
	
	public StringProperty firstNameProperty() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}
	
	public String getLastName() {
		return lastName.get();
	}
	
	public StringProperty lastNameProperty() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}
	
	public String getAddress() {
		return address.get();
	}
	
	public StringProperty addressProperty() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address.set(address);
	}
	
	public int getZipCode() {
		return zipCode.get();
	}
	
	public IntegerProperty zipCodeProperty() {
		return zipCode;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode.set(zipCode);
	}
	
	public String getCity() {
		return city.get();
	}
	
	public StringProperty cityProperty() {
		return city;
	}
	
	public void setCity(String city) {
		this.city.set(city);
	}
	
	public String getPhoneNumber() {
		return phoneNumber.get();
	}
	
	public StringProperty phoneNumberProperty() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber.set(phoneNumber);
	}
	
	public String getEmailAddess() {
		return emailAddess.get();
	}
	
	public StringProperty emailAddessProperty() {
		return emailAddess;
	}
	
	public void setEmailAddess(String emailAddess) {
		this.emailAddess.set(emailAddess);
	}
	
	public LocalDate getBirthdate() {
		return birthdate.get();
	}
	
	public ObjectProperty<LocalDate> birthdateProperty() {
		return birthdate;
	}
	
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate.set(birthdate);
	}
}
