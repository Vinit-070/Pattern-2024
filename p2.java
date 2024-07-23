// Print the following pattern

/*
        * 
        * * 
        * * * 
        * * * * 

*/ 

import java.util.*;

class p2{
    public static void main(String args[]){
        int row,col, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        n = sc.nextInt();
        for( row=1; row<=n; row++)
{
    // for every row, run the col
    for( col=1; col<=row; col++)
    {
         System.out.print("* ");
    }
    // for every row printed, we need to add new line
        System.out.println();
}

    }
}