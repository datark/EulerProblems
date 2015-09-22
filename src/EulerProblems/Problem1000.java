/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProblems;

/**
 *
 * @author ext_datark
 */
public class Problem1000 extends Problem {
    public void execute() {
        for (long i = 9223372036854775807L; i > 0; i--)
        if (this.isPrimeNumber(i))
                System.out.println("Prime number: " + i);
    }
    public boolean isPrimeNumber(long number) {
        long factor = 2;
        while (factor <= number / factor) {
            // System.out.println(factor);
            if (number % factor == 0) {
                return false;
            }
            factor++;
        }
        return true;
    } 
}
