package domain;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise1402 extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10, 30, 10, 30));
		pane.setVgap(5);
		pane.setHgap(5);

		Image x = new Image("x.png");
		Image o = new Image("o.jpg");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int status = (int) (Math.random() * 3);
				if (status == 0) {
					ImageView img1 = new ImageView(o);
					pane.add(img1, j, i);
				}
				if (status == 1) {
					ImageView img2 = new ImageView(x);
					pane.add(img2, j, i);
				}
			}
		}

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14-02");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
