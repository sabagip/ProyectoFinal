package matematicas.equipo5;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class usoParentesis extends ActionBarActivity {

    ImageView imgUsoParentesisPositivo, imgUsoParentesisNegativo;
    ImageButton imgAvanzar;
    Button btnVerEjemplo1, btnVerEjemplo2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uso_parentesis);

        imgUsoParentesisPositivo = (ImageView) findViewById(R.id.imgUsoParentesisPositivo);
        imgUsoParentesisNegativo = (ImageView) findViewById(R.id.imgUsoParentesisNegativo);
        imgAvanzar = (ImageButton) findViewById(R.id.imgAvanzar);


        btnVerEjemplo1 = (Button) findViewById(R.id.btnEjemploParentesisPositivo);
        btnVerEjemplo2 = (Button)findViewById(R.id.btnEjemploParentesisNegativo);
        imgAvanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EjerciciosParentesis.class);
                startActivity(intent);
            }
        });

        btnVerEjemplo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animacioPositiva();
            }
        });


        btnVerEjemplo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animacioNegativa();
            }
        });



    }



    private void animacioPositiva(){


        imgUsoParentesisPositivo.setImageResource(R.drawable.animacionparentesispositivos);

        AnimationDrawable animacion2 = (AnimationDrawable) imgUsoParentesisPositivo.getDrawable();

      if (animacion2.isRunning()){
          animacion2.stop();
      }

        animacion2.start();
        btnVerEjemplo1.setText("Repetir ejemplo");

    }

    private void animacioNegativa(){
        imgUsoParentesisNegativo.setImageResource(R.drawable.animacionparentesisnegativos);

        AnimationDrawable animacion2 = (AnimationDrawable) imgUsoParentesisNegativo.getDrawable();

        if (animacion2.isRunning()){
            animacion2.stop();
        }

        animacion2.start();
        btnVerEjemplo2.setText("Repetir Ejemplo");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.uso_parentesis, menu);
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
