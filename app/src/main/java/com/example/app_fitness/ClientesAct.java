package com.example.app_fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Planes;

public class ClientesAct extends AppCompatActivity {
    private Spinner spnPlanes, spnClientes;
    private EditText edit;
    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);

        spnClientes = (Spinner)findViewById(R.id.spnClientes);
        spnPlanes = (Spinner)findViewById(R.id.spnPlanes);
        edit = (EditText)findViewById(R.id.txtMonto);
        text = (TextView)findViewById(R.id.txtResusltado);


        ArrayList<String > listaClientes = (ArrayList<String>)getIntent().getSerializableExtra("listaClientes");
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaClientes);
        spnClientes.setAdapter(adapt);

        ArrayList<String > listaPlanes = (ArrayList<String>)getIntent().getSerializableExtra("listaPlanes");
        ArrayAdapter<String> adapts = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaPlanes);
        spnPlanes.setAdapter(adapts);
    }


    public void Calcular (View v)
    {
        Planes pl = new Planes();
        pl.setXtreme(80000);

        String cliente = spnClientes.getSelectedItem().toString();
        String planes = spnPlanes.getSelectedItem().toString();

        int saldo = Integer.parseInt(edit.getText().toString());
        int resultXtreme = pl.getXtreme() - saldo;

        if ((cliente.equals("Roberto") || cliente.equals("Ivan")) && planes.equals("xtreme"))
        {
            text.setText("El precio del plan es: " + resultXtreme);
        }

        if ((cliente.equals("Roberto") || cliente.equals("Ivan")) && planes.equals("suave"))
        {
            text.setText("El precio del plan es: " + resultXtreme);
        }
    }
}