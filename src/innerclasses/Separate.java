package innerclasses;

public class Separate {
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		Outer2.Inner inner = outer.new Inner();
	}
}

class Outer2{
	class Inner{
		
	}
}

