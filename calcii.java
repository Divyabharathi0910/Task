package intern;

public class calcii {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int multi(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		if(b==0) {
			System.out.println("cant divide by zero.");
			return a;
		}
			return a/b;
	}
}



