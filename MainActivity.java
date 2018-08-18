package com.example.consultor.exemplotelas01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btCombinado, btRelativo, btRelativoVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        telaPrincipal();

    }
    private void telaPrincipal()
    {
        setContentView(R.layout.activity_main);
        btCombinado=(Button)findViewById(R.id.btnCombinado);
        btRelativo=(Button)findViewById(R.id.btnRelativo);

        btCombinado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telaCombinado();
            }
        });

        btRelativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telaRelativo();
            }
        });

    }

    private void telaCombinado()
    {
        setContentView(R.layout.activity_combinado);//seta o layout combinado
    }

    private void telaRelativo()//chama a tela que esta no modo relativo
    {
        setContentView(R.layout.activity_relativo); //seta o layout relativo
        btRelativoVoltar = (Button)findViewById(R.id.btnRelativoVoltar);
        btRelativoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telaPrincipal();
            }
        });
    }



}
