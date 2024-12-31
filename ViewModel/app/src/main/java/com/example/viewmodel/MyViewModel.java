package com.example.viewmodel;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    // Declare a variable to store the counter value
    int counter = 0;

    // Method to increment the counter
    public void increaseCounter() {
        // Increment the counter value
        counter++;
    }

    // Method to get the current counter value
    public int getCounter() {
        // Return the current counter value
        return counter;
    }
}
