package com.example.android.medicalemergency;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;


/**
 * Created by Michelangelo.Bottali on 28/03/2017.
 */

public class Quiz extends MainActivity{




    //String question1 ="Mantieni la calma mentre cerchi di aiutare qualcuno che sta svenendo. Se ti accorgi che una persona sta iniziando a manifestare segni di svenimento, afferrala e aiutala ad accasciarsi lentamente a terra.";
    //String question2 ="Prova a toccarla o a scuoterla per vedere se riprende conoscenza. Nella maggior parte dei casi, le persone svenute riprendono coscienza rapidamente (di solito entro 20 secondi o 2 minuti).";
    //String question3 ="Allentale eventuali abiti costrittivi (come una cravatta o un colletto stretto) per metterla nella condizione più confortevole possibile";
    //String question4 ="Se non riprende conoscenza, controllale il polso. Chiama o chiedi a qualcun altro di chiamare un'ambulanza. Questa è anche l'occasione per chiedere a qualcuno di procurare un defibrillatore esterno automatico (AED).";
    //String question5 ="Procedi alla rianimazione cardiopolmonare (RCP), se non riscontri alcun battito cardiaco. Se non hai familiarità con questa tecnica, cerca un medico o un professionista esperto nella RCP che possa eseguirla.";
    //String question6 ="Mantieni la calma e rassicura la vittima. Mantenere un atteggiamento pacato e confortare la vittima, ti permette di gestire la situazione ed essere veramente di aiuto.";
    //String question7 ="Impara a riconoscere i segni di un imminente svenimento. Una delle cose migliori che puoi fare, se hai la tendenza a svenire abbastanza spesso, è quella di imparare a riconoscerne i segnali. ";
    //String question8 ="Trova un luogo dove sdraiarti, se ti senti sul punto di svenire. Solleva le gambe per favorire il flusso di sangue al cervello.";
    //String question9 ="Respira profondamente. Inizia a fare dei respiri profondi inspirando attraverso il naso ed espirando attraverso la bocca. Questo, tra l'altro, ha anche un effetto calmante.";
    //String question10 ="È una buona idea chiedere aiuto a chi ti sta vicino, in modo da avvertire le altre persone presenti della tua situazione. In questo modo un'altra persona può afferrarti nel caso stessi per cadere, metterti in una posizione sicura per evitarti lesioni e chiamare un medico, se necessario.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

    }



    public void Result(View view) {
        int nro_wrong = 0;
        String result_message="";

        ArrayList<String> Answer = new ArrayList<>();

        Answer.add(getString(R.string.Answer1));
        Answer.add(getString(R.string.Answer2));
        Answer.add(getString(R.string.Answer3));
        Answer.add(getString(R.string.Answer4));
        Answer.add(getString(R.string.Answer5));
        Answer.add(getString(R.string.Answer6));
        Answer.add(getString(R.string.Answer7));
        Answer.add(getString(R.string.Answer8));
        Answer.add(getString(R.string.Answer9));
        Answer.add(getString(R.string.Answer10));

        ArrayList<Boolean> Question = new ArrayList<>();

        CheckBox Question1Checkbox = (CheckBox) findViewById(R.id.Question1Checkbox);
        Question.add(Question1Checkbox.isChecked());
        CheckBox Question2Checkbox = (CheckBox) findViewById(R.id.Question2Checkbox);
        Question.add(Question2Checkbox.isChecked());
        CheckBox Question3Checkbox = (CheckBox) findViewById(R.id.Question3Checkbox);
        Question.add(Question3Checkbox.isChecked());
        CheckBox Question4Checkbox = (CheckBox) findViewById(R.id.Question4Checkbox);
        Question.add(Question4Checkbox.isChecked());
        CheckBox Question5Checkbox = (CheckBox) findViewById(R.id.Question5Checkbox);
        Question.add(Question5Checkbox.isChecked());
        CheckBox Question6Checkbox = (CheckBox) findViewById(R.id.Question6Checkbox);
        Question.add(Question6Checkbox.isChecked());
        CheckBox Question7Checkbox = (CheckBox) findViewById(R.id.Question7Checkbox);
        Question.add(Question7Checkbox.isChecked());
        CheckBox Question8Checkbox = (CheckBox) findViewById(R.id.Question8Checkbox);
        Question.add(Question8Checkbox.isChecked());
        CheckBox Question9Checkbox = (CheckBox) findViewById(R.id.Question9Checkbox);
        Question.add(Question9Checkbox.isChecked());
        CheckBox Question10Checkbox = (CheckBox) findViewById(R.id.Question10Checkbox);
        Question.add(Question10Checkbox.isChecked());

        for (int i = 1; i < 10; i++) {
            if(Question.get(i)) {
                result_message += Answer.get(i) + "\n\n";
                nro_wrong ++;
            }
        }

        Intent intent = new Intent(this, Result.class);

        intent.putExtra("result_message", result_message);
        intent.putExtra("nro_wrong", nro_wrong);
        startActivity(intent);
    }
}
