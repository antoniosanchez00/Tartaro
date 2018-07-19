package ado.com.itla.tartaro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import ado.com.itla.tartaro.entidad.Categoria;

public class CategoriaListViewAdapter extends BaseAdapter{

    private Context context;
    private List<Categoria> categorias;

    public CategoriaListViewAdapter(Context context, List<Categoria> categorias) {
        this.categorias = categorias;
        this.context = context;
    }


        @Override
    public int getCount() {
            return categorias.size();
    }

    @Override
    public Object getItem(int i) {
        return categorias.get(i);

    }

    @Override
    public long getItemId(int i) {
        return categorias.get(i).getId();

    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        if (view == null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            view = layoutInflater.inflate(R.layout.categoria_item_row, null, true);
        }

        Categoria cat= categorias.get(i);

        TextView tid= view.findViewById(R.id.txtIdCategoriaVista);
        TextView tNombre = view.findViewById(R.id.txtNombreCategoriaLista);

        tid.setText(cat.getId().toString());
        tNombre.setText(cat.getNombre());

        return  view;

    }
}
