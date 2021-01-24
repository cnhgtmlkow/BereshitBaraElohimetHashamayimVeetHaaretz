package edu.ib;

import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import static edu.ib.FXGraph.*;

public class Controller {
    @FXML
    private LineChart<?, ?> graph;

    @FXML
    private NumberAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    private LineChart<?, ?> graph1;

    @FXML
    private NumberAxis xAxis1;

    @FXML
    private NumberAxis yAxis1;
    @FXML
    void initialize() {
        System.out.println("plany planiki motywy motywiki");
        //graph.getData().clear();
        double y = 0;
        XYChart.Series series = new XYChart.Series();
        XYChart.Series series2 = new XYChart.Series();
        for(int i = 0; i<czas.size(); i++ ){

            series.getData().add(new XYChart.Data(czas.get(i),polozenie.get(i)));
            //series2.getData().add(new XYChart.Data(czas.get(i),szybkosc.get(i)));
            series2.getData().add(new XYChart.Data(polozenie.get(i),szybkosc.get(i)));

        }
        graph1.getData().add(series2);
        graph.getData().add(series);


    }
}
