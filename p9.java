/* // Print the following pattern i.e. n = 5

    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1

*/

import java.util.*;

class p9 {
  public static void main(String args[]) {
    int i, j, n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N : ");
    n = sc.nextInt();
    for(i=0;i<2*n;i++)
    {
    int tc = i > n ? 2*n-i : i;
    int spaces = n - tc;
    for(int k=0;k<spaces;k++)
    {
    System.out.print(" ");
    }
    for(j=1;j<=tc;j++)
    {
    System.out.print(j+" ");
    }
    System.out.print('\n');
    }

    
  }
}
