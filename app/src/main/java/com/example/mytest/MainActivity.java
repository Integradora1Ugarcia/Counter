package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private Button max, min;
    private TextView incremento;

    private int contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incremento = findViewById(R.id.txv_increase);

        max = findViewById(R.id.btn_max);
        min = findViewById(R.id.btn_min);


        max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                incremento.setText(""+contador);
            }
        });


        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador--;
                incremento.setText(""+contador);
            }
        });



        /**if (contador==10){

            max.setText("Max");

        } else if(contador==0){
           min.setText("Min");

        }else if(contador==1){
            min.setText("-");
        }else if(contador==349){
            max.setText("+");
        }**/


    }




   /* @Override
    public void onClick(View view) {
        // Selector que actuará en función al botón que llame al evento.
        switch (view.getId()) {
            // En el caso de que lo llame el botón más.
            case R.id.btn_max:
                contador++;
                incremento.setText(+contador);


                break;
            // En el caso de que lo llame el botón menos.
            case R.id.btn_min:
                contador--;
                incremento.setText(+contador);

                break;

        }
    }*/



}
