package Module3.src.main.java.Module3;

import java.util.Random;

public class Node {
	  //���������� �������� �������� ������
	  private int element;
	  //��������� �� ��������� ������� ������
	  private Node next;
	  //����� ����������� �������� ��������
	  public int getElement(){
	    return element;
	  }
	  //��������� ����������� ��� �������� �������� ������
	  public void setElement(int e){
	    element = e;
	  }
	  //��������� ��������� �� ��������� ������� ������
	  public Node getNext() {
	    return next;
	  }
	  //��������� ���������� �������� ������
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
