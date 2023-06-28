package com.list;

public class LiLi {
	Node head;
      Node tail;
	 int size=0;
	 public LiLi() {
		 this.size=0;
	 }

 class Node{
	 int val;
	 Node next;
	
	 public Node(int val, Node next) {
		super();
		this.val = val;
		this.next = next;
	}

	public Node(int val) {
		 this.val=val;
	 }
	
	 public Node() {
		 
	 }
 }
 public void insertFirst(int val)
 {
	 if(tail==null)
	 {
		tail=head;
	 }
	 Node node=new Node(val);
	 node.next=head;
	 head=node;
 }
 public void insertLast(int val)
 {
	 if(tail==null)
	 {
		 insertFirst(val);
		 return;
	 }
	 Node node=new Node(val);
	 tail.next=node;
	 tail=node;
 }
 public void insertSpecific(int val,int index)
 {
	 if(index==0)
	 {
		 insertFirst(val);
		 return;
	 }
	 if(index==size)
	 {
		 insertLast(val);
		 return;
	 }
	 Node temp=head;
	 for(int i=1;i<index;i++)
	 {
		 temp=temp.next;
	 }
	 Node node=new Node(val,temp.next);
	 temp.next=node;
 }
 public int deleteFirst()
 {
	 int val=head.val;
	 head=head.next;
	 if(head==null)
	 {
		 tail=null;
	 }
	 return val;
 }
 public int deleteLast()
 {
	 int val=tail.val;
	 if(head==null)
	 {
		System.out.println("list is empty !!");
	 }
	 if(head!=tail)
	 {
		 Node current=head;
		 while(current.next!=tail)
		 {
			 current=current.next;
		 }
		 
		tail=current;
		 tail.next=null;
		 
	 }
	 else
	 {
		 head=tail=null;
	 }
	 return val;
 }
 public void display()
 {
	 Node current=head;
	 while(current!=null)
	 {
		 System.out.print(current.val +" ->");
		 current=current.next;
	 }
	 System.out.println("End");
 }
 public  void removeElements(int val) {
	 if(head ==null) {
		 System.out.println("list is empty");
	 }
	 Node node=new Node(0);
	 node.next=head;
	 Node current=node;
	 while(current.next!=null)
	 {
		 if(current.next.val==val)
		 {
			 current.next=current.next.next;
		 }
		current=current.next;
		 
	 }
	 
 }
 //middle of the element
 public void middle()
 {
	 Node current=head;
	 int count=0;
	 while(current.next!=null)
	 {
		 count++;
		 
	 }
	 System.out.println(count);
 }
 
// public void insertStart(int val) {
//	 Node newNode=new Node(val);
//	 if(tail==null)
//	 {
//		 tail=head;
//	 }
//	 newNode.next=head;
//	 head=newNode;
//	 size+=1;
//	 
// }
// public void insertLast(int val) {
//	 Node newNode=new Node(val);
//	 if(tail==null) {
//		 insertStart(val);
//		 return;
//	 }
//	 tail.next=newNode;
//	 tail=newNode;
//	 size++;
// }
// public void deleteFirst()
// {
//	 if(head==null) {
//		 System.out.println("List is empty");
//	 }
//	 if(head!=tail)
//	 {
//		 head=head.next;
//	 }
// }
// public void deleteLast() {
//	//Checks whether the list contains only one element  
//	 if(head != tail ) {  
//         Node current = head;  
//         //Loop through the list till the second last element such that current.next is pointing to tail  
//         while(current.next != tail) {  
//             current = current.next;  
//         }  
//         //Second last element will become new tail of the list  
//         tail = current;  
//         tail.next = null;  
//     }  
// }
// public void display() {
//	 Node temp=head;
//	 while(temp!=null) {
//		 System.out.print(temp.val +" -> ");
//		temp=temp.next;
//	 }
//	 System.out.println("End");
// }
	
	
	
}
