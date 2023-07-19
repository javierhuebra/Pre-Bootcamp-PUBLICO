package OOP_Advanced.telefono;

public class PhoneTester {
    
    public static void main(String[] args){
        IPhone iphone13 = new IPhone("Manzanita X31", 50, "Un tipo piola", "trutututut trutututu");
        Galaxy galaxyNote = new Galaxy("Androide R78", 100, "Otro tipo piolasa", "Espionage de nokia");

        iphone13.displayInfo();
        galaxyNote.displayInfo();

        iphone13.ring();
        galaxyNote.ring();

        iphone13.unlock();
        galaxyNote.unlock();
    }
}
