package domain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise1414 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new MyRectangle(), 250, 250);
		primaryStage.setTitle("Exercise 1410");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
class MyRectangle extends Pane {
	public void paint() {
		double side = 0;
		double x = 50;
		double y = 20;
			if (getWidth() < getHeight()) {
				side = getWidth() * .6;
			} else {
				side = getHeight() * .6;
			}
			Rectangle r1 = new Rectangle(x, y, side, side);
			r1.setFill(null);
			r1.setStroke(Color.BLACK);
			Rectangle r2 = new Rectangle(y, x, side, side);
			r2.setFill(null);
			r2.setStroke(Color.BLACK);
			Line l1 = new Line(y, x, x, y);
			Line l2 = new Line(y, x + side , x, y  + side);
			Line l3 = new Line(y + side, x, x + side, y);
			Line l4 = new Line(y + side, x + side , x + side, y  + side);
			getChildren().clear();
			getChildren().addAll(r1, r2, l1, l2, l3, l4);
		}

		@Override
		public void setWidth(double width) {
			super.setWidth(width);
			paint();
		}

		@Override
		public void setHeight(double height) {
			super.setHeight(height);
			paint();
		}
	}