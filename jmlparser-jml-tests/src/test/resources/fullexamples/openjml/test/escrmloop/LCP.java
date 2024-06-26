//package q2_2012;

/**
 * Contains an implementation for the Longest Common Prefix algorithm.
 * <em>FM 2012 Verification Competition, Problem 1 (part a).</em><br>
 * Longest Common Prefix (LCP) is an algorithm used for text querying. In
 * the following, we model text as an integer array. <ul>
 * <li> Input:  an integer array a, and two indices x and y into this array
 * <li> Output: length of the longest common prefix of the subarrays of a
 * starting at x and y respectively.</ul>
 *
 * @author bruns, woj
 */
final class LCP {


    /*@ normal_behavior
      @ requires 0 <= x && x < a.length;
      @ requires 0 <= y && y < a.length;
      @ requires x != y;

      @ ensures 0 <= \result;
      @ ensures \result <= a.length-x && \result <= a.length-y;
      @ ensures (\forall int i; x <= i && i < x+\result; a[i] == a[y+i-x] );
      @ ensures \result == a.length-x || \result == a.length-y || a[x+\result] != a[y+\result];

      @ pure @*/
    static int lcp(int[] a, int x, int y) {
        int l = 0;
       /*@ loop_modifies l; 
         @ maintaining 0 <= l && l+x <= a.length && l+y <= a.length && x!=y;
         @ maintaining (\forall int z; x <= z && z < x+l; a[z] == a[y+z-x] );
         @ decreasing a.length-l;          
         @*/
        while (x + l < a.length && y + l < a.length && a[x + l] == a[y + l])
            l++;

        return l;
    }
}

