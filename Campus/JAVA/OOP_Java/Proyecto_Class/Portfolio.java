import java.util.ArrayList;

public class Portfolio {

    private ArrayList<ProyectoClass> projects = new ArrayList<ProyectoClass>();//Tambien se puede declarar private ArrayList<ProyectoClass> projects; sin inicializarlo

    public Portfolio(){ //Constructor (Anda igual si lo pongo o no, debo consultar esto)

    }

    //Setters
    public void setProyects(ProyectoClass proyecto){
       projects.add(proyecto);
    }

    //Getters
    public ArrayList<ProyectoClass> getProyects(){
        return projects;
    }

    //Metodo para devolver suma de costos de los proyectos
    public double getPortfolioCost(){
        double suma = 0.0;

        for(ProyectoClass proyecto : projects){
            suma += proyecto.getInitialCost();
        }

        return suma;
    }

    //Metodo para mostrar los proyectos del ArrayList projects
    public void showPortfolio(){
        for(ProyectoClass proyecto : projects){
            System.out.println(proyecto.elevatorPitch()); 
        }
        System.out.println("- - - - - - - - - - - - - - - - - - ");
        System.out.println("La suma del costo de los proyectos es: " + "\u001B[32m"+"$ "+this.getPortfolioCost()+"\u001B[0m"); 
    }
}
