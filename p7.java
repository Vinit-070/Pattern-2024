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

class p7{
    public static void main(String args[]){
        int i,j, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        n = sc.nextInt();
        for(i=1;i<=2*n-1;i++)
        {
            int tc = i > n ? 2*n-i : i;
            for(j=1;j<=tc;j++)
            {
                System.out.print(j+" ");
            }
        System.out.print('\n');
        }
    }
}
