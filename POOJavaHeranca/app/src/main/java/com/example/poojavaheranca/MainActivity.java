package com.example.poojavaheranca;

import android.os.Bundle;

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

        Funcionario funcionarioJoao = new Funcionario();
        Gerente gerentePedro = new Gerente();

        funcionarioJoao.setNome("João");
        funcionarioJoao.setDataAdmissao("01/09/2023");
        funcionarioJoao.setSalario(1845.25);

        gerentePedro.setNome("Pedro");
        gerentePedro.setDataAdmissao("12/02/2009");
        gerentePedro.setSalario(5450.14);
        gerentePedro.setComissao(10);
        gerentePedro.setTotalFuncionarios(32);
    }
}