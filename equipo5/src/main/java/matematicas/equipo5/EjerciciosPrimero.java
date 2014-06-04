package matematicas.equipo5;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class EjerciciosPrimero extends ActionBarActivity {

    ImageButton imgUsoParentesis, imgUsoSignos;
    Intent intent;

    public static final String  TAG =
            EjerciciosPrimero.class.getSimpleName();

    String avancesUsoParentesis, avancesUsoSignos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios_primero);


        imgUsoParentesis = (ImageButton) findViewById(R.id.imgUsoParentesis);
        imgUsoSignos = (ImageButton) findViewById(R.id.imgUsoSignos);

        SharedPreferences sharedPreferences;
        sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);



        avancesUsoSignos = leerAvancesSignos();

        if (avancesUsoSignos.equals("1")) {
            imgUsoParentesis.setEnabled(true);
        }
        else {
            imgUsoParentesis.setEnabled(false);

        }



        imgUsoSignos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), usoSignos.class);
                finish();
                startActivity(intent);
            }
        });



        imgUsoParentesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), usoParentesis.class);
                finish();
                startActivity(intent);
            }
        });

    }

    public boolean leerAvancesParentesis(){
        boolean avances;
        SharedPreferences sharedPreferences;
        sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);

        avances = sharedPreferences.getBoolean("completadoUsoParentensis", false);
        return avances;
    }

    public String leerAvancesSignos(){
        String nombre = "";

        try{

            FileInputStream fileInputStream = openFileInput("Avances");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"), 8);

            StringBuilder sBuilder = new StringBuilder();

            String line= null;

            while((line = bufferedReader.readLine()) != null ){
                sBuilder.append(line);
                nombre = sBuilder.toString();


                Log.d(TAG, nombre);
            }

        }
        catch (FileNotFoundException e){}
        catch (IOException e){}

        return  nombre;
    }


    private void abrirModuloAnterior(){
        final AlertDialog.Builder dialogo = new AlertDialog.Builder(this);

        dialogo.setTitle("¡Lo sentimos!");
        dialogo.setMessage("¿Debes de terminar el modulo anterior");
        dialogo.setCancelable(false);

        dialogo.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogo.setCancelable(true);
            }
        });


        dialogo.show();

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ejercicios_primero, menu);
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
