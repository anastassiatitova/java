package domain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

	@Override
	public void start(Stage primaryStage) {
	StackPane pane = new StackPane(new Button("OK"));
	Scene scene = new Scene(pane,  200, 50);
	primaryStage.setTitle("Button in a pane");
	primaryStage.setScene(scene);
	primaryStage.show();
	}

	
	
}
