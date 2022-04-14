package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();


    @Parameterized.Parameters
    public static Collection<Object[]> info()
    {
        return Arrays.asList(new Object[][]{
                {-2, 7, -6, "2.0 1.5"},
                {1, -7, 10, "2.0 5.0"},
                {1, 7, 10, "-5.0 -2.0"},
                {1, -3, 0, "0.0 3.0"}
        });
    }

    private double a;
    private double b;
    private double c;
    private String expected;


    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;

    }

    @Test
    public void testSingleRootsCase() {
        if (a == 0 | quadraticEquation.solve(a, b, c).equals("no roots")) {assertEquals(expected , quadraticEquation.solve(a, b, c));}
        double[] result =  parseRoots(quadraticEquation.solve(a, b, c));
        expected = parseRoots(expected)[0] + " " + parseRoots(expected)[1];
        assertEquals(expected , result[0] + " " + result[1]);
        //assertEquals(expected , quadraticEquation.solve(a, b, c));
    }

    private double[] parseRoots(final String input) {
        String[] inputTokens = input.split(" ");
        if (inputTokens.length > 1){
        double[] roots = {Double.parseDouble(inputTokens[0]), Double.parseDouble(inputTokens[1])};
        if (roots[0] > roots[1]) {
            roots = new double[]{roots[1], roots[0]};
        }
        return roots;}
        else {
            double[] roots = {Double.parseDouble(inputTokens[0]), Double.parseDouble(inputTokens[0])};

            return roots;
        }


    }

}
