package com.example.endavamobile;

import com.example.endavamobile.R.id;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.view.MenuItem;
import android.widget.ImageButton;



import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private ImageButton menuButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inițializează butonul de meniu
        menuButton = findViewById(R.id.menuButton);

        // Setează un listener pentru evenimentul de clic pe butonul de meniu
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        EventsData[] eventsData = new EventsData[]{
                new EventsData("Untold Festival", "Cluj-Napoca. 3-6 August", R.drawable.untold),
                new EventsData("Electric Castle", "Cluj-Napoca. 19-23 July", R.drawable.electric_castle),
                new EventsData("Tiff Festival", "Cluj-Napoca. 17-27 June", R.drawable.tiff),
                new EventsData("Neversea", "Constanta. 6-9 July", R.drawable.neversea),
                new EventsData("Untold Festival", "Cluj-Napoca. 3-6 August", R.drawable.untold),
                new EventsData("Electric Castle", "Cluj-Napoca. 19-23 July", R.drawable.electric_castle),
                new EventsData("Tiff Festival", "Cluj-Napoca. 17-27 June", R.drawable.tiff),
                new EventsData("Neversea Festival", "Constanta. 6-9 July", R.drawable.neversea),
                new EventsData("Untold Festival", "Cluj-Napoca. 3-6 August", R.drawable.untold),
                new EventsData("Electric Castle", "Cluj-Napoca. 19-23 July", R.drawable.electric_castle),
                new EventsData("Tiff Festival", "Cluj-Napoca. 17-27 June", R.drawable.tiff),
                new EventsData("Neversea Festival", "Constanta. 6-9 July", R.drawable.neversea)
        };

        EventAdapter eventAdapter = new EventAdapter(eventsData, MainActivity.this);
        recyclerView.setAdapter(eventAdapter);
    }
        private void showPopupMenu(View view) {
            PopupMenu popupMenu = new PopupMenu(this, view);
            popupMenu.inflate(R.menu.menu_main);

            popupMenu.show();
        }

        private void openEventsPage() {
            // Deschide o nouă activitate pentru pagina "Events"
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        private void openOrdersPage() {
            // Deschide o nouă activitate pentru pagina "Orders"
            Intent intent = new Intent(this, OrderActivity.class);
            startActivity(intent);
        }
    }

