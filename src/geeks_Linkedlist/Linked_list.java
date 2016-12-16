package geeks_Linkedlist;

public class Linked_list {
      Node head;
static class Node {
	 
	int data ;
	Node next;
	Node(int d )
	{
		data=d;
		next=null;
	}
}
public static void main(String[] args) {
        Linked_list llist=new Linked_list();
        llist.head  = new Node(1);
        Node Second = new Node(2);
        Node third = new Node(3);
        Node fourth  = new Node(4);
        
       llist.head.next=Second;
       Second.next=third;
       third.next=fourth;
       fourth.next=null;
    //llist.Printall();
    llist.Add_in_front(6);
    llist.Add_in_middle(7,third);
    //llist.delete(7);
   // System.out.println(llist.head.data+"");
   // llist.Swap(6,7);
    //llist.head= llist.reverse(llist.head);
  llist.Printall(llist.head);
    
}
  Node reverse(Node head2) {
	// TODO Auto-generated method stub
   Node prev=null;
   Node current=head2;
   Node next=null;
   while(current!=null)
   {
	   next=current.next;
	   current.next=prev;
	   prev=current;
	   current=next;
   }
   head2=prev;
   return head2;
}
 void Swap(int i, int j) {
	// TODO Auto-generated method stub
	if(i==j) 
	return;
	Node prevX=null,curr=head;
	while(curr!=null && curr.data!=i)
	{
		prevX=curr;
		curr=curr.next;
	}
	Node prevY=null,curY=head;
	while(curY!=null && curY.data!=j)
	{
		prevY=curY;
		curY=curY.next;
	}
    if (curr == null || curY == null)
        return;
    if (prevX != null)
        prevX.next = curY;
    else //make y the new head
        head = curY;
    if (prevY != null)
        prevY.next = curr;
    else // make x the new head
        head = curr;
  Node temp = curr.next;
  curr.next=curY.next;
  curY.next=temp;
  Printall(head);
}
 void delete(int i) {
	// TODO Auto-generated method stub
	Node temp=head,prev=null;
	if(temp!=null && temp.data==i)
		{
		head=temp.next;
		return;
		}
	while(temp!=null&& temp.data!=i)
	{
		prev=temp;
		temp=temp.next;
	}
	if(temp==null)
		return;
	prev.next=temp.next;
 	    Printall(head);
}
  void Add_in_middle(int d,Node after) {
	// TODO Auto-generated method stub
	Node new_node=new Node(d);
    new_node.next=after.next;
    after.next=new_node;
   // Printall();
}
  void Add_in_front(int d) {
	// TODO Auto-generated method stub
	Node new_node=new Node(d);
	new_node.next=head;
	head=new_node;
	//Printall();
}
  void Printall(Node head) {
	// TODO Auto-generated method stub
	Node n = head;
	int Count=0;
	while (n!=null)
	{   Count++;
		System.out.println(n.data+"data");
	   n=n.next;
	}
	System.out.println("Total number of nodes "+ Count+"");

}

}
