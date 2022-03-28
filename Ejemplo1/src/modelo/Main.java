package modelo;

public class Main
{
    
    public Main()
    {
        super();
    }

    public static void main(String[] args)
    {
        Biblioteca unaBiblioteca = new Biblioteca();
        
        Alumno unCliente = new Alumno();
        unCliente.setNombre("Leonel");
        System.out.println(unCliente.getNombre());
        System.out.println(Alumno.getSiguienteNro());
        System.out.println(unCliente.getSiguienteNro());
    }
}
