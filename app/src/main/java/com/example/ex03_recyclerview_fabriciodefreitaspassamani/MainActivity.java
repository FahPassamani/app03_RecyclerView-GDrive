package com.example.ex03_recyclerview_fabriciodefreitaspassamani;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.ex03_recyclerview_fabriciodefreitaspassamani.Model.Nomes;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    private List<Nomes> criarNomes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        // Configura o tipo de layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        // Envia a config.
        recyclerView.setLayoutManager(layoutManager);

        criarNomes();

        // Configura o adapter
        Adaptador adaptador = new Adaptador(criarNomes);
        recyclerView.setAdapter(adaptador);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
    }

    private void criarNomes() {
        Nomes nome;
        nome = new Nomes("Músicas");
        criarNomes.add(nome);

        nome = new Nomes("Filmes");
        criarNomes.add(nome);

        nome = new Nomes("Documentos");
        criarNomes.add(nome);

        nome = new Nomes("Tutoriais");
        criarNomes.add(nome);

        nome = new Nomes("Jogos");
        criarNomes.add(nome);

        nome = new Nomes("Dados");
        criarNomes.add(nome);

        nome = new Nomes("Clientes");
        criarNomes.add(nome);

        nome = new Nomes("Planilhas");
        criarNomes.add(nome);

        nome = new Nomes("Fotos");
        criarNomes.add(nome);

        nome = new Nomes("Vídeos");
        criarNomes.add(nome);

        nome = new Nomes("Certificados");
        criarNomes.add(nome);
    }
}