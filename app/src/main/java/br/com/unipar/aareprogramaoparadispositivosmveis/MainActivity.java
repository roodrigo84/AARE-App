package br.com.unipar.aareprogramaoparadispositivosmveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        private EditText editAtivo;
        private EditText editLucroEmpresa;
        private EditText editValor;
        private EditText editAcoesBolsa;
        private EditText editPrecoAtivo;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            editAtivo = findViewById(R.id.editAtivo);
            editLucroEmpresa = findViewById(R.id.editLucroEmpresa);
            editValor = findViewById(R.id.editValor);
            editAcoesBolsa = findViewById(R.id.editAcoesBolsa);
            editPrecoAtivo = findViewById(R.id.editPrecoAtivo);

        }

        public void CalcularIndicadores (View view) {


            double valorA= Double.parseDouble( editLucroEmpresa.getText().toString());
            double valorB= Double.parseDouble( editValor.getText().toString());
            double valorC= Double.parseDouble( editAcoesBolsa.getText().toString());
            double valorD= Double.parseDouble( editPrecoAtivo.getText().toString());

            double LPA = valorA/valorC;
            double PL = valorD/LPA;
            double ROE = (valorA/valorB) *100;
            double VPA = valorB/valorC;
            double PVP = valorD/VPA;



            Intent intent = new Intent(this, ResultadoIndicadores.class);
            Bundle parametros = new Bundle();

            parametros.putDouble("lpa", LPA);
            parametros.putDouble("pl", PL);
            parametros.putDouble("roe", ROE);
            parametros.putDouble("vpa", VPA);
            parametros.putDouble("pvp", PVP);

            intent.putExtras(parametros);
            startActivity(intent);

        }

}
