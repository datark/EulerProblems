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
public class Problem9 extends Problem {
    public void execute() {
        long startTime = System.nanoTime();
        int a = 1,b = 1,c = 1;
        boolean search = true;
        for (a = 1; a < 999 && search; a++)
            for (b = 1; b < 999 && search; b++)
                for (c = 1; c < 999 && search; c++)
                    if (a+b+c == 1000 && a*a + b*b == c*c)
                        search = false;
        
        long endTime = System.nanoTime();
        System.out.println("The product is " + (--a)*(--b)*(--c));
        System.out.println("executed in " + (endTime - startTime) + " nanoseconds.\n");
    }
}
