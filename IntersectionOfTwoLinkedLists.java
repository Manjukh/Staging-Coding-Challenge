import java.util.HashSet;
import java.util.Set;

class Node{
int value;
 Node next;

}

class Main{
  
  //function to create a new node with the given data
  public static Node push(Node head, int value){
    
    Node node =new Node();
    node.value=value;
    node.next=head;
    return Node;
  }
  
  
  //function to find the intersection point using hashing
  
  public static node intersectionPoint(Node first ,Node Second)
  {
    //a Set to store List nodes
    Set<Node> nodes=new HashSet<>();
    //traverse 1st list and store address of each node into the Set
    while(first!=null){
      nodes.add(first);
      first=first.next;
    }
    //traverse the 2nd list and find the second node that is already present in the list
    
    {
      while (second !=null)
      {
        //return the current node if it is found in the set
        if(nodes.contains(second))
           return second;
      }
      
      second=second.next;
    }
    //here if lists do not intersect
    return null;
  }
  
  public static void main(String args[]){
    //construct 1st list(1->2->3->4->5->null)
    Node first=null;
    for(int i=5;i>0;i--){
      first=push(first,i);
    }
    
    //construct 2nd list(1->2->3->null)
    Node second=null;
    for(int i=3;i>0;i--){
      second=push(second,i);
    }
    //linking tail of second list to the fourth node of 1st list
    second.next.next.next=first.next.next.next;
    Node(addr)= intersectionPoint(first,second);
    if(addr!=null)
      System.out.println("The intersection point is:"+addr.data);
    else
      System.out.println("The lists do not intersect");
  }
}
    
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
