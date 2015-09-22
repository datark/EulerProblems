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
public class Problem {
    public void execute() {
    }
    
    public boolean isPrimeNumber(long number) {
        long factor = 2;
        while (factor <= number / factor) {
            if (number % factor == 0) {
                return false;
            }
            factor++;
        }
        return true;
    } 
}
