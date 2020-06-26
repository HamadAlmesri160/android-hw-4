package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText quiz = findViewById(R.id.quiz);
        final EditText homework = findViewById(R.id.homework);
        final EditText midterm = findViewById(R.id.midterm);
        final EditText finall = findViewById(R.id.finall);
        final Button reset = findViewById(R.id.reset);
        final TextView grade = findViewById(R.id.grade);
        final Button calculate = findViewById(R.id.calculate);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p1  = Integer.parseInt(quiz.getText().toString());
                int p2  = Integer.parseInt(homework.getText().toString());
                int p3  = Integer.parseInt(midterm.getText().toString());
                int p4  = Integer.parseInt(finall.getText().toString());


                final int gg = (p1 + p2 + p3 + p4) ;



                System.out.println(gg);



                grades(gg);
            }
        });



        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quiz.setText(null);
                homework.setText(null);
                midterm.setText(null);
                finall.setText(null);
                grade.setText("Enter the requirements to get your grade");
            }
        });

}
        public void grades(int gg )
        {
             String g = "L" ;
            final TextView grade = findViewById(R.id.grade);
             if (gg > 100){
            grade.setText("Really??");
        }
            else if (gg >= 90){
                grade.setText("Congrats you got "+ gg  + "% With A Mark");
            }
            else if (gg >= 80){
                grade.setText("Congrats you got "+ gg  + "% With B Mark");
            }
            else if (gg >= 70){
                grade.setText("Congrats you got "+ gg  + "% With C Mark");
            }
            else if (gg >= 60){
                grade.setText("Congrats you got "+ gg  + "% With D Mark");
            }
             else if (gg <= 30){
                 grade.setText("Are you alive?? Just Die ");
             }
            else if (gg >= 60){
                grade.setText("Congrats you got "+ gg  + "% With D Mark");
            }
             else if (gg < 60){
                 grade.setText("You Are soo Bad You got "+ gg  + "% Shame on you!");
             }

            else if (gg >= 30){
                grade.setText("invalid input :)");
             }

        }
}