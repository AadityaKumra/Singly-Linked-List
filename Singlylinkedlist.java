public class Singlylinkedlist{
  public Node head;
  public Node tail;
  public int size;


  public Node createSinglyLinkedList(int nodeValue){
    head=new Node();
    Node node=new Node();
    node.next=null;
    node.value=nodeValue;
    head=node;
    tail=node;
    size=1;
    return head;
  }
  //insert method in singlylinkedlist
  public void insertInLinkedList(int nodeValue,int location){
    Node node=new Node();
    node.value=nodeValue;
    if(head==null){
      createSinglyLinkedList(nodeValue);
      return;
    }
    else if(location==0){
      //at the beginning
      node.next=head;
      head=node;
    }
    else if(location>=size){
      //insert in the end of the list
      node.next=null;
      tail.next=node;
      tail=node;
    }
    else{
      Node tempNode=head;
      int index=0;
      while(index<location-1){
        tempNode=tempNode.next;
        index++;
      }
      Node nextNode=tempNode.next;
      tempNode.next=node; 
      node.value=nodeValue;
      node.next=nextNode;
      
      
    }
  size++;
  }
  //SinglyLinkedList Traversal
  public void traverseSinglyLinkedList(){
    if(head==null){
      System.out.println("Linked List does not exist");
    }
    else{
      Node tempNode=head;
      for(int i=0;i<size;i++){
        System.out.print(tempNode.value);
        if(i!=size-1){
          System.out.print(" -> ");
        }
        tempNode=tempNode.next;
      }
    }
    System.out.println("\n"); 
}
}