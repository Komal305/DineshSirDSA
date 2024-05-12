package javaLinkedList;

public class DoublyLinkedListImpl {
private ListNode head;
private ListNode tail;
private int length;
public static void main(String[] args) {
	DoublyLinkedListImpl d=new DoublyLinkedListImpl();
	d.insertLast(5);
	d.insertLast(55);
	
	d.insertFirst(1);
	d.insertFirst(11);
	d.insertFirst(111);
	
	//d.printDoublyF();
	//d.printDoublyB();
}
private void insertLast(int value) {
	ListNode newNode= new ListNode(value);
	if(isEmpty()) {
		head=newNode;
	}else {
		tail.next=newNode;
		newNode.previous=tail;
	}
	
	tail=newNode;
	length++;
}
private void insertFirst(int value) {
	ListNode newNode= new ListNode(value);
	if(isEmpty()) {
		tail=newNode;
	}else {
		head.previous=newNode;
	}
	newNode.next=head;
	head=newNode;	
	length++;
}
private class ListNode{
	private int data;
	private ListNode next;
	private ListNode previous;
	
	public ListNode(int data) {
		this.data=data;
	}
}

public DoublyLinkedListImpl() {
	this.head=null;
	this.tail=null;
	this.length = 0;
}

public boolean isEmpty() {
	return length==0;//head==null;
}

public int length() {
	return length;
}
//~~~~~~~~~~~~~~~~~~~~~~forward direction~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public void printDoublyF() {
	if(head==null)return;
	ListNode temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.print("null");
}

//~~~~~~~~~~~~~~~~~~~~~~backward direction~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public void printDoublyB() {
	if(tail==null)return;
	ListNode temp=tail;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.previous;
	}
	System.out.print("null");
}
}
