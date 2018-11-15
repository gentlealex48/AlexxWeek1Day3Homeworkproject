package com.kkaty.alexxweek1day3homeworkproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tvHelloMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHelloMessage = findViewById(R.id.tvHelloMessanger);

        Person thefirstPerson = new Person("Adam",100);
        tvHelloMessage.setText(thefirstPerson.getName()+" "+thefirstPerson.getAge()+" "
                +thefirstPerson.getReproduction()+" "+thefirstPerson.getType());
    }
}
