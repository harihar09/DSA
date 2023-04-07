package CP.LeetCode.LinkedList;

public class DesignLinkedList_707 {
    Node head;
    int size;
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
            size++;
        }
    }
    public DesignLinkedList_707(){
        this.head = null;
        this.size = 0;
    }

    public void addAtHead(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    public void addAtTail(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        // traverse linked list and add val at last
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }
    public void addAtIndex(int index,int val){
          if(index < 0 || index > size){
              return;
          }
          Node node = new Node(val);
          if(index == 0){
              node.next = head;
              head = node;
              return;
          }else{
             int tempIndex = 0;
             Node currentNode = head;
             while(tempIndex < index-1){
                 currentNode = currentNode.next;
                 tempIndex++;
             }
             node.next = currentNode.next;
             currentNode.next = node;
          }
    }
    public void deleteAtIndex(int index){
        if(index < 0 || index >=size) {
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }else{
            int tempIndex = 0;
            Node currentNode = head;
            while(tempIndex < index-1){
                currentNode = currentNode.next;
                tempIndex++;
            }
            currentNode.next = currentNode.next.next;
            size--;
        }
    }
    public int getAtIndex(int index){
        if(index < 0 || index >= size){
            return -1;
        }
        Node currentNode = head;
        if(index == 0){
            return currentNode.val;
        }else{
            int tempIndex = 0;
            while (tempIndex < index){
                currentNode = currentNode.next;
                tempIndex++;
            }
            return currentNode.val;
        }
    }
    public void print(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.val+"->");
            currentNode = currentNode.next;
        }
        System.out.print("NULL"+"\n");
        System.out.println("size "+size);
    }

    public static void main(String[] args) {
        DesignLinkedList_707 list = new DesignLinkedList_707();
        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtHead(30);
        list.print();
        list.addAtTail(5);
        list.addAtHead(40);
        list.addAtTail(2);
        list.print();
        list.addAtIndex(2,50);
        list.print();
        list.addAtIndex(7,100);
        list.print();
        list.addAtIndex(0,300);
        list.print();
        list.deleteAtIndex(0);
        list.print();
        list.deleteAtIndex(2);
        list.print();
        list.deleteAtIndex(4);
        list.print();
        System.out.println(list.getAtIndex(6));

    }
}
