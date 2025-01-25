import java.util.*;

class ArrayListCode{
	void arrayListMethod(){  
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);

		Iterator<Integer> i = arr.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
public class demo030{

	public static void main(String[] args) {
		ArrayListCode obj = new ArrayListCode();
		obj.arrayListMethod();
		}
	}

