package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitAnswers(View view) {

        // Declaring variable for final result
 int result = 0;

// Getting The answers from XML
        EditText answerOne = (EditText) findViewById(R.id.answer_1);
        RadioButton answerTwo = (RadioButton) findViewById(R.id.answer_2);
        EditText answerThree = (EditText) findViewById(R.id.answer_3);
        CheckBox answerFourOne = (CheckBox) findViewById(R.id.answer_41);
        CheckBox answerFourThree = (CheckBox) findViewById(R.id.answer_43);
        RadioButton answerFive = (RadioButton) findViewById(R.id.answer_5);
        EditText answerSix = (EditText) findViewById(R.id.answer_6);
        CheckBox answerSevenOne = (CheckBox) findViewById(R.id.answer_71);
        CheckBox answerSevenThree = (CheckBox) findViewById(R.id.answer_73);
        EditText answerEight = (EditText) findViewById(R.id.answer_8);
        RadioButton answerNine = (RadioButton) findViewById(R.id.answer_9);
        EditText answerTen = (EditText) findViewById(R.id.answer_10);

// Putting the state of each answers into variables

        String answer1 = answerOne.getEditableText().toString();
       boolean answer2 = answerTwo.isChecked();
        String answer3 = answerThree.getEditableText().toString();
        boolean answer41 = answerFourOne.isChecked();
        boolean answer43 = answerFourThree.isChecked();
        boolean answer5 = answerFive.isChecked();
        String answer6 = answerSix.getEditableText().toString();
        boolean answer71 = answerSevenOne.isChecked();
        boolean answer73 = answerSevenThree.isChecked();
        String answer8 = answerEight.getEditableText().toString();
        boolean answer9 = answerNine.isChecked();
        String answer10 = answerTen.getEditableText().toString();

//  Verifying if the answers got match with the correct ones

        if (answer1.equalsIgnoreCase("An emperor") || answer1.equalsIgnoreCase("Emperor") ) {
            result = result +1;
        }
        if (answer2) {
            result= result +1; }

        if (answer3.equalsIgnoreCase("baby")) {
            result = result +1;
        }
        if (answer41 && answer43) {
            result = result +1;
        }
        if (answer5) {
            result = result +1;
        }
        if (answer6.equalsIgnoreCase("Leon Tolstoi") || answer6.equalsIgnoreCase("Tolstoi") ) {
            result = result +1;
        }
        if (answer71 && answer73) {
            result = result +1;
        }if (answer8.equalsIgnoreCase("Japan")) {
            result = result +1;
        }
        if (answer9) {
            result = result +1;
        }
        if (answer10.equalsIgnoreCase("picasso") || answer10.equalsIgnoreCase("Pablo Picasso") ) {
            result = result +1;
        }

// For each result we have a particular toast message

        Context context = getApplicationContext();

        if (result <= 4 ){
            CharSequence text = "Oh ! "+result+"/10, at least you tried. Keep going !";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        else if (result >=5 && result <=7){
            CharSequence text = "Hey "+result+"/10, you seem pretty good.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        else if (result >=8 && result <=9){
            CharSequence text = "You rock mate "+result+"/10, OOOH YEAH !";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        else {

            CharSequence text = "OMG "+result+"/10, You're sure you didn't make this app ?! ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }





    }


}
