package matematicas.equipo5;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;


public class EjerciciosParentesis extends ActionBarActivity {

    String Pregunta = "-4+3";
    EditText Respuesta;
    Button Resultado;
    Intent intent;
    ProgressBar barraProgreso;
    int progreso  = 0, vidas = 3;
    Bundle variablesaMandar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios_parentesis);




        Respuesta = (EditText) findViewById(R.id.Respuesta);
        Resultado = (Button) findViewById(R.id.btnRepuesta);
        barraProgreso = (ProgressBar) findViewById(R.id.progressBar);

        barraProgreso.setMax(100);
        barraProgreso.setProgress(progreso);

        Resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                variablesaMandar = new Bundle();



                    if (Pregunta.equals(Respuesta.getText().toString().replace(" ", ""))) {
                        Toast.makeText(getApplicationContext(), "CORRECTO!", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(getApplicationContext(), "INCORRECTO!", Toast.LENGTH_SHORT).show();
                        vidas = vidas - 1;


                    }
                    variablesaMandar.putInt("progreso", progreso);
                    variablesaMandar.putInt("vidas", vidas);

                    ejercicioAleatorio();
            }


        });



    }

    public void ejercicioAleatorio(){

        // (int)(Math.random()*(HASTA-DESDE+1)+DESDE);


        Intent intent;
        int aleatorio = (int) (Math.random() * (3 + 1) + 2);

        switch (aleatorio){
            case 2:
                intent = new Intent(this, EjerciciosParentesis2.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 3:
                intent = new Intent(this, EjerciciosParentesis3.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 4:
                intent = new Intent(this, EjerciciosParentesis4.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 5:
                intent = new Intent(this, EjerciciosParentesis5.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 6:
                intent = new Intent(this, EjerciciosParentesis6.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 7:
                intent = new Intent(this, EjerciciosParentesis7.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 8:
                intent = new Intent(this, EjerciciosParentesis8.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 9:
                intent = new Intent(this, EjerciciosParentesis9.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 10:
                intent = new Intent(this, EjerciciosParentesis10.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 11:
                intent = new Intent(this, EjerciciosParentesis11.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 12:
                intent = new Intent(this, EjerciciosParentesis12.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 13:
                intent = new Intent(this, EjerciciosParentesis13.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 14:
                intent = new Intent(this, EjerciciosParentesis14.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 15:
                intent = new Intent(this, EjerciciosParentesis15.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

        }
    }


    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {

            final AlertDialog.Builder dialogo = new AlertDialog.Builder(this);

            dialogo.setTitle("¡Alerta! Si sales perderás todo tu avance");
            dialogo.setMessage("¿Deseas continuar?");
            dialogo.setCancelable(false);

            dialogo.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(getApplicationContext(), EjerciciosPrimero.class);
                    finish();
                    startActivity(intent);
                }
            });

            dialogo.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogo.setCancelable(true);
                }
            });

            dialogo.show();

            return true;

        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ejercicios_parentesis, menu);
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
