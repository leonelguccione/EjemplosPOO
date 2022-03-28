package modelo;

public class BibliotecaSingleton
{
    private static BibliotecaSingleton instancia_biblioteca = null;
    
    private BibliotecaSingleton()
    {
    }
    
    public static BibliotecaSingleton getInstancia()
    {
        if(instancia_biblioteca == null)
        {
            instancia_biblioteca = new BibliotecaSingleton();
    
        }
        return instancia_biblioteca;
    }
}
