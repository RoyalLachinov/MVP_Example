package com.ca.mvp_example.Presenter;

import com.ca.mvp_example.Model.Person;
import com.ca.mvp_example.View.ViewImpl;

public class PresenterClass implements PresenterImpl {

    private Person person;
    private ViewImpl view;


    public PresenterClass ( ViewImpl view){
        this.person = new Person();
        this.view = view;

    }
    @Override
    public void loadMessage() {

        if (person.getFirstName() == null && person.getLastName() == null) {
            view.showError("No person name found.");
            return;
        }

        String message = "Hi " + person.getName() + "!";
        view.showMessage(message);

    }

    @Override
    public void saveName(String firstName, String lastName) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
    }
}
