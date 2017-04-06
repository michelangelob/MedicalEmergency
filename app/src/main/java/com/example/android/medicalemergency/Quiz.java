package com.example.android.medicalemergency;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;


/**
 * Created by Michelangelo.Bottali on 28/03/2017.
 */

public class Quiz extends MainActivity{


    ArrayList<Boolean> Answer = new ArrayList<>();


    ArrayList<String> AnswerDescription = new ArrayList<>();
    public String result_message="";
    public String ok="OTTIMO! ";
    public String ko="RISPOSTA SBAGLIATA! ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        RadioGroup RadioButton0 = (RadioGroup)findViewById(R.id.radio_Question0);
        RadioButton0.clearCheck();
        RadioGroup RadioButton1 = (RadioGroup)findViewById(R.id.radio_Question1);
        RadioButton1.clearCheck();
        RadioGroup RadioButton2 = (RadioGroup)findViewById(R.id.radio_Question2);
        RadioButton2.clearCheck();
        RadioGroup RadioButton3 = (RadioGroup)findViewById(R.id.radio_Question3);
        RadioButton3.clearCheck();
        RadioGroup RadioButton4 = (RadioGroup)findViewById(R.id.radio_Question4);
        RadioButton4.clearCheck();
        RadioGroup RadioButton5 = (RadioGroup)findViewById(R.id.radio_Question5);
        RadioButton5.clearCheck();

        for (int i = 0; i < 6; i++){
            Answer.add(i,false);
            AnswerDescription.add(i,"");}
    }


    public void onRadioQuestion0_Clicked(View view) {
        // Is the button now checked?


        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_Question0_1:
                if (checked) {
                    result_message = ok+getString(R.string.Answer0)+" ";
                    result_message += getString(R.string.Answer0_1)+ "\n\n";
                    AnswerDescription.add(0,result_message);
                    Answer.add(0,true);
                }
                    break;
            case R.id.radio_Question0_2:
                if (checked){
                    result_message = ko+getString(R.string.Answer0)+" ";
                    result_message += getString(R.string.Answer0_1)+" ";
                    result_message += getString(R.string.Answer0_2)  + "\n\n";
                    AnswerDescription.add(0,result_message);
                    Answer.add(0,false);
                }
                    break;
            case R.id.radio_Question0_3:
                if (checked) {
                    result_message = ko+getString(R.string.Answer0)+" ";
                    result_message += getString(R.string.Answer0_1)+" ";
                    result_message += getString(R.string.Answer0_3)  + "\n\n";
                    AnswerDescription.add(0,result_message);
                    Answer.add(0,false);
                }
                    break;
        }
    }
    public void onRadioQuestion1_Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
      switch(view.getId()) {
        case R.id.radio_Question1_1:
            if (checked) {
                result_message = ok+getString(R.string.Answer1)+" ";
                result_message += getString(R.string.Answer1_1)+ "\n\n";
                AnswerDescription.add(1,result_message);
                Answer.add(1,true);
            }
            break;
        case R.id.radio_Question1_2:
            if (checked){
                result_message = ko+getString(R.string.Answer1)+" ";
                result_message += getString(R.string.Answer1_1)+" ";
                result_message += getString(R.string.Answer1_2)  + "\n\n";
                AnswerDescription.add(1,result_message);
                Answer.add(1,false);
            }
            break;
        case R.id.radio_Question1_3:
            if (checked) {
                result_message = ko+getString(R.string.Answer1)+" ";
                result_message += getString(R.string.Answer1_1)+" ";
                result_message += getString(R.string.Answer1_3)  + "\n\n";
                AnswerDescription.add(1,result_message);
                Answer.add(1,false);
            }
            break;
    }
}

    public void onRadioQuestion2_Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_Question2_1:
                if (checked) {
                    result_message = ko+getString(R.string.Answer2)+" ";
                    result_message += getString(R.string.Answer2_3)+" ";
                    result_message += getString(R.string.Answer2_1)  + "\n\n";
                    Answer.add(2,false);
                    AnswerDescription.add(2,result_message);
                }
                break;
            case R.id.radio_Question2_2:
                if (checked){
                    result_message = ko+getString(R.string.Answer2)+" ";
                    result_message += getString(R.string.Answer2_3)+" ";
                    result_message += getString(R.string.Answer2_2)  + "\n\n";
                    Answer.add(2,false);
                    AnswerDescription.add(2,result_message);
                }
                break;
            case R.id.radio_Question2_3:
                if (checked) {
                    result_message = ok+getString(R.string.Answer2)+" ";
                    result_message += getString(R.string.Answer2_3) + "\n\n";
                    Answer.add(2,true);
                    AnswerDescription.add(2,result_message);
                }
                break;
        }
    }
    public void onRadioQuestion3_Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_Question3_1:
                if (checked) {
                    result_message = ko+getString(R.string.Answer3)+" ";
                    result_message += getString(R.string.Answer3_2)+" ";
                    result_message += getString(R.string.Answer3_1)  + "\n\n";
                    Answer.add(3,false);
                    AnswerDescription.add(3,result_message);
                }
                break;
            case R.id.radio_Question3_2:
                if (checked){
                    result_message = ok + getString(R.string.Answer3)+" ";
                    result_message += getString(R.string.Answer3_2)+ "\n\n";
                    Answer.add(3,true);
                    AnswerDescription.add(3,result_message);
                }
                break;
            case R.id.radio_Question3_3:
                if (checked) {
                    result_message = ko+getString(R.string.Answer3)+" ";
                    result_message += getString(R.string.Answer3_2)+" ";
                    result_message += getString(R.string.Answer3_3)  + "\n\n";
                    Answer.add(3,false);
                    AnswerDescription.add(3,result_message);
                }
                break;
        }
    }
    public void onRadioQuestion4_Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_Question4_1:
                if (checked) {
                    result_message = ko+getString(R.string.Answer4)+" ";
                    result_message += getString(R.string.Answer4_3)+" ";
                    result_message += getString(R.string.Answer4_1)  + "\n\n";
                    Answer.add(4,false);
                    AnswerDescription.add(4,result_message);
                }
                break;
            case R.id.radio_Question4_2:
                if (checked){
                    result_message = ko+getString(R.string.Answer4)+" ";
                    result_message += getString(R.string.Answer4_3)+" ";
                    result_message += getString(R.string.Answer4_2)  + "\n\n";
                    Answer.add(4,false);
                    AnswerDescription.add(4,result_message);
                }
                break;
            case R.id.radio_Question4_3:
                if (checked) {
                    result_message = ok+getString(R.string.Answer4)+" ";
                    result_message += getString(R.string.Answer4_3)+ "\n\n";
                    Answer.add(4,true);
                    AnswerDescription.add(4,result_message);
                }
                break;
        }
    }
    public void onRadioQuestion5_Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_Question5_1:
                if (checked) {
                    result_message = ko+getString(R.string.Answer5)+" ";
                    result_message += getString(R.string.Answer5_2)+" ";
                    result_message += getString(R.string.Answer5_1)  + "\n\n";
                    Answer.add(5,false);
                    AnswerDescription.add(5,result_message);
                }
                break;
            case R.id.radio_Question5_2:
                if (checked){
                    result_message = ok+getString(R.string.Answer5)+" ";
                    result_message += getString(R.string.Answer5_2)+ "\n\n";
                    Answer.add(5,true);
                    AnswerDescription.add(5,result_message);
                }
                break;
            case R.id.radio_Question5_3:
                if (checked) {
                    result_message = ko+getString(R.string.Answer5)+" ";
                    result_message += getString(R.string.Answer5_2)+" ";
                    result_message += getString(R.string.Answer5_3)  + "\n\n";
                    Answer.add(5,false);
                    AnswerDescription.add(5,result_message);
                }
                break;
        }
    }
    public void Result(View view) {

        int nro_wrong = 0;
        int nro_question = 0;
        String result_send ="";

        for (int i = 0; i < 6; i++) {
            result_send += AnswerDescription.get(i);
            if(Answer.get(i)) {
                nro_question ++;
            }
            else{
                nro_question ++;
                nro_wrong ++;
            }
        }
        Intent intent = new Intent(this, Result.class);

        intent.putExtra("result_send", result_send);
        intent.putExtra("nro_wrong", nro_wrong);
        intent.putExtra("nro_question", nro_question);
        startActivity(intent);
    }
}

