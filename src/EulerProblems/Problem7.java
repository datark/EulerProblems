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
public class Problem7 extends Problem {
    public void execute() {
        long primeNumberCount = 0, primeNumber = 1;
        long startTime = System.nanoTime();
        while (primeNumberCount < 10001) {
            primeNumber++;
            if (this.isPrimeNumber(primeNumber))
                primeNumberCount++;
        }
        long endTime = System.nanoTime();
        System.out.println("Largest prime number is " + primeNumber);
        System.out.println("executed in " + (endTime - startTime) + " nanoseconds.\n");
    }  
}
