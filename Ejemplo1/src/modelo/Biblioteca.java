package modelo;

import java.util.ArrayList;

public class Biblioteca
{
    String nombre;
    ArrayList libros = new ArrayList();
    
    
    public Biblioteca()
    {
        super();
    }


    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setLibros(ArrayList libros)
    {
        this.libros = libros;
    }

    public ArrayList getLibros()
    {
        return libros;
    }
}
