package OOP_Java.guardiazoologico;

public class GorillaTest {

    public static void main(String[] args) {
        Gorilla kingKong = new Gorilla();
        
        kingKong.throwSomething();
        kingKong.throwSomething();
        kingKong.throwSomething();
        kingKong.displayEnergy();

        kingKong.eatBananas();
        kingKong.eatBananas();
        kingKong.displayEnergy();

        kingKong.climb();
        kingKong.displayEnergy();

    }
}
