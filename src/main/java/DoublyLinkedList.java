import java.util.NoSuchElementException;
//singly linked list with first reference only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
 * @param <E>
*/

public class DoublyLinkedList<E>
{
        private class Node 
        {
            private E data;
            private Node next;
            private Node prior;
            
            private void displayNode()
            {
                System.out.println(data);
            }
	}
	
        private Node first;
        private Node last;
        
		
	/** 
    	Constructs an empty linked list.
	*/
	public DoublyLinkedList()
	{  
		first = null;
                last = null;
	}
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	public void addFirst(E element)
	{  
            Node newLink = new Node();
            newLink.data = element;
		
            if(first == null)
            {
                newLink.next = null;
                newLink.prior = null;
                first = newLink;
                last = newLink;
            }
            else
            {
                first.prior = newLink;
                newLink.next = first;    
                newLink.prior = null; 
                first = newLink;
            }
        }
        
        public void addNext(E key, E element)
        {
            Node current = first;
            
            while(current.data != key)
            {
                current = current.next;
                
                /*
                if(current == null)
                {
                    return false;
                }
                */
            }
            
            Node newLink = new Node();
            newLink.data = element;
            
            if(current == last)
            {
                newLink.next = null;
                last = newLink;
            }
            else
            {
                newLink.next = current.next;
                current.next.prior = newLink;
            }
            
            newLink.prior = current;
            current.next = newLink;
            //return true;
        }
        
        public void addLast(E element)
	{  
            Node newLink = new Node();
            newLink.data = element;
		
            if(last == null)
            {
                newLink.next = null;
                newLink.prior = null;
                first = newLink;
                last = newLink;
            }
            else
            {
                last.next = newLink;
                newLink.next = null;
                newLink.prior = last;
                last = newLink;
            }
        }

	public E getFirst() 
        {
            if (first == null)
		throw new NoSuchElementException();
		
            return first.data;
	}
        
        public E getLast() 
        {
            if (last == null)
		throw new NoSuchElementException();
		
            return last.data;
	}
        
        public E removeFirst() 
        {
            E temp = first.data;
            
            if(isEmpty())
            {
                throw new NoSuchElementException();
            }
            
            if(!isEmpty())
            {
                if (first.next == null)
                {
                    first = null;
                    last = null;
                    throw new NoSuchElementException();
                }
                else
                {
                    first = first.next;
                    first.prior = null;
                }
             }
            
            return temp;
	}
        
        public E removeLast() 
        {
            E temp = last.data;
            
            if(isEmpty())
            {
                throw new NoSuchElementException();
            }
            
            if(!isEmpty())
            {
                if (first.next == null)
                {
                    first = null;
                    last = null;
                    throw new NoSuchElementException();
                }
                else
                {
                    last = last.prior;
                    last.next = null;
                }
            }
            
            return temp;
	}
        
        public E removeKey(E key)
        {
            Node current = first;
            
            while(current.data != key)
            {
                current = current.next;
                
                if(current == null)
                {
                    return null;
                }
            }
            
            if(current == first)
            {
                first = current.next;
            }
            else
            {
                current.prior.next = current.next;
            }
            
            if(current == last)
            {
                last = current.prior;
            }
            else
            {
                current.next.prior = current.prior;
            }
            
            return current.data;
        }
        
        public boolean isEmpty() 
        {
            return first == null;
	}
	
        public void printList() 
        {
            Node current = first;
		
            while (current != null) 
            {
	        //System.out.println(current.data);
                current.displayNode();
	        current = current.next;
	    }
            //System.out.println();
	}
        
        public int size()
        {
            int size = 0;
            
            Node current = first;
            
            while(current != null)
            {
                size++;
                current = current.next;
            }
            
            return size;
        }
}
