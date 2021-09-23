package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String money;
    RadioGroup r;
    TextView m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = findViewById(R.id.q1answer);
        money = getString(R.string.money);
        m = findViewById(R.id.money1);

    }
    //checking to see if the answer is right
    public void confirm(View view) {
        int answer = r.getCheckedRadioButtonId();

        if(answer == R.id.q1a1){
            m.setText("100");
            Toast.makeText(getApplicationContext(),
                    "Correct",
                    Toast.LENGTH_LONG).show();
            //go to next activity
            Intent intent = new Intent(this, question2.class);
            startActivity(intent);
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