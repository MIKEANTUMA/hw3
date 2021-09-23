package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class question7 extends AppCompatActivity {

    String money;
    RadioGroup r;
    TextView m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
        r = findViewById(R.id.q1answer);
        money = getString(R.string.money);
        m = findViewById(R.id.money1);

    }

    //checking to see if the answer is right
    public void confirm(View view) {
        int answer = r.getCheckedRadioButtonId();
        if(answer == R.id.q1a3){
            m.setText("700 AND YOU WIN!!");
            Toast.makeText(getApplicationContext(),
                    "Correct",
                    Toast.LENGTH_LONG).show();
        }
        else if(answer == r.getCheckedRadioButtonId())
        {
            Toast.makeText(getApplicationContext(),"Wrong answer", Toast.LENGTH_LONG).show();
        }
        else if(answer == r.getCheckedRadioButtonId()){
            Toast.makeText(getApplicationContext(), "wrong answer", Toast.LENGTH_LONG).show();
        }
    }
}