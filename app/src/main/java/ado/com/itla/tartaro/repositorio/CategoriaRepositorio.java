package ado.com.itla.tartaro.repositorio;

import java.util.List;

import ado.com.itla.tartaro.entidad.Categoria;

//clase que interactua con la base de datos
public interface CategoriaRepositorio {

    public boolean guardar(Categoria categoria); //este metodo guarda y actualiza

    Categoria buscar(int id);

    List<Categoria> buscar(String buscar);


}
