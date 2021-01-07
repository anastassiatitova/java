package domain;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise1407 extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setPrefSize(260, 260);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				TextField t = new TextField();
				t.setText((int)(Math.random() * 2) + "");
				t.setAlignment(Pos.CENTER);
				pane.add(t, j, i);
			}
		}
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise 1407");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
