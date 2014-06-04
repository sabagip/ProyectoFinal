package matematicas.equipo5;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class usoSignos extends ActionBarActivity {

    ImageView imgUsoSignosIguales, imgUsoSignosIguales3,
              imgUsoSignosDiferentes, imgUsoSignosDiferentes3;

    Button btnSignosIguales, btnSignosIguales2, btnSignosDiferentes, btnSignosDiferentes2;

    ImageButton btnAvanzar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uso_signos);

        imgUsoSignosDiferentes = (ImageView) findViewById(R.id.imgUsoSignosDiferentes);
        imgUsoSignosDiferentes3 = (ImageView) findViewById(R.id.imgUsoSignosDiferentes3);
        imgUsoSignosIguales = (ImageView) findViewById(R.id.imgUsoSignosIguales);
        imgUsoSignosIguales3 = (ImageView) findViewById(R.id.imgUsoSignosIguales3);
        btnSignosDiferentes = (Button) findViewById(R.id.btnSignoDiiferentes);
        btnSignosDiferentes2 = (Button) findViewById(R.id.btnSignosDiferentes2);
        btnSignosIguales = (Button) findViewById(R.id.btnSignosIguales);
        btnSignosIguales2 = (Button) findViewById(R.id.btnSignosIguales2);

        btnSignosIguales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animacionSignosIgualesPositivos();
            }
        });

        btnSignosIguales2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animacionSignosIgualesPositivos2();
            }
        });

        btnSignosDiferentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animacionSignosIgualesNegativos();
            }
        });

        btnSignosDiferentes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animacionSignosIgualesNegativos2();
            }
        });

        btnAvanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void animacionSignosIgualesPositivos(){


        imgUsoSignosIguales.setImageResource(R.drawable.animacionsignosiguales);

        AnimationDrawable animacion2 = (AnimationDrawable) imgUsoSignosIguales.getDrawable();

        if (animacion2.isRunning()){
            animacion2.stop();
        }

        animacion2.start();
        btnSignosIguales.setText("Repetir ejemplo");

    }

    private void animacionSignosIgualesPositivos2(){


        imgUsoSignosIguales3.setImageResource(R.drawable.animacionsignosiguales2);

        AnimationDrawable animacion2 = (AnimationDrawable) imgUsoSignosIguales3.getDrawable();

        if (animacion2.isRunning()){
            animacion2.stop();
        }

        animacion2.start();
        btnSignosIguales2.setText("Repetir ejemplo");

    }


    private void animacionSignosIgualesNegativos(){


        imgUsoSignosDiferentes.setImageResource(R.drawable.animacionusosignosdiferentes);

        AnimationDrawable animacion2 = (AnimationDrawable) imgUsoSignosDiferentes.getDrawable();

        if (animacion2.isRunning()){
            animacion2.stop();
        }

        animacion2.start();
        btnSignosDiferentes.setText("Repetir ejemplo");

    }


    private void animacionSignosIgualesNegativos2(){


        imgUsoSignosDiferentes3.setImageResource(R.drawable.animacionusosignosdiferentes2);

        AnimationDrawable animacion2 = (AnimationDrawable) imgUsoSignosDiferentes3.getDrawable();

        if (animacion2.isRunning()){
            animacion2.stop();
        }

        animacion2.start();
        btnSignosDiferentes2.setText("Repetir ejemplo");

    }

    private void avanzar(){
       /* Intent intent = new Intent(this, EjerciciosSignos.class);
        finish();
        startActivity(intent);*/
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.uso_signos, menu);
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
