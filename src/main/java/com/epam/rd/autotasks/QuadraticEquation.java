package com.epam.rd.autotasks;

import java.util.Locale;

public class QuadraticEquation {


    public String solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }

            double sqrtD = b * b - 4 * a * c;
            //ax ^ 2 +- bx + c
            if (sqrtD < 0) {
                return "no roots";
            } else
                if (sqrtD >= 0) {

                sqrtD = Math.sqrt(sqrtD);
                double x1 = (-b - sqrtD) / (2 * a);
                double x2 = (-b + sqrtD) / (2 * a);

                if (sqrtD == 0) {
                    return Double.toString(x1);
                }

                else {
                    if (x1 == x2) {return Double.toString(x1);}
                    return x1 + " " + x2;
                }

            }


        return "no roots";
    }
}