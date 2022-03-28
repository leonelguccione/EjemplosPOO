package modelo;


public abstract class Telefono_Publico extends Telefono
{
    String ubicación;
    
    void recibirCredito()
    {}
    
    void controlarCredito()
    {}

    public static  void prueba()
    {
        System.out.println("Prueba");
    }

    @Override
    abstract void sonar();
    
    public static void main(String[] args)
    {
        Telefono_Publico.prueba();
    }

    
}
