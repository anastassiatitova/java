package domain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise1410 extends Application {

	@Override
	public void start(Stage primaryStage) {
//		StackPane pane = new StackPane();
//		pane.setPadding(new Insets(25, 25, 25, 25));
//		pane.setAlignment(Pos.CENTER);
//		Group group = new Group();
//		Arc a1 = new Arc(70, 40, 60, 30, 0, 180);
//		a1.setFill(null);
//		a1.setStroke(Color.BLACK);
//		group.getChildren().add(a1);
//		Arc a2 = new Arc(70, 40, 60, 30, 0, -180);
//		a2.setFill(null);
//		a2.setStroke(Color.BLACK);
//		group.getChildren().add(a2);
//		Arc a3 = new Arc(70, 200, 60, 30, 0, 180);
//		a3.setFill(null);
//		a3.setStroke(Color.BLACK);
//		a3.getStrokeDashArray().addAll(6.0, 21.0);
//		group.getChildren().add(a3);
//		Arc a4 = new Arc(70, 200, 60, 30, 0, -180);
//		a4.setFill(null);
//		a4.setStroke(Color.BLACK);
//		group.getChildren().add(a4);
//		Line l1 = new Line(10, 45, 10, 205);
//		group.getChildren().add(l1);
//		Line l2 = new Line(130, 45, 130, 205);
//		group.getChildren().add(l2);
//				
//		pane.getChildren().add(group);
		Scene scene = new Scene(new MyCylinder(), 200, 200);
		primaryStage.setTitle("Exercise 1410");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

class MyCylinder extends Pane {
	public void paint() {
		double centerX = getWidth() / 2;
		double centerY = getHeight() / 4;
		double radiusX = getWidth() * .08 / 2;
		double radiusY = getHeight() * .08 / 4;

		Ellipse ellipse = new Ellipse(centerX, centerY, radiusX, radiusY);
		ellipse.setFill(Color.WHITE);
		ellipse.setStroke(Color.BLACK);

		Arc arc1 = new Arc(centerX, centerY * 2, radiusX, radiusY, 0, 180);
		arc1.setFill(Color.WHITE);
		arc1.setStroke(Color.BLACK);
		arc1.getStrokeDashArray().addAll(6.0, 21.0);

		Arc arc2 = new Arc(centerX, centerY * 2, radiusX, radiusY, 180, 180);
		arc2.setFill(Color.WHITE);
		arc2.setStroke(Color.BLACK);

		getChildren().clear();
		getChildren().addAll(ellipse, arc1, arc2, new Line(centerX - radiusX, centerY, centerX - radiusX, centerY * 2),
				new Line(centerX + radiusX, centerY, centerX + radiusX, centerY * 2));
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