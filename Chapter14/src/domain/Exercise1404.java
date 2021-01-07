package domain;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise1404 extends Application {

	@Override
	public void start(Stage primaryStage) {
		HBox pane = new HBox();
		pane.setPadding(new Insets(25, 10, 25, 10));
		
		for (int i = 0; i < 5; i++) {
			Text text = new Text("JavaFX");
			text.setRotate(90);
			text.setFill(Color.color(Math.random(), Math.random(), Math.random()));
			text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
			pane.getChildren().add(text);
		}
		Scene scene = new Scene(pane, 500, 100);
		primaryStage.setTitle("Exercise1404");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
