package domain;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise1409 extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setVgap(10);
		pane.setHgap(10);
		pane.setAlignment(Pos.CENTER);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				Circle c = new Circle(60);
				c.setStroke(Color.BLACK);
				c.setFill(null);
				int x = 30;
				Group group = new Group();
				for (int k = 0; k < 4; k++) {
					Arc a = new Arc(c.getCenterX(), c.getCenterY(), 50, 50, x, 35 );
					a.setType(ArcType.ROUND);
					group.getChildren().add(a);
					x += 90;
				}
				group.getChildren().add(c);			
				pane.add(group, j, i);
			}
		}
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise 1409");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
