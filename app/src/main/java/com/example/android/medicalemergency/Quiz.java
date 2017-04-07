package com.example.android.medicalemergency;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by Michelangelo.Bottali on 28/03/2017.
 */

public class Quiz extends MainActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

    }

    public void Result(View view) {

        int not_selected=0;
        int nro_wrong = 0;
        int nro_question = 6;
        String ok = getString(R.string.ok) + " ";
        String ko = getString(R.string.ko) + " ";

        String result_message="";
        String result_send ="";

        RadioGroup radioGroup0 = (RadioGroup)findViewById(R.id.radio_Question0);
        if (radioGroup0.getCheckedRadioButtonId() == -1)
            not_selected ++;

        RadioButton radiobutton0_1 = (RadioButton)findViewById(R.id.radio_Question0_1);
        if (radiobutton0_1.isChecked()) {
            result_message += ok+getString(R.string.Answer0)+" ";
            result_message += getString(R.string.Answer0_1)+ "\n\n";
        }

        RadioButton radiobutton0_2 = (RadioButton)findViewById(R.id.radio_Question0_2);
        if (radiobutton0_2.isChecked()) {
            result_message += ko+getString(R.string.Answer0)+" ";
            result_message += getString(R.string.Answer0_1)+" ";
            result_message += getString(R.string.Answer0_2)  + "\n\n";
            nro_wrong ++;}

        RadioButton radiobutton0_3 = (RadioButton)findViewById(R.id.radio_Question0_3);
        if (radiobutton0_3.isChecked()) {
            result_message += ko+getString(R.string.Answer0)+" ";
            result_message += getString(R.string.Answer0_1)+" ";
            result_message += getString(R.string.Answer0_3)  + "\n\n";
            nro_wrong ++;}


        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.radio_Question1);
        if (radioGroup1.getCheckedRadioButtonId() == -1)
            not_selected ++;

        RadioButton radiobutton1_1 = (RadioButton)findViewById(R.id.radio_Question1_1);
        if (radiobutton1_1.isChecked()) {
            result_message += ok+getString(R.string.Answer1)+" ";
            result_message += getString(R.string.Answer1_1)+ "\n\n";}

        RadioButton radiobutton1_2 = (RadioButton)findViewById(R.id.radio_Question1_2);
        if (radiobutton1_2.isChecked()) {
            result_message += ko+getString(R.string.Answer1)+" ";
            result_message += getString(R.string.Answer1_1)+" ";
            result_message += getString(R.string.Answer1_2)  + "\n\n";
            nro_wrong ++;}

        RadioButton radiobutton1_3 = (RadioButton)findViewById(R.id.radio_Question1_3);
        if (radiobutton1_3.isChecked()) {
            result_message += ko+getString(R.string.Answer1)+" ";
            result_message += getString(R.string.Answer1_1)+" ";
            result_message += getString(R.string.Answer1_3)  + "\n\n";
            nro_wrong ++;}

        RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.radio_Question2);
        if (radioGroup2.getCheckedRadioButtonId() == -1)
            not_selected ++;

        RadioButton radiobutton2_1 = (RadioButton)findViewById(R.id.radio_Question2_1);
        if (radiobutton2_1.isChecked()) {
            result_message += ko+getString(R.string.Answer2)+" ";
            result_message += getString(R.string.Answer2_3)+" ";
            result_message += getString(R.string.Answer2_1)  + "\n\n";
            nro_wrong ++;
        }

        RadioButton radiobutton2_2 = (RadioButton)findViewById(R.id.radio_Question2_2);
        if (radiobutton2_2.isChecked()) {
            result_message += ko+getString(R.string.Answer2)+" ";
            result_message += getString(R.string.Answer2_3)+" ";
            result_message += getString(R.string.Answer2_2)  + "\n\n";
            nro_wrong ++;
        }

        RadioButton radiobutton2_3 = (RadioButton)findViewById(R.id.radio_Question2_3);
        if (radiobutton2_3.isChecked()) {
            result_message += ok+getString(R.string.Answer2)+" ";
            result_message += getString(R.string.Answer2_3) + "\n\n";
        }

        RadioGroup radioGroup3 = (RadioGroup)findViewById(R.id.radio_Question3);
        if (radioGroup3.getCheckedRadioButtonId() == -1)
            not_selected ++;

        RadioButton radiobutton3_1 = (RadioButton)findViewById(R.id.radio_Question3_1);
        if (radiobutton3_1.isChecked()) {
            result_message += ko+getString(R.string.Answer3)+" ";
            result_message += getString(R.string.Answer3_2)+" ";
            result_message += getString(R.string.Answer3_1)  + "\n\n";
            nro_wrong ++;
        }

        RadioButton radiobutton3_2 = (RadioButton)findViewById(R.id.radio_Question3_2);
        if (radiobutton3_2.isChecked()) {
            result_message += ok + getString(R.string.Answer3)+" ";
            result_message += getString(R.string.Answer3_2)+ "\n\n";
        }

        RadioButton radiobutton3_3 = (RadioButton)findViewById(R.id.radio_Question3_3);
        if (radiobutton3_3.isChecked()) {
            result_message += ko+getString(R.string.Answer3)+" ";
            result_message += getString(R.string.Answer3_2)+" ";
            result_message += getString(R.string.Answer3_3)  + "\n\n";
            nro_wrong ++;
        }

        RadioGroup radioGroup4 = (RadioGroup)findViewById(R.id.radio_Question4);
        if (radioGroup4.getCheckedRadioButtonId() == -1)
            not_selected ++;

        RadioButton radiobutton4_1 = (RadioButton)findViewById(R.id.radio_Question4_1);
        if (radiobutton4_1.isChecked()) {
            result_message += ko+getString(R.string.Answer4)+" ";
            result_message += getString(R.string.Answer4_3)+" ";
            result_message += getString(R.string.Answer4_1)  + "\n\n";
            nro_wrong ++;
        }

        RadioButton radiobutton4_2 = (RadioButton)findViewById(R.id.radio_Question4_2);
        if (radiobutton4_2.isChecked()) {
            result_message += ko+getString(R.string.Answer4)+" ";
            result_message += getString(R.string.Answer4_3)+" ";
            result_message += getString(R.string.Answer4_2)  + "\n\n";
            nro_wrong ++;
        }

        RadioButton radiobutton4_3 = (RadioButton)findViewById(R.id.radio_Question4_3);
        if (radiobutton4_3.isChecked()) {
            result_message += ok+getString(R.string.Answer4)+" ";
            result_message += getString(R.string.Answer4_3)+ "\n\n";
        }

        RadioGroup radioGroup5 = (RadioGroup)findViewById(R.id.radio_Question5);
        if (radioGroup5.getCheckedRadioButtonId() == -1)
            not_selected ++;

        RadioButton radiobutton5_1 = (RadioButton)findViewById(R.id.radio_Question5_1);
        if (radiobutton5_1.isChecked()) {
            result_message += ko+getString(R.string.Answer5)+" ";
            result_message += getString(R.string.Answer5_2)+" ";
            result_message += getString(R.string.Answer5_1)  + "\n\n";
            nro_wrong ++;
        }

        RadioButton radiobutton5_2 = (RadioButton)findViewById(R.id.radio_Question5_2);
        if (radiobutton5_2.isChecked()) {
            result_message += ok+getString(R.string.Answer5)+" ";
            result_message += getString(R.string.Answer5_2)+ "\n\n";
        }

        RadioButton radiobutton5_3 = (RadioButton)findViewById(R.id.radio_Question5_3);
        if (radiobutton5_3.isChecked()) {
            result_message += ko+getString(R.string.Answer5)+" ";
            result_message += getString(R.string.Answer5_2)+" ";
            result_message += getString(R.string.Answer5_3)  + "\n\n";
            nro_wrong ++;
        }


        if (not_selected==0)
        {
            nro_wrong = nro_wrong-not_selected;
            Intent intent = new Intent(this, Result.class);
            intent.putExtra("result_message", result_message);
            intent.putExtra("nro_wrong", nro_wrong);
            intent.putExtra("nro_question", nro_question);
            startActivity(intent);
        }
        else
        {
            Context context = getApplicationContext();
            CharSequence text = getString(R.string.noRespose1)+" " + not_selected +" " + getString(R.string.noRespose2) ;
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
            toast.show();
        }
    }
}