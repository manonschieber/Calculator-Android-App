package com.example.myhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int a;   //variable de stockage (utile lors des opérations car on doit rentrer une seconde variable)
    public int b;   //variable de stockage (utile lors des opérations car on doit rentrer une seconde variable)
    public int fois;  //binaire qui permet de prévenir la fonction envoiégale du type d'opération à effectuer entre les variables a et b
    public int plus;  //pareil
    public int moins;  //pareil
    public int divise;  //pareil
    public int puissance;  //pareil

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void envoi0(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        if (tochange.getText().equals("0")) { //si c'est le premier chiffre à écrire
            tochange.setText("0"); // on change la view
        } else {                                 //si on est en train d'écrire un nombre (plusieurs chiffres)
            tochange.setText(tochange.getText() + "0");
        }
    }

    public void envoi1(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        if (tochange.getText().equals("0")) { //si c'est le premier chiffre à écrire
            tochange.setText("1"); // on change la view
        } else {                                 //si on est en train d'écrire un nombre (plusieurs chiffres)
            tochange.setText(tochange.getText() + "1");
        }
    }

    public void envoi2(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        if (tochange.getText().equals("0")) { //si c'est le premier chiffre à écrire
            tochange.setText("2"); // on change la view
        } else {                                 //si on est en train d'écrire un nombre (plusieurs chiffres)
            tochange.setText(tochange.getText() + "2");
        }
    }

    public void envoi3(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        if (tochange.getText().equals("0")) { //si c'est le premier chiffre à écrire
            tochange.setText("3"); // on change la view
        } else {                                 //si on est en train d'écrire un nombre (plusieurs chiffres)
            tochange.setText(tochange.getText() + "3");
        }
    }

    public void envoi4(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        if (tochange.getText().equals("0")) { //si c'est le premier chiffre à écrire
            tochange.setText("4"); // on change la view
        } else {                                 //si on est en train d'écrire un nombre (plusieurs chiffres)
            tochange.setText(tochange.getText() + "4");
        }
    }

    public void envoi5(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        if (tochange.getText().equals("0")) { //si c'est le premier chiffre à écrire
            tochange.setText("5"); // on change la view
        } else {                                 //si on est en train d'écrire un nombre (plusieurs chiffres)
            tochange.setText(tochange.getText() + "5");
        }
    }

    public void envoi6(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        if (tochange.getText().equals("0")) { //si c'est le premier chiffre à écrire
            tochange.setText("6"); // on change la view
        } else {                                 //si on est en train d'écrire un nombre (plusieurs chiffres)
            tochange.setText(tochange.getText() + "6");
        }
    }

    public void envoi7(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        if (tochange.getText().equals("0")) { //si c'est le premier chiffre à écrire
            tochange.setText("7"); // on change la view
        } else {                                 //si on est en train d'écrire un nombre (plusieurs chiffres)
            tochange.setText(tochange.getText() + "7");
        }
    }

    public void envoi8(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        if (tochange.getText().equals("0")) { //si c'est le premier chiffre à écrire
            tochange.setText("8"); // on change la view
        } else {                                 //si on est en train d'écrire un nombre (plusieurs chiffres)
            tochange.setText(tochange.getText() + "8");
        }
    }

    public void envoi9(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        if (tochange.getText().equals("0")) { //si c'est le premier chiffre à écrire
            tochange.setText("9"); // on change la view
        } else {                                 //si on est en train d'écrire un nombre (plusieurs chiffres)
            tochange.setText(tochange.getText() + "9");
        }
    }

    public void envoivirgule(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        tochange.setText(tochange.getText() + ","); //on colle une virgule à la fin du nombre
    }


    public void envoiAC(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        tochange.setText("0"); // on change la view
    }

    public void envoifois(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        a = Integer.parseInt(tochange.getText().toString()); //on stocke la valeur du premier nombre dans une nouvelle variable
        tochange.setText("0");// on change la view pour montrer que l'opération a été sélectionnée
        fois = 1; //permet de préciser le type d'opération à la fonction envoiégale
    }

    public void envoidivise(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        a = Integer.parseInt(tochange.getText().toString()); //on stocke la valeur du premier nombre dans une nouvelle variable
        tochange.setText("0");// on change la view pour montrer que l'opération a été sélectionnée
        divise = 1;  //permet de préciser le type d'opération à la fonction envoiégale
    }

    public void envoimoins(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        a = Integer.parseInt(tochange.getText().toString()); //on stocke la valeur du premier nombre dans une nouvelle variable
        tochange.setText("0");// on change la view pour montrer que l'opération a été sélectionnée
        moins = 1;  //permet de préciser le type d'opération à la fonction envoiégale
    }

    public void envoiplus(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        a = Integer.parseInt(tochange.getText().toString()); //on stocke la valeur du premier nombre dans une nouvelle variable
        tochange.setText("0");// on change la view pour montrer que l'opération a été sélectionnée
        plus = 1;  //permet de préciser le type d'opération à la fonction envoiégale
    }

    public void envoiabs(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        a = Integer.parseInt(tochange.getText().toString()); //on stocke la valeur du premier nombre dans une nouvelle variable
        if (a < 0) {
            tochange.setText(String.valueOf(-a));
        }
    }

    public void envoipuissance(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        a = Integer.parseInt(tochange.getText().toString()); //on stocke la valeur du premier nombre dans une nouvelle variable
        tochange.setText("0");// on change la view pour montrer que l'opération a été sélectionnée
        puissance = 1; //permet de préciser le type d'opération à la fonction envoiégale
    }


    public void envoiegale(View view) {
        TextView tochange = (TextView) findViewById(R.id.ecran_LCD); //on choisit le textview à modifier en l'appelant par son id
        b = Integer.parseInt(tochange.getText().toString()); //on stocke la valeur du second nombre dans une nouvelle variable

        if (fois == 1) {
            tochange.setText(String.valueOf(a * b));
            fois = 0;
        }

        if (plus == 1) {
            tochange.setText(String.valueOf(a + b));
            plus = 0;
        }

        if (moins == 1) {
            tochange.setText(String.valueOf(a - b));
            moins = 0;
        }

        if (divise == 1) {
            if (b != 0) {
                tochange.setText(String.valueOf(a / b));
            } else {
                tochange.setText("On ne divise pas par 0 !");
            }
            divise = 0;
        }

        if (puissance == 1) {
            int c = (int) Math.pow(a, b);
            tochange.setText(String.valueOf(c));
            puissance = 0;
        }

    }
}