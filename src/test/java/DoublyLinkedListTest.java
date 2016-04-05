import doublyLinkedList.DoublyLinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Windows on 31/03/2016.
 */

public class DoublyLinkedListTest
{

    public DoublyLinkedListTest()
    {
    }

    /**
     * Test of getFirst method, of class doublyLinkedList.DoublyLinkedList.
     */
    @Test
    public void testGetFirst()
    {
        System.out.println("getFirst");
        DoublyLinkedList instance = new DoublyLinkedList();

        instance.addFirst("Liam");
        instance.addFirst("David");
        instance.addFirst("Frank");

        Object expResult = "Frank";
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class doublyLinkedList.DoublyLinkedList.
     */
    @Test
    public void testGetLast()
    {
        System.out.println("getLast");
        DoublyLinkedList instance = new DoublyLinkedList();

        instance.addLast("Sarah");
        instance.addLast("Laura");
        instance.addLast("Tina");

        Object expResult = "Tina";
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class doublyLinkedList.DoublyLinkedList.
     */
    @Test
    public void testRemoveFirst()
    {
        System.out.println("removeFirst");

        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addFirst("Shane");
        instance.addFirst("Ryan");
        instance.addFirst("Brian");

        Object expResult = "Brian";
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class doublyLinkedList.DoublyLinkedList.
     */
    @Test
    public void testRemoveLast()
    {
        System.out.println("removeLast");

        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addLast("Jenny");
        instance.addLast("Roisin");
        instance.addLast("Anne");

        Object expResult = "Anne";
        Object result = instance.removeLast();

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeKey method, of class doublyLinkedList.DoublyLinkedList.
     */
    @Test
    public void testRemoveKey()
    {
        System.out.println("removeKey");
        Object key = "Fiona";
        DoublyLinkedList instance = new DoublyLinkedList();

        instance.addFirst("Andrew");
        instance.addFirst("Gerard");
        instance.addNext("Gerard", "Fiona");
        instance.addLast("Orla");
        instance.addLast("Alison");

        Object expResult = "Fiona";
        Object result = instance.removeKey(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class doublyLinkedList.DoublyLinkedList.
     */
    @Test
    public void testIsEmpty()
    {
        System.out.println("isEmpty");
        DoublyLinkedList instance = new DoublyLinkedList();

        instance.addFirst(7);
        instance.addLast(14);

        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class doublyLinkedList.DoublyLinkedList.
     */
    @Test
    public void testSize()
    {
        System.out.println("size");
        DoublyLinkedList instance = new DoublyLinkedList();

        instance.addFirst(1);
        instance.addNext(1, 2);
        instance.addLast(3);

        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}