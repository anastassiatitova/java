package domain;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise1401 extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setHgap(15);
		pane.setVgap(15);
		
		ImageView img1 = new ImageView(new Image("cat.jpg"));
		pane.add(img1, 0, 0);
		ImageView img2 = new ImageView(new Image("cat.jpg"));
		pane.add(img2, 1, 0);
		ImageView img3 = new ImageView(new Image("cat.jpg"));
		pane.add(img3, 0, 1 );
		ImageView img4 = new ImageView(new Image("cat.jpg"));
		pane.add(img4, 1, 1);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14-01");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
