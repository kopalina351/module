package Module3;

import Module3.ListElement.SinglyList;

public class DemoSinglyList {
	public static void main(String[] args) {
		SinglyList sl = new ListElement().new SinglyList();
        sl.addBack(1);
        sl.addBack(2);
        sl.addBack(3);
        sl.addFront(6);
 
        sl.printList();
        System.out.println();
 
        sl.delEl(6);
        sl.delEl(5);
        sl.delEl(12);
        sl.delEl(2);
 
        sl.printList();
        System.out.println();
    }

}
