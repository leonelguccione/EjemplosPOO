package modelo;

public class Hijo extends Padre
{
    public Hijo()
    {
        super();
    }
    
    @Override
    public void metodo1()
    {
        System.out.println("ejecución" +
              "del Hijo->metodo1");
    }
}
