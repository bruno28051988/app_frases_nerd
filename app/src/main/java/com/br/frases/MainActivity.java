package com.br.frases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Função responsável por gerar a frase
    public void gerarNovaFrase(View view){

        String[] frases = {
                "Vida longa e próspera(Sr. Spock - StarTrek)", //posição 0
                "Eu tenho a força! (He-man)", // posição 1
                "Que a Força esteja com você! (StarWars)", // posição 2
                "Siga-me os bons! (Chapolin-Colorado)",// posição 3
                "Ao infinito e além! (BuzzLIghtyear)",// posição 4
                "Com grandes poderes, vem grandes responsabilidades!(Tio Ben - SpiderMAn)",// posição 5
                "Meu precioso! (Smeagol)",// posição 6
                "Bazinga! (Shedon Cooper - The Big Bang Theory)",// posição 7
                "Eu não vim do lixo para perder pra basculho! (Gil do Vigor - BBB21)"// posição 8
        };

        //Var resposável por gerar os valores aleatórios
        //que serão utilizados para indicar a posiçao no vetor frase(acima)
        int numero = new Random().nextInt(9);

        //Mostrando a frase com base na posição sorteada
        TextView texto = findViewById(R.id.txtFraseGerada);
        texto.setText(frases[numero]);

    }// Fechamento função GerarNovaFrase

}