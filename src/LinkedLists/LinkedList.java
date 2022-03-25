package LinkedLists;

public class LinkedList<T extends Comparable<T>> implements List<T> {
    private Node<T> head;
    private int numOfItems;

    @Override
    public void insert(T data) {
        if (head == null) {
            // If head points to null, the data we are adding will be the first item
            head = new Node<>(data);
        } else {
            // Some other node exists. So we will have to insert a node at the beginning.
            insertBeginning(data);
        }

    }

    // Function to add new node at the beginning of the list in O(1)
    private void insertBeginning(T data) {
        // Make the new node point to head, indirectly making the new node as the head.
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(head); // Making the new node point to head.
        head = newNode; // Make the new node as the new head of the list
    }

    // Function to add new node at the end of the list. Function is recursive.
    private void insertEnd(T data, Node<T> node) {
        // Search for the last node and update its reference to point to new node.
        // Make new node point to null.
        // O(N) running time
        if (node.getNextNode() != null) {
            insertEnd(data, node.getNextNode()); // Recursively calling this function to search through the list
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }

    }

    @Override
    public void remove(T data) {
        if (head == null) return;
        if (head.getData().compareTo(data) == 0) {
            // Check if the data we are removing is the same as the data in the head node
            head = head.getNextNode();
        } else {
            remove(data, head, head.getNextNode()); // Removing an element that matches the data
        }

    }

    // Function to remove element that matches the given data
    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
        // We have to store 2 references to 2 nodes because we cannot traverse backwards in LL
        // Searching for the last element
        while (actualNode != null) {
            // If this is the node that we have to remove
            if(actualNode.getData().compareTo(data) == 0) {
                // Update references
                numOfItems--; // Decrementing the number of items
                // Make the previous node point to what actual node is currently pointing
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            // Moving forwards
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }

    }

    @Override
    public void traverse() {
        // First check if head points to null;
        if (head == null) return;
        Node<T> actualNode = head;

        while (actualNode != null){
            System.out.println(actualNode.toString());
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return numOfItems;
    }
}
