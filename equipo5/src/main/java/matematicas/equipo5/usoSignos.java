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

    Button btnSignosIguales, btnSignosIguales2, btnSignosDiferentes, btnSignosDiferentes2;

    ImageView imgSignosIguales, imgSignosIguales3, imgSignosDiferentes, imgSignosDiferentes3;

    ImageButton btnAvanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uso_signos);

        btnSignosIguales = (Button) findViewById(R.id.btnSignosIguales);
        btnSignosIguales2 = (Button) findViewById(R.id.btnSignosIguales2);
        btnSignosDiferentes = (Button) findViewById(R.id.btnSignoDiiferentes);
        btnSignosDiferentes2 = (Button) findViewById(R.id.btnSignosDiferentes2);
        imgSignosDiferentes = (ImageView) findViewById(R.id.imgUsoSignosDiferentes);
        imgSignosDiferentes3 = (ImageView) findViewById(R.id.imgUsoSignosDiferentes3);
        imgSignosIguales = (ImageView) findViewById(R.id.imgUsoSignosIguales);
        imgSignosIguales3 = (ImageView) findViewById(R.id.imgUsoSignosIguales3);
        btnAvanzar = (ImageButton) findViewById(R.id.btnAvanzar);

        btnSignosIguales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animacionSignosIguales();
            }
        });

        btnSignosIguales2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animacionSignosIguales2();
            }
        });

        btnSignosDiferentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animacionSignosDiferentes();
            }
        });

        btnSignosDiferentes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animacionSignosDiferentes2();
            }
        });

        btnAvanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EjerciciosSignos.class);
                finish();
                startActivity(intent);
            }
        });



    }


    private void animacionSignosIguales(){


        imgSignosIguales.setImageResource(R.drawable.animacionsignosiguales);

        AnimationDrawable animacion2 = (AnimationDrawable) imgSignosIguales.getDrawable();

        if (animacion2.isRunning()){
            animacion2.stop();
        }

        animacion2.start();
        btnSignosIguales.setText("Repetir ejemplo");

    }

    private void animacionSignosIguales2(){


        imgSignosIguales3.setImageResource(R.drawable.animacionsignosiguales2);

        AnimationDrawable animacion2 = (AnimationDrawable) imgSignosIguales3.getDrawable();

        if (animacion2.isRunning()){
            animacion2.stop();
        }

        animacion2.start();
        btnSignosIguales2.setText("Repetir ejemplo");

    }

    private void animacionSignosDiferentes(){


        imgSignosDiferentes.setImageResource(R.drawable.animacionusosignosdiferentes);

        AnimationDrawable animacion2 = (AnimationDrawable) imgSignosDiferentes.getDrawable();

        if (animacion2.isRunning()){
            animacion2.stop();
        }

        animacion2.start();
        btnSignosDiferentes.setText("Repetir ejemplo");

    }

    private void animacionSignosDiferentes2(){


        imgSignosDiferentes3.setImageResource(R.drawable.animacionusosignosdiferentes2);

        AnimationDrawable animacion2 = (AnimationDrawable) imgSignosDiferentes3.getDrawable();

        if (animacion2.isRunning()){
            animacion2.stop();
        }

        animacion2.start();
        btnSignosDiferentes2.setText("Repetir ejemplo");

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
