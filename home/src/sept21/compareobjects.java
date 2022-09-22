package sept21;

class a{
	int n;
}


public class compareobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Long a = new Long(5677);
		Double b =new Double(5677);
		System.out.println(a.equals(b));
*/		a A = new a();
		A.n=10;
		a B = new a();
		B.n=10;
		System.out.println(A.equals(B));
		
	}

}
