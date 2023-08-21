package ui;

public class LinkedList {
    
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public void addNodeAtEnd(Person person, Node pointer){

        Node node = new Node(person);
        if(pointer == null){
            head = node;//Cuando la lista enlazada esta vacia
        }else{
            //Cuando no esta vacia debe ir buscando al ultimo elemento
            if(pointer.getNext()!=null){
                addNodeAtEnd(person, pointer.getNext());
            }else{
                pointer.setNext(node);
            }
        }


    }

    public void getList(Node pointer){
        if (pointer != null){
            System.out.println(pointer.getPerson().getName());
            getList(pointer.getNext());
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    

    
}
