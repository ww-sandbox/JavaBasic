package ex_7_polymorphism.ex_interface;

public class ShapeDrawer {
	private Shape shape;

	public ShapeDrawer(Shape shape) {
		this.shape = shape;
	}

	public void startDrawing() {
		this.shape.draw();
	}
}
