package domain;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.beans.property.*;

public class BindingDemo extends Application {

	@Override
	public void start(Stage primaryStage) {
		DoubleProperty d1 = new SimpleDoubleProperty(1);
		DoubleProperty d2 = new SimpleDoubleProperty(2);
		d1.bindBidirectional(d2);
		System.out.println("d1 is  " + d1.getValue() + " and d2 is " + d2.getValue());
		d2.setValue(70.2);
		d1.setValue(10);
		System.out.println("d1 is  " + d1.getValue() + " and d2 is " + d2.getValue());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
