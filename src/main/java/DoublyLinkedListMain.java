/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ShaneC
 */
public class DoublyLinkedListMain
{
    public static void main(String[] args)
    {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.addFirst("Mary");
        list.addFirst("Shane");
        list.addNext("Mary","Tom");
        list.removeFirst();
        System.out.println("First: " + list.getFirst());
        
        list.addLast("Michael");
        list.addLast("John");
        list.addLast("Owen");
        list.addLast("Harry");
        list.removeLast();
        System.out.println("Last: " + list.getLast());
        
        System.out.println("Size: " + list.size());
        
        list.removeKey("John");
        
        System.out.println("Size: " + list.size());
        
        System.out.print("Printed Linked List\n");
        list.printList();
        
        System.out.println("Empty: " + list.isEmpty());
    }
    
}
