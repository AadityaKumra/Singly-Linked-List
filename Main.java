class Main {
  public static void main(String[] args) {
    Singlylinkedlist sLL = new Singlylinkedlist();
    sLL.createSinglyLinkedList(5);

    sLL.insertInLinkedList(6, 1);
    sLL.insertInLinkedList(7,3);
    System.out.println(sLL.head.value);
    System.out.println(sLL.head.next.value);
    System.out.println(sLL.head.next.next.value);
  }
}   