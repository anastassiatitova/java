
package domain;

import java.util.Arrays;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Exercise1412 extends Application {
	final static String s1 = "Apple";
	final static String s2 = "HTC";
	final static String s3 = "Samsung";
	final static String s4 = "Others";

	@Override
	public void start(Stage primaryStage) {
		CategoryAxis xAxis = new CategoryAxis();
		NumberAxis yAxis = new NumberAxis();
		BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

		XYChart.Series series1 = new XYChart.Series();
		series1.getData().add(new XYChart.Data<>(s1, 20));
		XYChart.Series series2 = new XYChart.Series();
		series2.getData().add(new XYChart.Data<>(s2, 26));
		XYChart.Series series3 = new XYChart.Series();
		series3.getData().add(new XYChart.Data<>(s3, 28));
		XYChart.Series series4 = new XYChart.Series();
		series4.getData().add(new XYChart.Data<>(s4, 26));

		barChart.getData().addAll(series1, series2, series3, series4);
		Pane pane = new Pane();
		pane.getChildren().add(barChart);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise 1412");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
