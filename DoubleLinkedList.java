
public class DoubleLinkedList {
Node head,tail;
int size;
     public DoubleLinkedList() {
    	 head=tail=null;
    	 size=0;
     }
     public boolean isEmpty(Node head) {
    	 return head==null;
     }
     public void Add(char n) {
    	 if(isEmpty(head)) {
    		 head=new Node(n);
    		 size++;
    	 }
    	 else {
    		 Node current=head;
    		 while(current.next!=null) {
    			 current=current.next;
    			 size++;
    		 }
    		 Node last=new Node(n);
    		 current.next=last;
    		 last.previous=current;
    		 last.next=null;   		 
    	 }
     }
    
}
