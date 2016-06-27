package innerclasses;

//Creating an inner class directly using the .new syntax.
public class DotNew {
	public class Inner {
		public Inner() {
			System.out.println("Ginkee");
		}
	}

	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
	}
} // /:~
