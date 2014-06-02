package matematicas.equipo5;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ejercicios_parentesis_2 extends ActionBarActivity {

    String Pregunta = "-4+3";
    EditText Respuesta;
    Button Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios_parentesis_2);

        Respuesta = (EditText)findViewById(R.id.Respuesta);

        Resultado = (Button)findViewById(R.id.btnRepuesta);

        Resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(Pregunta.equals(Respuesta.getText().toString())){
                    Toast.makeText(getApplicationContext(), "CORRECTO!", Toast.LENGTH_LONG).show();
                }
                else Toast.makeText(getApplicationContext(), "INCORRECTO!", Toast.LENGTH_LONG).show();
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
