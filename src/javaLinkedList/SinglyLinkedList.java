package javaLinkedList;

public class SinglyLinkedList {
private ListNode head;

private static class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	SinglyLinkedList n1=new SinglyLinkedList();
	n1.head=new ListNode(1);
	ListNode n2=new ListNode(2);
	ListNode n3=new ListNode(3);
	ListNode n4=new ListNode(4);
	ListNode n5=new ListNode(5);
	
	//connecting them together to form a chain
	n1.head.next=n2; //30>-4>-null
	n2.next=n3;//30>-4>-23>-null
	n3.next=n4;//30>-4>-23>-27>-null
	n4.next=n5;
 n1.print(n1.head);
//	n1.length();
//	n1.insertHead(9);
//	n1.length();
//	n1.insertEnd(4);
//	n1.length();
//	n1.insertNode(99, 3);
	//System.out.println(n1.deleteFirst().data);
	//System.out.println(n1.deleteLast().data);
//l1.deleteNode(2);
// System.out.println(n1.searchElement(3));
// ListNode rev=n1.reverse(n1.head);
 
 //ListNode rev=n1.reverseBetween(n1.head, 2, 4);
 
// ListNode mid=n1.middleNode();
// System.out.println(mid.data);
	//n1.print(mid);
 ListNode nth=n1.nthEndNode(6);
 System.out.println(nth.data);
}
// ====================================================print================================================================
public void print(ListNode head){
	ListNode current=head;
	while(current!=null) {
		System.out.print(current.data+">-");
		current=current.next;
	}
	System.out.println("null");
}
//====================================================length================================================================
public int length(){
	if(head==null) {
		return -1;
	}
	int count=0;
	ListNode current=head;
	while(current!=null) {
		count++;
		current=current.next;
	}
	return count;
}
//====================================================insert===============================================================
public void insertHead(int value) {
	ListNode newNode=new ListNode(value);
	newNode.next=head;
	head=newNode;
}


public void insertEnd(int value) {
	ListNode newNode=new ListNode(value);
	if(head==null) {
		newNode=head;
		return;
	}
	ListNode current = head;
	while(null!=current.next) {
		current=current.next;
	}
	current.next=newNode;
}

public void insertNode(int data,int position) {
	ListNode node=new ListNode(data);
	if(position==1) {
		node.next=head;
		head=node;
	}else {
		ListNode previous=head;
		int count=1;
		while(count<position-1) {
			previous=previous.next;
			count++;
		}
		ListNode current=previous.next;
		node.next=current;
		previous.next=node;
	}
}
//====================================================delete================================================================
public ListNode deleteFirst() {
	if(head==null) {
		return null;
	}
	ListNode temp=head;
    head=head.next;
	temp.next=null;
	return temp;
}

public ListNode deleteLast() {
	if(head==null) {
		return null;
	}
	 ListNode current=head;
	ListNode previous =null;
		while(current.next!=null) {
			previous =current;
			current=current.next;
		}		
previous.next=null;
		
	return current;
}


public void deleteNode(int position) {
	if(position==1) {
		head=head.next;
	}else {
		ListNode previous=head;
		int count=1;
		while(count<position-1) {
			previous=previous.next;
			count++;
		}
		ListNode current=previous.next;
		previous.next=current.next;
	}
}
//====================================================search================================================================
public boolean searchElement(int key) {
	ListNode current=head;
	while(current!=null) {
		if(current.data==key)
			return true;
		
		current=current.next;
	}
	
	return false;
}

//====================================================reverse================================================================
public ListNode reverse(ListNode head) {
	if(head==null) return head;
	
    ListNode current=head;
    ListNode previous=null;
    ListNode next=null;
    while(current!=null){
        next=current.next;
        current.next=previous; 
        previous=current;
        current=next;
    }
    return previous;
}

public ListNode reverseBetween(ListNode head, int left, int right) {
	if(head==null) return head;
	
    ListNode current=head.next;
    ListNode previous=null;
    ListNode next=null;
    while(left<=right){
        next=current.next;
        current.next=previous; 
        previous=current;
        current=next;
    }
    return previous;
}
//====================================================middle node================================================================
public ListNode middleNode() {
	
	ListNode slowPtr=head;
	ListNode fastPtr=head;
	while(fastPtr!=null && fastPtr.next!=null) {
		slowPtr=slowPtr.next;
		fastPtr=fastPtr.next.next;
		
	}	
	return slowPtr;
}
//====================================================nth node================================================================
public ListNode nthEndNode(int n) {
	if(head==null)return null;

	if(n<=0) throw new IllegalArgumentException(n+" invalid number ");
	
	int count=0;
	ListNode ref=head;
	ListNode main=head;
	while(count<n) {
		if(ref==null) throw new IllegalArgumentException(n+" is grater than the number of node ");
		ref=ref.next;
		count++;
	}
	while(ref!=null) {
		ref=ref.next;
		main=main.next;
	}
	
	return main;

}
}



