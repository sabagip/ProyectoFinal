package matematicas.equipo5;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class EjerciciosParentesis2 extends ActionBarActivity {

    String Pregunta = "-5-3+5";
    EditText Respuesta;
    TextView txtVidas;
    Button Resultado;
    ProgressBar barraProgreso;
    int vidas, progreso;
    Bundle variablesRecogidas, variablesaMandar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios_parentesis_2);

        Respuesta = (EditText)findViewById(R.id.Respuesta);
        Resultado = (Button)findViewById(R.id.btnRepuesta);
        barraProgreso = (ProgressBar) findViewById(R.id.progressBar);
        txtVidas = (TextView) findViewById(R.id.txtVidas);

        variablesaMandar = new Bundle();
        Intent intent = getIntent();
        variablesRecogidas = intent.getExtras();

        if(variablesRecogidas != null) {
            progreso = variablesRecogidas.getInt("progreso") + 10;
            barraProgreso.setProgress(progreso);

            vidas = variablesRecogidas.getInt("vidas");
            txtVidas.setText(vidas + "");
        }

        Resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                variablesaMandar.putInt("progreso", progreso);

                if (Pregunta.equals(Respuesta.getText().toString().replace(" ", ""))) {
                    Toast.makeText(getApplicationContext(), "CORRECTO!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "INCORRECTO!", Toast.LENGTH_SHORT).show();
                    vidas = vidas - 1;



                }
                variablesaMandar.putInt("vidas", vidas);
                Intent intent = new Intent(getApplicationContext(), EjerciciosParentesis3.class);
                intent.putExtras(variablesaMandar);

                //finish();
                startActivity(intent);

            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ejercicios_parentesis_2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
