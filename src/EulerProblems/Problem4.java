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
public class Problem4 extends Problem {
  
    @Override
    public void execute() {
        int largestPalindrom = 0;
        long startTime = System.nanoTime();
        for (int a = 999; a > 0; a--) {
            for (int b = a; b > 0; b--) {
                String product = Integer.toString(a*b);
                String reversedProduct = new StringBuffer(product).reverse().toString();
                if (product.equals(reversedProduct) && largestPalindrom < a*b) {
                    largestPalindrom = a*b;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Largest palindrom is " + largestPalindrom);
        System.out.println("executed in " + (endTime - startTime) + " nanoseconds.\n");
    }
}
