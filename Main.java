class Main {
  public static void main(String[] args) {
    Singlylinkedlist sLL=new Singlylinkedlist();
    sLL.createSinglyLinkedList(5);
    
    sLL.insertInLinkedList(6,0);
    System.out.println(sLL.head.value);  
  }
}