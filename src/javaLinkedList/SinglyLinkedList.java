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
	SinglyLinkedList l1=new SinglyLinkedList();
	
	//
	l1.head=new ListNode(30);
	ListNode l2=new ListNode(4);
	ListNode l3=new ListNode(23);
	ListNode l4=new ListNode(27);
	
	//connecting them together to form a chain
	l1.head.next=l2; //30>-4>-null
	l2.next=l3;//30>-4>-23>-null
	l3.next=l4;//30>-4>-23>-27>-null
	
	l1.printSinglyLinkedList();
}

public void printSinglyLinkedList(){
	ListNode current=head;
	while(current!=null) {
		System.out.print(current.data+">-");
		current=current.next;
	}
	System.out.println("null");
}
}
