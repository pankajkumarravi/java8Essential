
public class ArrayClass {
	public static void main(String[] args) {
		//set initial size
		System.out.println("set initial size");
		int sized[] = new int[15];
		for (int i = 0; i < sized.length; i++) {
			sized[i]=i*100;
		}
		for (int i : sized) {
			System.out.println(i);
		}
		//copying an array
		System.out.println("copying an array");
		int copid[]= new int[5];
		System.arraycopy(sized, 5,copid,0,5);
		for (int i = 0; i < copid.length; i++) {
		System.out.println(copid[i]);	
		}
	}
}
