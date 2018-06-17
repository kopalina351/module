package Module3.src.main.java.Module3;

import java.util.Random;

public class Node {
	  //содержимое текущего элемента списка
	  private int element;
	  //указатель на следующий элемент списка
	  private Node next;
	  //вывод содержимого текущего элемента
	  public int getElement(){
	    return element;
	  }
	  //установка содержимого для текущего элемента списка
	  public void setElement(int e){
	    element = e;
	  }
	  //получение указателя на следующий элемент списка
	  public Node getNext() {
	    return next;
	  }
	  //установка следующего элемента списка
	  public void setNext(Node n) {
	    next = n;
	  }
	  
	  public static void main(String[] args) {		
			Random rn = new Random();
			int e= rn.nextInt(100);
			Node node = new Node();
			int next = 0;
			int element = 0;
	 node.setElement(rn.nextInt(100));		
		

	}  	  
}		
