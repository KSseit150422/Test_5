package com.example.test5; // Ändere den Paketnamen entsprechend dem Namen deines Pakets

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout verticalBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisiere die vertikale Leiste
        verticalBar = findViewById(R.id.vertical_bar);

        // Setze OnClickListener für die Schaltflächen
        Button btnTitelBewerten = findViewById(R.id.button);
        Button btnMusikwunsch = findViewById(R.id.button2);
        Button btnModeratorBewerten = findViewById(R.id.button3);

        btnTitelBewerten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aktionen für "Titel bewerten" ausführen
                toggleVerticalBarVisibility();
            }
        });

        btnMusikwunsch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aktionen für "Musikwunsch" ausführen
                toggleVerticalBarVisibility();
            }
        });

        btnModeratorBewerten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aktionen für "Moderator bewerten" ausführen
                toggleVerticalBarVisibility();
            }
        });
    }

    // Methode zum Ein- und Ausblenden der vertikalen Leiste
    private void toggleVerticalBarVisibility() {
        if (verticalBar.getVisibility() == View.VISIBLE) {
            verticalBar.setVisibility(View.GONE);
        } else {
            verticalBar.setVisibility(View.VISIBLE);
        }
    }
}
