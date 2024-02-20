package com.tamayo.actividadprincipal;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.tamayo.actividadprincipal.databinding.Activity2Binding;

public class Activity_2 extends AppCompatActivity {
    TextView tvNombre,tvPantalla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvNombre = findViewById(R.id.tvNombre);
        tvPantalla = findViewById(R.id.tvPantalla);

        String Name = getIntent().getStringExtra("name");
        tvNombre.setText(Name);
    }
}