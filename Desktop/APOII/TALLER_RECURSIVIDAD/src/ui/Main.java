package ui;

public class Main{

    public static void main(String[] args){

        System.out.println("Hello world");

        LinkedList list = new LinkedList();

        Person p1 = new Person("juan", 25);
        Person p2 = new Person("Carlos", 25);
        Person p3 = new Person("Daniel", 25);
        list.addNodeAtEnd(p1, list.getHead());
        list.addNodeAtEnd(p2, list.getHead());
        list.addNodeAtEnd(p3, list.getHead());

        list.getList(list.getHead());
    }





    
    
}     