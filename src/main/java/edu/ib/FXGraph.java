package edu.ib;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;

import java.io.IOException;
import java.util.ArrayList;

public class FXGraph extends Application {
public static ArrayList<Double> czas = new ArrayList<Double>();
public static ArrayList<Double> polozenie = new ArrayList<Double>();
public static ArrayList<Double> szybkosc = new ArrayList<Double>();
    public static void main(String[] args) {

        double h = 0.1;
        Oscilator oscilator = new Oscilator(5);
        FirstOrderIntegrator euler = new EulerIntegrator(h);
        FirstOrderIntegrator rk4Integrator = new ClassicalRungeKuttaIntegrator(h);
        rk4Integrator.addStepHandler(new ConsoleStepper());
        double [] x0 = {1, 0};
        double [] x = {0, 0};
        rk4Integrator.integrate(oscilator, 0, x0, 10*Math.PI,x);
        //euler.integrate(oscilator,0,x0,Math.PI/2,x);
        System.out.println(x[0]+" "+x[1]);
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/graph.fxml"));
        Scene scene = new Scene(root,800,500);
        stage.setScene(scene);
        stage.show();





    }
}
