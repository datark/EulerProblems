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
public class Problem5 extends Problem {
    
    @Override
    public void execute() {
        int smallestPositive = 0;
        boolean found = false;
        long startTime = System.nanoTime();
        
        while (!found) {
            found = true;
            smallestPositive += 20;
            for (int i = 2; i <= 20 && found; i++)
                found = (smallestPositive % i == 0);
        }        
        long endTime = System.nanoTime();
        System.out.println("The smallest positive number is " + smallestPositive);
        System.out.println("executed in " + (endTime - startTime) + " nanoseconds.\n");
    }
}
