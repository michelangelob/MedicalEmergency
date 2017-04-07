package com.example.android.medicalemergency;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Michelangelo.Bottali on 29/03/2017.
 */

public class Result extends MainActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Intent i=getIntent();

        int nro_wrong=0;
        nro_wrong = i.getIntExtra("nro_wrong",nro_wrong);

        int nro_question=0;
        nro_question = i.getIntExtra("nro_question",nro_question);

        TextView ResultMessage = (TextView) findViewById(R.id.ResultMessageTextView);


        switch (nro_wrong) {
            case 0:
                ImageView imageViewGreen = (ImageView) findViewById(R.id.Result_quiz_image_view);
                imageViewGreen.setImageResource(R.drawable.green);
                ResultMessage.setText(getString(R.string.greenMessage));

                break;
            case 1:
                ImageView imageViewYellow = (ImageView) findViewById(R.id.Result_quiz_image_view);
                imageViewYellow.setImageResource(R.drawable.yellow);
                ResultMessage.setText(getString(R.string.yellowMessage) + " " +nro_question +getString(R.string.yellowMessage1));
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                ImageView imageViewRed = (ImageView) findViewById(R.id.Result_quiz_image_view);
                imageViewRed.setImageResource(R.drawable.red);
                ResultMessage.setText(getString(R.string.redMessage1) + " " + nro_wrong + " " + getString(R.string.redMessage2)  + " " + nro_question + getString(R.string.redMessage3) );
                break;
        }

        TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);
        ResultTextView.setText(i.getStringExtra("result_message"));

    }
    public void RepeatQuiz(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }


}
