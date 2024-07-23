// Print the following pattern

/*

    * * * * * 
    * * * * 
    * * * 
    * * 
    * 

*/ 


import java.util.*;

class p4{
    public static void main(String args[]){
        int i,j, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }
        System.out.print('\n');
        }
    }
}
