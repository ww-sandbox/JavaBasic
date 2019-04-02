package ex_7_polymorphism;

public class ShapeDrawer {
	private Shape shape;

	public ShapeDrawer(Shape shape) {
		this.shape = shape;
	}

	public void startDrawing() {
		this.shape.draw();
	}
}
