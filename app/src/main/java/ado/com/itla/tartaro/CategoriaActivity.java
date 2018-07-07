package ado.com.itla.tartaro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import ado.com.itla.tartaro.entidad.Categoria;
import ado.com.itla.tartaro.repositorio.CategoriaRepositorio;
import ado.com.itla.tartaro.repositorio.db.CategoriaRepositorioDBImp;

public class CategoriaActivity extends AppCompatActivity {

    CategoriaRepositorio catRep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_categoria);

        //  TextView txtNombre = (TextView) findViewById(R.id.txtNombre);

        catRep = new CategoriaRepositorioDBImp(this);

        final EditText txtNombreCategoria = findViewById(R.id.txtNombreCategoria);
        Button btnGuardarCategoria = findViewById(R.id.btnGuardarCategoria);
        Button btnListarCategoria = findViewById(R.id.btnListarCategoria);

        btnGuardarCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: guardar la categoria

                Categoria cat = new Categoria();
                cat.setNombre(txtNombreCategoria.getText().toString());
                catRep.guardar(cat);
                Log.i("GUARDAR", cat.toString());
            }
        });

        btnListarCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: guardar la categoria

                List<Categoria> categorias = catRep.buscar(null);
                Log.i("LISTAR", "Categoria.size = " + categorias.size());

                for (Categoria c: categorias) {
                    Log.i("LISTAR", c.toString());
                }

            }
        });

        //Bundle data = this.getIntent().getExtras();
        // String nombre = (String) data.getString("nombre");
        // txtNombre.setText(nombre);

        //Categoria cat = new Categoria();


    }
}
