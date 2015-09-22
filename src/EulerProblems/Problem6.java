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
public class Problem6 extends Problem {
    
    public void execute() {
        int sumOfTheSquares = 0, squareOfTheSum = 0, difference = 0;
        long startTime = System.nanoTime();
        
        for (int i = 1; i <= 100; i++) {
            sumOfTheSquares += i * i;
            squareOfTheSum += i;
        }
        
        squareOfTheSum *= squareOfTheSum;
        
        difference = squareOfTheSum - sumOfTheSquares;
                
        long endTime = System.nanoTime();
        System.out.println("The diffrence is " + difference);
        System.out.println("executed in " + (endTime - startTime) + " nanoseconds.\n");
    }
}
