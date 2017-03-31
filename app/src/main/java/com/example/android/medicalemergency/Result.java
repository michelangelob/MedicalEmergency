package com.example.android.medicalemergency;

import android.content.Intent;
import android.os.Bundle;
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

        switch (nro_wrong) {
            case 0:
            case 1:
                ImageView imageViewGreen = (ImageView) findViewById(R.id.Result_quiz_image_view);
                imageViewGreen.setImageResource(R.drawable.green);
                break;
            case 2:
            case 3:
                ImageView imageViewYellow = (ImageView) findViewById(R.id.Result_quiz_image_view);
                imageViewYellow.setImageResource(R.drawable.yellow);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                ImageView imageViewRed = (ImageView) findViewById(R.id.Result_quiz_image_view);
                imageViewRed.setImageResource(R.drawable.red);
                break;
        }

        TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);
        ResultTextView.setText(i.getStringExtra("result_message"));

    }


}
