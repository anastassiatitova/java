package application;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnonymousHandlerSDemo extends Application {

	@Override
	public void start(Stage primaryStage) {
		Text text = new Text(40, 40, "Programming is Fun");
		Pane pane = new Pane(text);
		
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		HBox hBox = new HBox(btDown, btLeft, btRight, btUp);
		hBox.setSpacing(10);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
