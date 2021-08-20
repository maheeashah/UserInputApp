package com.example.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


/* Anytime a method is to be called from a button click. it MUST HAVE a specific type
 of method signature. If you don't use the right signature, your button will NOT be
  allowed to call this method.


  public void methodName(View v) {
  }
  View is a class that you need to import

 */

    public void makeName(View v) {
        EditText firstNameET = findViewById(R.id.firstNameEditText);
        EditText lastNameET = findViewById(R.id.lastNameEditText);

        String firstName = firstNameET.getText().toString();
        String lastName = lastNameET.getText().toString();

        String fullName = firstName + " " + lastName;
        TextView fullNameTextView = findViewById(R.id.completeNameTextView);
        fullNameTextView.setText(fullName);
    }
}
