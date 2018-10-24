package com.example.juanpablomartinezbrenes.extraclase4;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("CutPasteId")

    TextView[][] matriz;
    int i, j;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        matriz = new TextView[8][8];
        i = j = 0;

        matriz[0][0] = findViewById(R.id.a0);
        matriz[0][1] = findViewById(R.id.a1);
        matriz[0][2] = findViewById(R.id.a2);
        matriz[0][3] = findViewById(R.id.a3);
        matriz[0][4] = findViewById(R.id.a4);
        matriz[0][5] = findViewById(R.id.a5);
        matriz[0][6] = findViewById(R.id.a6);
        matriz[0][7] = findViewById(R.id.a7);

        matriz[1][0] = findViewById(R.id.b0);
        matriz[1][1] = findViewById(R.id.b1);
        matriz[1][2] = findViewById(R.id.b2);
        matriz[1][3] = findViewById(R.id.b3);
        matriz[1][4] = findViewById(R.id.b4);
        matriz[1][5] = findViewById(R.id.b5);
        matriz[1][6] = findViewById(R.id.b6);
        matriz[1][7] = findViewById(R.id.b7);

        matriz[2][0] = findViewById(R.id.c0);
        matriz[2][1] = findViewById(R.id.c1);
        matriz[2][2] = findViewById(R.id.c2);
        matriz[2][3] = findViewById(R.id.c3);
        matriz[2][4] = findViewById(R.id.c4);
        matriz[2][5] = findViewById(R.id.c5);
        matriz[2][6] = findViewById(R.id.c6);
        matriz[2][7] = findViewById(R.id.c7);

        matriz[3][0] = findViewById(R.id.d0);
        matriz[3][1] = findViewById(R.id.d1);
        matriz[3][2] = findViewById(R.id.d2);
        matriz[3][3] = findViewById(R.id.d3);
        matriz[3][4] = findViewById(R.id.d4);
        matriz[3][5] = findViewById(R.id.d5);
        matriz[3][6] = findViewById(R.id.d6);
        matriz[3][7] = findViewById(R.id.d7);

        matriz[4][0] = findViewById(R.id.e0);
        matriz[4][1] = findViewById(R.id.e1);
        matriz[4][2] = findViewById(R.id.e2);
        matriz[4][3] = findViewById(R.id.e3);
        matriz[4][4] = findViewById(R.id.e4);
        matriz[4][5] = findViewById(R.id.e5);
        matriz[4][6] = findViewById(R.id.e6);
        matriz[4][7] = findViewById(R.id.e7);

        matriz[5][0] = findViewById(R.id.f0);
        matriz[5][1] = findViewById(R.id.f1);
        matriz[5][2] = findViewById(R.id.f2);
        matriz[5][3] = findViewById(R.id.f3);
        matriz[5][4] = findViewById(R.id.f4);
        matriz[5][5] = findViewById(R.id.f5);
        matriz[5][6] = findViewById(R.id.f6);
        matriz[5][7] = findViewById(R.id.f7);

        matriz[6][0] = findViewById(R.id.g0);
        matriz[6][1] = findViewById(R.id.g1);
        matriz[6][2] = findViewById(R.id.g2);
        matriz[6][3] = findViewById(R.id.g3);
        matriz[6][4] = findViewById(R.id.g4);
        matriz[6][5] = findViewById(R.id.g5);
        matriz[6][6] = findViewById(R.id.g6);
        matriz[6][7] = findViewById(R.id.g7);

        matriz[7][0] = findViewById(R.id.h0);
        matriz[7][1] = findViewById(R.id.h1);
        matriz[7][2] = findViewById(R.id.h2);
        matriz[7][3] = findViewById(R.id.h3);
        matriz[7][4] = findViewById(R.id.h4);
        matriz[7][5] = findViewById(R.id.h5);
        matriz[7][6] = findViewById(R.id.h6);
        matriz[7][7] = findViewById(R.id.h7);
    }


    public void play(View view) {
        matriz[i][j].setBackgroundColor(Color.GREEN);
        matriz[i][j].setText("1");
        j++;
        i++;
    }

    public void exit(View view) {
        MainActivity.this.finish();
    }

}