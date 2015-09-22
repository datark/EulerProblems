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
public class Problem3 extends Problem {

    @Override
    public void execute() {
        long number = 600_851_475_143L, largestPrimeFactor = 2, factor = 2;
        number = 36;
        long startTime = System.nanoTime();
        while (factor < number / largestPrimeFactor) {
            if (number % factor == 0) {
                if (this.isPrimeNumber(factor) && factor > largestPrimeFactor) {
                    largestPrimeFactor = factor;
                    System.out.println("1 The prime factor: " + factor);
                }
                if (this.isPrimeNumber(number / factor) && number / factor > largestPrimeFactor) {
                    largestPrimeFactor = number / factor;
                    System.out.println("2 The prime factor: " + number / factor);
                }
            }
            if (largestPrimeFactor > factor)
                factor = largestPrimeFactor + 1;
            else
                factor++;
        }
        long endTime = System.nanoTime();
        System.out.println(largestPrimeFactor + " is the largest prime factor of " + number);
        System.out.println("executed in " + (endTime - startTime) + " nanoseconds.\n");
    }   
}
