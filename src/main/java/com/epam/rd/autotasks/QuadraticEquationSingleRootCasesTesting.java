package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();



    @Parameterized.Parameters
    public static Collection<Object[]> info()
    {
        return Arrays.asList(new Object[][]{
                {1, -10, 25, 5},
                {1, -4, 4, 2},
                {1, 14, 49, -7},
                {4, 4, 1, -0.5},
        });
    }

    private double a;
    private double b;
    private double c;
    private double expected;


    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Test
    public void testSingleRootsCase() {
        assertEquals(Double.toString(expected) , quadraticEquation.solve(a, b, c));
    }
}