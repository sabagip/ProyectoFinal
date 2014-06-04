package matematicas.equipo5;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class EjerciciosSignos11 extends ActionBarActivity {


    String Pregunta = "25";
    EditText Respuesta;
    TextView txtVidas;
    Button Resultado;
    ProgressBar barraProgreso;
    int vidas, progreso;
    Bundle variablesRecogidas, variablesaMandar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios_signos11);

        Respuesta = (EditText) findViewById(R.id.Respuesta);
        Resultado = (Button) findViewById(R.id.btnRepuesta);
        barraProgreso = (ProgressBar) findViewById(R.id.progressBar);
        txtVidas = (TextView) findViewById(R.id.txtVidas);

        variablesaMandar = new Bundle();
        Intent intent = getIntent();
        variablesRecogidas = intent.getExtras();

        if (variablesRecogidas != null) {
            progreso = variablesRecogidas.getInt("progreso") + 10;
            barraProgreso.setProgress(progreso);

            vidas = variablesRecogidas.getInt("vidas");
            txtVidas.setText(vidas + "");
        }

        if (progreso > 100) {
            guardarMemoriaInterna();


            final AlertDialog.Builder dialogo = new AlertDialog.Builder(this);

            dialogo.setTitle("¡Felicidades!");
            dialogo.setMessage("¡¡¡Terminaste exitosamente el curso!!!");
            dialogo.setCancelable(false);

            dialogo.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(getApplicationContext(), EjerciciosPrimero.class);
                    finish();
                    startActivity(intent);
                }
            });

            guardarMemoriaInterna();
            dialogo.show();
        } else {

            Resultado.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    variablesaMandar.putInt("progreso", progreso);

                    if (Pregunta.equals(Respuesta.getText().toString().replace(" ", ""))) {
                        Toast.makeText(getApplicationContext(), "CORRECTO!", Toast.LENGTH_SHORT).show();
                        variablesaMandar.putInt("vidas", vidas);
                        ejercicioAleatorio();

                    } else {

                        vidas = vidas - 1;
                        variablesaMandar.putInt("vidas", vidas);

                        Toast.makeText(getApplicationContext(), "INCORRECTO!", Toast.LENGTH_SHORT).show();


                        if (vidas < 0) {
                            Toast.makeText(getApplicationContext(), "Has perdido", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), EjerciciosPrimero.class);
                            finish();
                            startActivity(intent);
                        } else {
                            ejercicioAleatorio();
                        }


                    }


                }

            });
        }

    }


    public void guardarMemoriaInterna() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        //editor.putBoolean("completadoUsoParentensis", true);

        editor.commit();

        try {
            String avanceParentesis = "1";

            FileOutputStream fileOutputStream = openFileOutput("Avances", Context.MODE_PRIVATE);

            fileOutputStream.write(avanceParentesis.getBytes());

            fileOutputStream.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }


    public void ejercicioAleatorio() {

        // (int)(Math.random()*(HASTA-DESDE+1)+DESDE);


        Intent intent;
        int aleatorio = (int) (Math.random() * (3 + 1) + 2);

        switch (aleatorio) {
            case 2:
                intent = new Intent(this, EjerciciosSignos2.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 3:
                intent = new Intent(this, EjerciciosSignos3.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 4:
                intent = new Intent(this, EjerciciosSignos4.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 5:
                intent = new Intent(this, EjerciciosSignos5.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 6:
                intent = new Intent(this, EjerciciosSignos6.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 7:
                intent = new Intent(this, EjerciciosSignos7.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 8:
                intent = new Intent(this, EjerciciosSignos8.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 9:
                intent = new Intent(this, EjerciciosSignos9.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 10:
                intent = new Intent(this, EjerciciosSignos10.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 11:
                intent = new Intent(this, EjerciciosSignos11.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 12:
                intent = new Intent(this, EjerciciosSignos12.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 13:
                intent = new Intent(this, EjerciciosSignos13.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 14:
                intent = new Intent(this, EjerciciosSignos14.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;

            case 15:
                intent = new Intent(this, EjerciciosSignos15.class);
                intent.putExtras(variablesaMandar);
                finish();
                startActivity(intent);
                break;
        }
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {

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
        getMenuInflater().inflate(R.menu.ejercicios_signos11, menu);
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
