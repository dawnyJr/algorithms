package com.pascal;

/**
 * PascalTriangle formula implementation
 * 
 * @author Sabiq Ihab
 *
 */
public class PascalTriangle {
  /**
   * 
   * @param n
   *          triangle row number
   * @param k
   *          triangle column number
   * @return
   */
  public int pascal(int n, int k) {
    if (n < 0 || n < k) {
      throw new IllegalArgumentException("Such input cannot be calculated !");
    } else if (k == 0 || n == k) {
      return 1;
    } else {
      return pascal(n - 1, k) + pascal(n - 1, k - 1);
    }
  }

}
