package domain;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise1415 extends Application {

	@Override
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		Text text = new Text("STOP");
		text.setFill(Color.WHITE);
		text.setFont(Font.font("Arial", 48));
		pane.getChildren().add(new MyPolygon());
		pane.getChildren().add(text);

		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Exercise 1415");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

class MyPolygon extends Pane {

	private void paint() {
		Polygon poly = new Polygon();
		poly.setFill(Color.RED);
		poly.setStroke(Color.RED);
		ObservableList<Double> list = poly.getPoints();

		double centerX = getWidth() / 2;
		double centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;

		for (int i = 0; i < 6; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
		}
		getChildren().clear();
		getChildren().add(poly);
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
