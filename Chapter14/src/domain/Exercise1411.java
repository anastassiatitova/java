
package domain;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise1411 extends Application {

	@Override
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		pane.setAlignment(Pos.CENTER);
		Group group = new Group();
		Ellipse el1 = new Ellipse(70, 50, 30, 20);
		el1.setStroke(Color.BLACK);
		el1.setFill(null);
		Ellipse el2 = new Ellipse(160, 50, 30, 20);
		el2.setStroke(Color.BLACK);
		el2.setFill(null);
		Circle c1 = new Circle(70, 50, 15);
		c1.setFill(Color.BLACK);
		Circle c2 = new Circle(160, 50, 15);
		c2.setFill(Color.BLACK);
		Line l1 = new Line(115, 70, 150, 120);
		Line l2 = new Line(80, 120, 150, 120);
		Arc arc = new Arc(115, 130, 60, 30, 180, 180);
		arc.setStroke(Color.BLACK);
		arc.setFill(null);
		arc.setType(ArcType.OPEN);
		Circle c = new Circle(120);
		c.setStroke(Color.BLACK);
		c.setFill(null);
		group.getChildren().addAll(el1, el2, c1, c2, l1, l2, arc);
		pane.getChildren().add(group);
		pane.getChildren().add(c);

		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise 1411");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
