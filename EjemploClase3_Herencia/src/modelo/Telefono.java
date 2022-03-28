package modelo;


public class Telefono
{
    protected String numero;
    protected String marca;
    
    void sonar()
    {}
    
    void llamar()
    {
        metodo();
    }
    
    public static void metodo()
    {
        System.out.println("soy metodo estatico");
    }
    
    public static void main(String []args)
    {
        Telefono.metodo();
        Telefono tel = new Telefono();
        tel.metodo();
        tel.llamar();
    }
}
