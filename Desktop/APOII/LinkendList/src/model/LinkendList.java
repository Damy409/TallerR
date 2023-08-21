package model;

public class LinkendList {

    private Node head;
    private Node tail;

    public LinkendList(){

    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void add(Node node){
        // EL caso base de nuestra estructura
        // La lista vacia
        if(this.head == null && this.tail == null){
            this.head = node;
            this.tail = node;
        }
        // Caso recursivo -> agregar al final de la lista.
        else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void addFirst(Node node){
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }
        else {
            node.setNext(this.head);
            this.head = node;
        }
    }

    // Método de Activación
    public String print(){
        return print(this.head);
    }

    private String print(Node current){
        String str = "";
        if (this.head == null && this.tail == null){
            str = "is empty list";
        }
        else if(current.equals(this.tail) ){
            str += this.tail.getKey();
        }
        else {
            str += current.getKey() + " " + print(current.getNext());
        }
        return str;
    }

    public void delete(int goal){
        delete(goal, this.head, null);
    }

    public void delete(int goal, Node current, Node previous){
        // Caso base -> is Empty List
        if(this.head == null){
            // is Empty list
        }
        else if(current == tail){
            // no se encontro el nodo
        }
        else if(current.getKey() == goal){
            // Caso Borde: donde current == head
            if(current == this.head){
                this.head = current.getNext(); // Actulización de lista
                current.setNext(null); // Desconección del elemento
            }
            // Caso Borde: Cola de la lista
            else if(current == this.tail){
                this.tail = previous; // Actulización de lista
                previous.setNext(null); // Desconección del elemento
            }
            // Caso intermedio: Cualquier otro elemento de la lista
            else {
                previous.setNext(current.getNext()); // Actulización de lista
                current.setNext(null); // Desconección del elemento
            }
        }
        else {
            delete(goal, current.getNext(), current);
        }
    }

}













