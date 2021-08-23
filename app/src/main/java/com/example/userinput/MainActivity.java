



package com.example.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //creating a constant to be used with intent.
    //its name should include the package name
    //AND describe what is being sent.

    public static final String EXTRA_NAME = "com.example.userinput_teacherversion.NAME";

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

    //This method is an example of taking text from an EditText and
    //displaying it on the SAME SCREEN (ACTIVITY)

    public void makeName(View v) {
        EditText firstNameET = findViewById(R.id.firstNameEditText);
        EditText lastNameET = findViewById(R.id.lastNameEditText);

        String firstName = firstNameET.getText().toString();
        String lastName = lastNameET.getText().toString();

        String fullName = firstName + " " + lastName;
        TextView fullNameTextView = findViewById(R.id.completeNameTextView);
        fullNameTextView.setText(fullName);
    }


//This method is an example of taking text from an EditText on one screen
//and displaying it on A DIFFERENT SCREEN> We are using Intents to switch
//activities

    public void sendMessage(View v) {
        //Creating the ability to switch screens (addressing envelope)
        Intent intent = new Intent(this, DispayWelcomeActivity.class);

        //Getting all info from the screen we want to send
        EditText firstNameET = findViewById(R.id.firstNameEditText);
        EditText lastNameET = findViewById(R.id.lastNameEditText);

        String firstName = firstNameET.getText().toString();
        String lastName = lastNameET.getText().toString();

        String fullName = firstName + " " + lastName;
        //Sending the info with the intent (filling the envelope)
        intent.putExtra(EXTRA_NAME, fullName);
        //telling AS to start this activity which will switch the screens
        //like mailing the envelope
        startActivity(intent);
    }
}