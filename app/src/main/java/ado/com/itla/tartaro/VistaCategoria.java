package ado.com.itla.tartaro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VistaCategoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_categoria);

        TextView txtNombre = (TextView) findViewById(R.id.txtNombre);

        Bundle data = this.getIntent().getExtras();
        String nombre = (String) data.getString("nombre");
        txtNombre.setText(nombre);


    }
}
