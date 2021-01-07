package domain;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise1406 extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				Rectangle r = new Rectangle(25, 25);
				if ((i + j) % 2 == 0) {
					r.setFill(Color.WHITE);
				} else {
					r.setFill(Color.BLACK);
				}
				pane.add(r, j-1, i-1);
			}
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exerceise 1404");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
