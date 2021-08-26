package com.roberto.infogarn;

import android.os.Bundle;
import android.widget.Toolbar;

public class CreateAccountActivity extends CreateAccount {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView();
    }

    private void setContentView() {
    }

    public void showToolbar(String titulo, boolean botonsubir)
    {
        Toolbar toolbar = findViewById();
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(titulo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(botonsubir);
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }


    private Toolbar findViewById() {
        return null;
    }
}
