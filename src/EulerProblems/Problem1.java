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
public class Problem1 extends Problem {
    
    @Override
    public void execute() {
        int sum = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++)
           if (i % 3 == 0 || i % 5 == 0)
                   sum += i;
        long endTime = System.nanoTime();
        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is " + sum);
        System.out.println("executed in " + (endTime - startTime) + " nanoseconds.\n");
    }
}
