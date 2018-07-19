package ado.com.itla.tartaro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import ado.com.itla.tartaro.entidad.Categoria;
import ado.com.itla.tartaro.repositorio.CategoriaRepositorio;
import ado.com.itla.tartaro.repositorio.db.CategoriaRepositorioDBImp;

public class CategoriaListaActivity extends AppCompatActivity {

    private CategoriaRepositorio categoriaRepo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_lista);

        categoriaRepo = new CategoriaRepositorioDBImp(this);
        List<Categoria> categorias = categoriaRepo.buscar(null);
        CategoriaListViewAdapter adapter = new CategoriaListViewAdapter(this, categorias);

        ListView ListViewCategoria =findViewById(R.id.ListViewCategoria);
        ListViewCategoria.setAdapter(adapter);
    }
}