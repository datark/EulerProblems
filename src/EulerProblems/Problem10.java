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
public class Problem10 extends Problem {
    public void execute() {
        long startTime = System.nanoTime();
        long sum = 0, i;
        for (i = 2; i < 2000000; i++)
            if (this.isPrimeNumber(i))
                sum += i;
        long endTime = System.nanoTime();
        System.out.println("The product is " + sum);
        System.out.println("executed in " + (endTime - startTime) + " nanoseconds.\n");        
    }
}
