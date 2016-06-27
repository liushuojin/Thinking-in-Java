package innerclasses;

public class DisplayObject {
	private String text;
	
	public DisplayObject(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return text;
	}
	
	public static void main(String[] args) {
		DisplayObject[] displayObjects = new DisplayObject[]{
			new DisplayObject("liu"),
			new DisplayObject("shuo"),
			new DisplayObject("jin")
		};
		for (int i = 0; i < displayObjects.length; i++) {
			System.out.println(displayObjects[i]);
		}
	}
}
