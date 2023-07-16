public class ProyectoClass {
    private String nombre;
    private String descripcion;
    private double initialCost;
    

    //Constructores
    public ProyectoClass(){ //Vacio

    }

    public ProyectoClass(String nombre){ //Con nombre
        this.nombre = nombre;
    }

    public ProyectoClass(String nombre, String descripcion){ //Con nombre y descripcion
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setInitialCost(double cost){
        initialCost = cost;
    }
   

    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getDecripcion(){
        return descripcion;
    }
    public double getInitialCost(){
        return initialCost;
    }
   

    //Consigna elevatorPitch
    public String elevatorPitch(){
        String cadena = nombre + " : "  + "(" + " $ " + initialCost + " ) " + descripcion;
        return cadena;
    }
}
