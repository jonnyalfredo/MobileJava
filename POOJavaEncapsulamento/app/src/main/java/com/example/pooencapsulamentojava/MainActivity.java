package com.example.pooencapsulamentojava;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txtTituloLivro;
    TextView autor;
    TextView editora;
    TextView paginas;
    TextView localizacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        criarObjetos();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void iniciarComponentesDoLayout(){

        txtTituloLivro = findViewById(R.id.txtTituloLivro);
        autor = findViewById(R.id.autor);
        editora = findViewById(R.id.editora);
        paginas = findViewById(R.id.paginas);
        localizacao = findViewById(R.id.localizacao);
    }
     public void criarObjetos(){

        Livro objLivro = new Livro();

        objLivro.setTitulo("O lar da srta. Peregrine para crianças peculiares");
        objLivro.setAutor("Ransom Riggs");
        objLivro.setEditora("Casa dos Mundos");
        objLivro.setPaginas(335);
        objLivro.setLocalizacao("P5, E9");

        Log.i("POO","OBJ Livro: "+objLivro.getTitulo());
        Log.i("POO","OBJ Autor: "+objLivro.getAutor());
        Log.i("POO","OBJ Editora: "+objLivro.getEditora());
        Log.i("POO","OBJ Paginas: "+objLivro.getPaginas());
        Log.i("POO","OBJ Localização: "+objLivro.getLocalizacao());

         iniciarComponentesDoLayout();

        txtTituloLivro.setText(objLivro.getTitulo());
        autor.setText(objLivro.getAutor());
        editora.setText(objLivro.getEditora());
        paginas.setText(String.valueOf(objLivro.getPaginas()));
        localizacao.setText(objLivro.getLocalizacao());
    }
}
