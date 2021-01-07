package domain;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Exercise1413 extends Application {

	@Override
	public void start(Stage primaryStage) {
		ObservableList<PieChart.Data> pieChart = FXCollections.observableArrayList(
				new PieChart.Data("Apple--20%", 20),
				new PieChart.Data("HTC--26%", 26),
				new PieChart.Data("Samsung--28%", 28),
				new PieChart.Data("Others--26%", 26));
		PieChart chart = new PieChart(pieChart);
		StackPane pane = new StackPane();
		pane.getChildren().add(chart);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise 1413");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
