package com.example.zayenemna_tp4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    TextView welcom;
    String welcomenom, welcomeprenom, welcomemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // 1) Association avec le TextView
        welcom = (TextView) findViewById(R.id.txtWelcome);

        // 2) Récupération des extras (juste après setContentView)
        welcomenom    = getIntent().getExtras().getString("name");
        welcomeprenom = getIntent().getExtras().getString("lastname");
        welcomemail   = getIntent().getExtras().getString("mymail");

        // 3) Affichage
        welcom.setText("Bienvenue " + welcomenom + " " + welcomeprenom + ",\n"
                + "c'est la deuxième activité.\n"
                + "Vous serez bientôt contacté sur :\n" + welcomemail);
    }
}