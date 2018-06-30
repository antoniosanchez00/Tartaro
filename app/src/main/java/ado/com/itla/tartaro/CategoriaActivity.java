package ado.com.itla.tartaro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ado.com.itla.tartaro.entidad.Categoria;

public class CategoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_categoria);

      //  TextView txtNombre = (TextView) findViewById(R.id.txtNombre);

        EditText txtNombreCategoria = findViewById(R.id.txtNombreCategoria);
        Button btnGuardarCategoria = findViewById(R.id.btnCategoria);

        btnGuardarCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: guardar la categoria


            }
        });

        //Bundle data = this.getIntent().getExtras();
       // String nombre = (String) data.getString("nombre");
       // txtNombre.setText(nombre);

        //Categoria cat = new Categoria();


    }
}
