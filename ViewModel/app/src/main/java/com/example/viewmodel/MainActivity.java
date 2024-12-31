package com.example.viewmodel;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.viewmodel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Declare a ViewModel instance for managing UI-related data
    MyViewModel viewModel;

    // Declare a DataBinding object to bind the layout with the activity
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        // Step 1: Bind the layout to the activity using DataBindingUtil
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Step 2: Initialize the ViewModel to manage UI-related data
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        // Step 3: Set up a click listener on the button to increase the counter
        mainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Increment the counter using the ViewModel method
                viewModel.increaseCounter();

                // Update the second TextView with the current counter value
                mainBinding.textView2.setText("" + viewModel.getCounter());
            }
        });

        // Step 4: Initialize the second TextView with the current counter value
        mainBinding.textView2.setText("" + viewModel.getCounter());
    }
}