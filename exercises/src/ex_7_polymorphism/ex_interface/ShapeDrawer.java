package ex_7_polymorphism.ex_interface;

class ShapeDrawer {
	private Shape shape;

	ShapeDrawer(Shape shape) {
		this.shape = shape;
	}

	void startDrawing() {
		this.shape.draw();
	}
}
