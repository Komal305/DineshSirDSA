package javaLinkedList;

public class CircularSinglyLinkedList {
	ListNode last;
	private int length;
	private class ListNode{
		private ListNode next;
		private int data;
		 public ListNode(int data) {
			 this.data=data;
		 }
	}
	
	public CircularSinglyLinkedList() {
		last=null;
		length=0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void createCircularLinkedList() {
		ListNode  n1 =new ListNode(1);
		ListNode  n2 =new ListNode(3);
		ListNode  n3 =new ListNode(6);
		ListNode  n4 =new ListNode(9);
		ListNode  n5 =new ListNode(12);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		last=n5;
		length++;
	}
	public static void main(String[] args) {
		CircularSinglyLinkedList csll=new CircularSinglyLinkedList();
		
		
		csll.createCircularLinkedList();
		System.out.println(csll.isEmpty());
	}

}
