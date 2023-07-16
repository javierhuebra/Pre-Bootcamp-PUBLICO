public class ProyectoTest {
    public static void main(String[] args) {
        ProyectoClass proyecto1 = new ProyectoClass("Proyecto 1", "Este es el primer proyecto");
        ProyectoClass proyecto2 = new ProyectoClass("Proyecto 2", "Este es el segundo proyecto");
        ProyectoClass proyecto3 = new ProyectoClass("Proyecto 3", "Este es el tercer proyecto");
        ProyectoClass proyecto4 = new ProyectoClass("Proyecto 4", "Este es el cuarto proyecto");

        Portfolio portfolio = new Portfolio(); // Uso el constructor para instanciar la clase con el objeto vacio

        // Cargo los proyectos en el portfolio con el setter
        portfolio.setProyects(proyecto1);
        portfolio.setProyects(proyecto2);
        portfolio.setProyects(proyecto3);
        portfolio.setProyects(proyecto4);

        // Cargo los costos de cada proyecto
        proyecto1.setInitialCost(200);
        proyecto2.setInitialCost(300);
        proyecto3.setInitialCost(400);
        proyecto4.setInitialCost(127.85);

        System.out.println("-------------Metodo de ProyectoClass--------------");

        // Pruebo el getter de portfolio
        for (ProyectoClass proyecto : portfolio.getProyects()) {
            System.out.println(proyecto.elevatorPitch());
        }

        System.out.println("------------Metodo de Portfolio------------------");

        // Uso el metodo de la clase Portfolio para mostrar todo el portfolio
        portfolio.showPortfolio();
    }
}
