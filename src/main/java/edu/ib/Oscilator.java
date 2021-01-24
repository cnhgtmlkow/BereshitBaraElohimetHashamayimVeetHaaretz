package edu.ib;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;

public class Oscilator implements FirstOrderDifferentialEquations {
    private double mi;

    public Oscilator(double mi) {
        this.mi = mi;
    }

    @Override
    public int getDimension() {
        return 2;
    }

    @Override
    public void computeDerivatives(double t, double[] x, double[] xDot) throws MaxCountExceededException, DimensionMismatchException {
        //xDot[0] = x[0];
        xDot[0] = x[1];
        xDot[1] = mi*(1-Math.pow(x[0],2))*x[1]-x[0];
        //System.out.println(x[0]);
    }
}

