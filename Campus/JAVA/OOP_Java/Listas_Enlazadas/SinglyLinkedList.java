package OOP_Java.Listas_Enlazadas;

public class SinglyLinkedList {
    public Node head;

    // Crear un método constructor para establecer head en null para los objetos de
    // su SinglyLinkedList.
    public SinglyLinkedList() {
        head = null;
    }

    // Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar
    // nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    // Crear un método remove() que removerá un nodo del final de su lista.
    public void remove() {
        if (head == null) { // La lista está vacía, no hay nada que eliminar
            return;
        }

        if (head.next == null) { // La lista tiene un solo nodo, por lo tanto, eliminamos la referencia a la
                                 // cabeza
            head = null;
            return;
        }

        // Recorremos la lista hasta el penúltimo nodo
        Node runner = head;
        while (runner.next.next != null) {
            runner = runner.next;
        }

        // Eliminamos la referencia al último nodo
        runner.next = null;

        System.out.println("elemento borrado");
    }

    // Crear un método para imprimir los valores de la lista
    public void printValues() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node runner = head;
        while (runner != null) {
            System.out.print(runner.value + " ");
            runner = runner.next;
        }
        System.out.println();
    }

    // EJERCICIOS OPCIONALES
    // --------------------------------------------------------

    // Implementar un método find(int) que retornará el primer nodo con el valor
    // dado en los parámetros.
    public Node find(int value) {
        Node runner = head;
        while (runner != null) {
            if (runner.value == value) {
                return runner; // Se encontró el nodo con el valor dado
            }
            runner = runner.next;
        }
        return null; // No se encontró ningún nodo con el valor dado

    }

    //Implementar un método removeAt(int) que removerá un nodo después de n nodos, donde n es el parámetro.
    public void removeAt(int n) {
        if (head == null) { // La lista está vacía, no hay nodos para eliminar
            return;
        }

        if (n == 0) {
            head = head.next; // Eliminar el primer nodo de la lista
            return;
        }

        Node runner = head;
        int count = 0;
        while (runner != null && count < n) { // Avanzar n nodos en la lista
            runner = runner.next;
            count++;
        }

        if (runner != null && runner.next != null) { // Eliminar el nodo siguiente si existe
            runner.next = runner.next.next; //Para eliminar un nodo hay que "puentearlo"
        }
    }

}
