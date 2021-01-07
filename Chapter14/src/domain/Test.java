package domain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Test extends Application {

	@Override
	public void start(Stage primaryStage) {
		FlowPane pane = new FlowPane();
		Arc arc = new Arc(70, 70, 50, 50, 0, 180);
		arc.setType(ArcType.OPEN);
		arc.setFill(null);
		arc.setStroke(Color.BLACK);
		Arc arc1 = new Arc(150, 150, 50, 50, 180, 180);
		arc1.setType(ArcType.ROUND);
		arc1.setFill(Color.RED);
		arc1.setStroke(Color.BLACK);

		Polygon poly = new Polygon(20, 40, 30, 50, 40, 90, 90, 10, 10, 30);
		poly.setFill(Color.GREEN);
		Polygon poly1 = new Polygon(20, 40, 30, 50, 40, 90, 90, 10, 10, 30);

		pane.getChildren().add(arc);
		pane.getChildren().add(arc1);
		pane.getChildren().add(poly);
		pane.getChildren().add(poly1);

		Scene scene = new Scene(pane, 200, 300);
		primaryStage.setTitle("Test");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
