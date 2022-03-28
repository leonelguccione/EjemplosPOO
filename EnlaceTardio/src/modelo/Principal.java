package modelo;

public class Principal
{
    private Padre atributo1;

    public Principal()
    {
        super();
    }

    public void setAtributo1(Padre parametro)
    {
        this.atributo1 = parametro;
    }

    public void ejecutar()
    {
        atributo1.metodo1();
    }

    public static void main(String[] args)
    {
        Principal p = new Principal();
        Padre padre = new Padre();
        Hijo hijo = new Hijo();
        int contador = 0;
        for (contador = 0; contador < 20; contador++)
        {
            if (Math.random() > 0.5)
                p.setAtributo1(padre);
            else
                p.setAtributo1(hijo);
            p.ejecutar();
        }
    }
}
