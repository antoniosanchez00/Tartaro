package ado.com.itla.tartaro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(LOG_TAG, "Estoy Aqui");


        Button btnCategoria = (Button) findViewById(R.id.btnCategoria); //busca todos los botones que no esten en el MainActivity

        btnCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: llamar otro Activity

                Intent VistaCategoria = new Intent(MainActivity.this, VistaCategoria.class); //Llama la vista creada de categoria

                VistaCategoria.putExtra("nombre", "Juan de lo palote");
                startActivity(VistaCategoria); //inicializa el activity



            }
        });
    }
}
