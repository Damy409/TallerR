package ui;

import model.LinkendList;
import model.Node;

public class Main {

    public static void main(String[] args) {
        // Crear una lista vacia
        LinkendList list = new LinkendList();

        // Crear el primer nodo de la lista
        Node node1 = new Node(0);

        // Agregar el primer nodo a la lista
        list.add(node1);

        System.out.println(list.getHead()); // NodeKey = 0

        Node node2 = new Node(1);
        Node node3 = new Node(2);
        Node node4 = new Node(3);

        list.add(node2);
        System.out.println(list.getTail()); // NodeKey = 1

        list.add(node3);
        System.out.println(list.getTail()); // NodeKey = 2

        list.add(node4);
        System.out.println(list.getTail()); // NodeKey = 3

        list.add(new Node(4));

        System.out.println("Print List");
        System.out.println(list.print());

        System.out.println("******************************************");
        System.out.println("delete");
        System.out.println("delete head");
        list.delete(0);
        System.out.println(list.print());

        System.out.println("delete tail");
        list.delete(4);
        System.out.println(list.print());

        System.out.println("delete 2");
        list.delete(20);
        System.out.println(list.print());


        System.out.println("******************************************");
        System.out.println("add first");

        LinkendList list2 = new LinkendList();
        list2.addFirst(node1);
        System.out.println(list2.getHead());
        list2.addFirst(node2);
        System.out.println(list2.getHead());
        list2.addFirst(node3);
        System.out.println(list2.getHead());
        list2.addFirst(node4);
        System.out.println(list2.getHead());


    }
}
