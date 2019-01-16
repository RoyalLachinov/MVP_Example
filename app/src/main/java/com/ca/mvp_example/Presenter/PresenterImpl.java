package com.ca.mvp_example.Presenter;

/** This interface represents the Presenter in MVP. */

public interface PresenterImpl {

    void loadMessage();

    void saveName(String firstName, String lastName);
}
