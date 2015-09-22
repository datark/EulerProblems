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
public class Problem2 extends Problem {
    
    @Override
    public void execute() {
        int sum = 0, a = 1, b = 2;
        long startTime = System.nanoTime();
        while (b < 4000000) {
            if (b % 2 == 0) 
                sum += b;
            b += a;
            a = b - a;
        }
        long endTime = System.nanoTime();
        System.out.println("The sum of the even-valued terms below four million is " + sum);
        System.out.println("executed in " + (endTime - startTime) + " nanoseconds.\n");
    }    
}
