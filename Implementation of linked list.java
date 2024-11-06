class Node {
    int data;
    Node address;  

    public Node(int data) {
        this.data = data;
        this.address = null;
    }
}

 public class LinkedList {
        Node head,tail;
        int size;
        public LinkedList()
        {
            head=tail=null;
            size=0;
        }
        public void add (int d)
        {
       Node n= new Node (d);
       if(head==null)
       {
           head=tail=n;
           
       }
       else
       {
           tail.address=n;
            tail=n;
        }
        }
      public static void main(String[] args) {
          LinkedList list=new LinkedList();
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          
          
          System.out.println(list.head.data);
          System.out.println(list.head.address.data);
          System.out.println(list.head.address.address.data);
          System.out.println(list.head.address.address.address.data);
}
 }