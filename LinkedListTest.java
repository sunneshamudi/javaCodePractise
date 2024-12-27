class Node{
    int data;
    Node next;//custome data type

    public Node(int data){ //constructor    
        this.data = data;
        this.next = null; //initially the next node will be null
    }
}
    class linkedlist{
        private Node head; //custome data type head - from Node class(line1)

    public linkedlist() // constructor
    {
        this.head= null; //initializing head to null 
    }
    public void add (int data){
    Node newnode = new Node(data); //instance of node
    
    if(head==null)
    {
        head = newnode;
    }
    else{
        Node curentNode = head;
        while(curentNode.next !=  null)
        {
            curentNode = curentNode.next;
        }
        curentNode.next=newnode;
    }   
    }
}
public class LinkedListTest {
    public static void main(String[] args) {
        linkedlist Ls = new linkedlist();
        Ls.add(21);
        Ls.add(21);
        Ls.add(212);
        Ls.add(217);
        Ls.add(215);

    }
}