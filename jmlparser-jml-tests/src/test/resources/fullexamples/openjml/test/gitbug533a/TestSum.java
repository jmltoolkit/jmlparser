import java.util.ArrayList;
import java.util.List;

public class TestSum {
	/*@
	 private static invariant (\sum int i; list.contains(i); i) >= 0; 
	 @*/
	private static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		list.add(-3);
	}
}
