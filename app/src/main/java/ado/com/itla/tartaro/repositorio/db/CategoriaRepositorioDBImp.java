package ado.com.itla.tartaro.repositorio.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import ado.com.itla.tartaro.entidad.Categoria;
import ado.com.itla.tartaro.repositorio.CategoriaRepositorio;

public class CategoriaRepositorioDBImp implements CategoriaRepositorio {

    private ConexionDb conexionDb;
    private static final String CAMPO_NOMBRE = "nombre";
    private static final String TABLA_NOMBRE = "categoria";


    public CategoriaRepositorioDBImp(Context context) {
        conexionDb = new ConexionDb(context);
    }

    @Override
    public boolean guardar(Categoria categoria) {

        ContentValues cv = new ContentValues();
        cv.put(CAMPO_NOMBRE, categoria.getNombre());

        SQLiteDatabase db = conexionDb.getWritableDatabase();

        Long id = db.insert(TABLA_NOMBRE, null, cv);
        db.close();

        if (id.intValue() > 0) {
            categoria.setId(id.intValue());
            return true;
        }

        return false;
    }

    @Override
    public Categoria buscar(int id) {
        return null;
    }

    @Override
    public List<Categoria> buscar(String buscar) {

        List<Categoria> categorias = new ArrayList<>();

        SQLiteDatabase db = conexionDb.getReadableDatabase();

        String columnas[] = {"id", CAMPO_NOMBRE};

        Cursor cr = db.query(TABLA_NOMBRE, columnas, null, null, null, null, null, null);

        cr.moveToFirst();

        while (!cr.isAfterLast()) {
            int id = cr.getInt(cr.getColumnIndex("id"));
            String nombre = cr.getString(cr.getColumnIndex(CAMPO_NOMBRE));

            Categoria cat = new Categoria(id, nombre);
            categorias.add(cat);

            cr.moveToNext();//agregar siempre move to next
        }

        cr.close();
        db.close();

        return categorias;
    }
}
