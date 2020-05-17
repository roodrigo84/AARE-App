package br.com.unipar.aareprogramaoparadispositivosmveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoIndicadores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_indicadores);

        TextView txtlpa = findViewById(R.id.editLpa);
        TextView txtpl = findViewById(R.id.editPl);
        TextView txtroe = findViewById(R.id.editRoe);
        TextView txtvpa = findViewById(R.id.editVpa);
        TextView txtpvp = findViewById(R.id.editPvp);

            Bundle b = getIntent().getExtras();

            if (b != null) {
                Double lpa = b.getDouble("lpa");
                Double pl = b.getDouble("pl");
                Double roe = b.getDouble("roe");
                Double vpa = b.getDouble("vpa");
                Double pvp = b.getDouble("pvp");

                txtlpa.setText("R$ " + String.valueOf(lpa));
                txtpl.setText("R$ " + String.valueOf(pl));
                txtroe.setText("R$ " + String.valueOf(roe));
                txtvpa.setText("R$ " + String.valueOf(vpa));
                txtpvp.setText("R$ " + String.valueOf(pvp));


            }
        }




    }

