import java.io.ObjectInputStream.GetField;


public class Outer {
	class Inner{
		private String text;
		
		public Inner(String text) {
			// TODO Auto-generated constructor stub
			this.text = text;
		}
		
		public void print(){
			System.out.println(text);
		}
	}
	
	public Inner getInner(String text){
		return new Inner(text);
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.getInner("Ginkee");
		inner.print();
	}
}
