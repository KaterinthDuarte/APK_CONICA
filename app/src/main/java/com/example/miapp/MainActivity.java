package com.example.miapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton boton1 = (ImageButton) findViewById(R.id.imageButton1);
        boton1.setOnClickListener((v) ->{
            Toast notificacion = Toast.makeText(MainActivity.this, "IA Inicio", Toast.LENGTH_LONG);
            notificacion.show();
            Intent intencion = new Intent(getApplicationContext(), Menuini.class);
            startActivity(intencion);
        });

        ImageButton boton2 = (ImageButton) findViewById(R.id.imageButton2);
        boton1.setOnClickListener((v) ->{
            Toast notificacion = Toast.makeText(MainActivity.this, "IA Registro", Toast.LENGTH_LONG);
            notificacion.show();
            Intent intencion = new Intent(getApplicationContext(), Menuini.class);
            startActivity(intencion);
        });
    }
}