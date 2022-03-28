package modelo;


public class Alumno
{
    /**
     * Atributo de clase, compartido por todas las instancias
     */
    private static int siguienteNro = 0;
    private int nroAlumno;
    private String nombre;
    private String apellido;
    private Biblioteca unaBiblioteca;
    private BibliotecaSingleton unicaBibliotecaSingleton;

    /**
     * Cada vez que se crea un cliente nuevo,
     * se incrementa en 1 el atributo de clase.
     * Luego se asigna ese valor al atributo nroCliente.
     */
    public Alumno()
    {
        siguienteNro++;
        nroAlumno = this.getSiguienteNro();

        this.unicaBibliotecaSingleton = BibliotecaSingleton.getInstancia();
    }
    
    public Alumno(String nombre)
    {
        this();        
        //this.nombre = nombre;
        this.setNombre(nombre);
    }
    
    public Alumno(String nombre, String apellido)
    {
        this(nombre);
        this.setApellido(apellido);
    }

    public int getNroAlumno()
    {
        return nroAlumno;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getApellido()
    {
        return apellido;
    }

    public static int getSiguienteNro()
    {
        return siguienteNro;
    }
    
    @Override
    public String toString()
    {
        return ("Cliente nro: " + nroAlumno + " Apellido: " + apellido + "Nombre: " + nombre);
    }
    //getters y setters    
    
    
    
    public static void main(String[] args)
    {
        Biblioteca unaBiblioteca = new Biblioteca();
        unaBiblioteca.setNombre("unmdp");
        
        Alumno unAlumno = new Alumno("leonel", "Guccione");
           
        System.out.println("Valor de siguienteNro:" + Alumno.getSiguienteNro());
        Alumno c1 = new Alumno();
        c1.apellido = "Perez";
        System.out.println("Valor de siguienteNro:" + Alumno.getSiguienteNro());
        c1.setApellido("GOMEZ");
        c1.setNombre("Federico");
        System.out.println(c1);
        System.out.println("Valor de siguienteNro en c1:"+c1.getSiguienteNro());
        Alumno c2 = new Alumno();
        c2.setApellido("Pereira");
        c2.setNombre("Martin");
        System.out.println(c2);
        System.out.println("Valor de siguienteNro en c1:"+c1.getSiguienteNro());
        System.out.println("Valor de siguienteNro en c2:"+c2.getSiguienteNro());
        System.out.println("Valor de siguienteNro:" + Alumno.getSiguienteNro());
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
