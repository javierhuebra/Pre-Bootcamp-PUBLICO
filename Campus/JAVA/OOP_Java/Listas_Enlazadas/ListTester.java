package OOP_Java.Listas_Enlazadas;

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        
        sll.add(56);
        sll.add(89);
        sll.add(47);
        sll.add(105);
        sll.removeAt(1);
        sll.printValues();

        Node valorRetornado;

        valorRetornado = sll.find(47);
        if(valorRetornado != null){
            System.out.println("El valor del nodo es: " + valorRetornado.value );
        }else{
            System.out.println("El valor no se encontró");
        }
        
    }
}

