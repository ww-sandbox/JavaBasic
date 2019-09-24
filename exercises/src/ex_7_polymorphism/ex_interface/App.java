package ex_7_polymorphism.ex_interface;

public class App {
	public static void main(String[] args) {
		ShapeDrawer[] drawers = new ShapeDrawer[2];
		drawers[0] = new ShapeDrawer(new Circle());
		drawers[1] = new ShapeDrawer(new Square());

		for (ShapeDrawer drawer : drawers) {
			drawer.startDrawing();
		}
	}
}
