/**
 * 
 */
package geeks_Linkedlist;

/**
 * @author ankur_personal
 *
 */
public class Merge_linkedlist extends Linked_list {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Linked_list.Node llist= new Node(1);
        llist.next=new Node(3);
        llist.next.next=new Node(5);
        llist.next.next.next=new Node(7);
        
       Linked_list.Node plist= new Node(2);
       plist.next=new Node(4);
       plist.next.next=new Node(6);
       plist.next.next.next=new Node(8);
       plist.next.next.next.next=new Node(9);
  Linked_list l = new Linked_list();
//      l.Printall(llist);
//      System.out.println("second");
//      l.Printall(plist);
   l.Printall(Merge(llist,plist));

	}

	 static Node Merge(Node llist, Node plist) {
		// TODO Auto-generated method stub
		Node result = null;
		 if(llist==null)
			return plist;
		 if(plist==null)
			 return llist;
		 if(llist.data<=plist.data)
		 {
			 result=llist;
		     result.next=Merge(llist.next, plist);
		 } else 
		 {

			 result=plist;
		     result.next=Merge(llist, plist.next);
		 }
			 
		return result;
	}

	

}
