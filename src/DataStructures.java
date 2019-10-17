import java.util.LinkedList;

public class DataStructures {

    void linkedList()
    {
        // This is how a Linked List is created, define the data type that it will store and give it a name
        LinkedList<String> alphabet = new LinkedList<>();
        alphabet = populateList(alphabet);
        System.out.println(status(alphabet));
        System.out.println(getSize(alphabet));
        System.out.println(getElement(alphabet, 2));

    }

    //Method to check if a linked list contains an element
    boolean status(LinkedList<String> list)
    {
        boolean status = list.contains("A");
        return status;
    }

    //Method to get the size of the linked list
    int getSize(LinkedList<String> list)
    {
        int size = list.size();
        return size;
    }

    //This method gets the element at the given index and changes it
    String getElement(LinkedList<String> list, int index)
    {
        list.set(2, "NEW");
        String newElement = list.get(index);
        return newElement;
    }

    LinkedList<String> populateList(LinkedList<String> list)
    {
        list.add("Z");
        list.add("G");
        list.add("E");
        list.add("A");
        list.add("D");

        return list;
    }

    void tutorialBasics()
    {
        // This is how a Linked List is created, define the data type that it will store and give it a name
        LinkedList<String> alphabet = new LinkedList<>();

        // Add elements to the linked list, they are stored in the list in the order they are added
        alphabet.add("A");
        alphabet.add("B");

        // Printing a Linked List prints all elemnts in the List in order
        System.out.println(alphabet);

        //addLast and adddFirst can be used to add at the start or end of the list
        alphabet.addLast("A");
        alphabet.addFirst("Z");
        System.out.println(alphabet);

        // To add at a specific index then you must declare the index before the element you wish to add
        alphabet.add(2, "Z");
        System.out.println(alphabet);

        // To remove items from a linked list you use the remove function, to remove a certain element you can reference
        // it. However if this is not a unique element it will delete the first instance of the element. If you wish to
        // remove a specific index you can reference the index directly.
        alphabet.remove("Z");
        alphabet.remove(3);
        System.out.println(alphabet);

        //You can remove the first and last element of a list by using removeFirst() and removeLast()
        alphabet.removeFirst();
        alphabet.removeLast();
        System.out.println(alphabet);
    }
}
