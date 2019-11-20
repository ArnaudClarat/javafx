package be.ifosupwavre.info.javafx.controllers;

import be.ifosupwavre.info.javafx.model.Person;
import javafx.beans.property.*;

import java.time.LocalDate;

public class PersonViewModel {
    public Person person = new Person();
    public StringProperty firstName = new SimpleStringProperty();
    public StringProperty lastName = new SimpleStringProperty();
    public StringProperty address = new SimpleStringProperty();
    public IntegerProperty zipCode = new SimpleIntegerProperty();
    public StringProperty city = new SimpleStringProperty();
    public StringProperty phoneNumber = new SimpleStringProperty();
    public StringProperty emailAddress = new SimpleStringProperty();
    public ObjectProperty<LocalDate> birthday = new SimpleObjectProperty<>();
    private BooleanProperty changed = new SimpleBooleanProperty(true);

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonViewModel (){
        firstName.addListener( change -> this.changed.setValue(false));
        lastName.addListener( change -> this.changed.setValue(false));
        address.addListener( change -> this.changed.setValue(false));
        city.addListener( change -> this.changed.setValue(false));
        zipCode.addListener( change -> this.changed.setValue(false));
        phoneNumber.addListener( change -> this.changed.setValue(false));
        emailAddress.addListener( change -> this.changed.setValue(false));
        birthday.addListener( change -> this.changed.setValue(false));
    }

    public void commit(){
        person.setFirstName(firstName.getValue());
        person.setLastName(lastName.getValue());
        person.setAddress(address.getValue());
        person.setCity(city.getValue());
        person.setZipCode(zipCode.getValue());
        person.setPhoneNumber(phoneNumber.getValue());
        person.setEmailAddress(emailAddress.getValue());
        person.setBirthday(birthday.getValue());
    }

    public void rollback(){
        person.setFirstName(firstName.getValue());
        person.setLastName(lastName.getValue());
        person.setAddress(address.getValue());
        person.setZipCode(zipCode.getValue());
        person.setCity(city.getValue());
        person.setPhoneNumber(phoneNumber.getValue());
        person.setEmailAddress(emailAddress.getValue());
        person.setBirthday(birthday.getValue());
    }
}
