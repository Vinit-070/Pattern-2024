// Print N times '*' in a single row

/*
    Output:

    Enter N : 5
    
    *****

*/ 

import java.util.*;

class p1{
    public static void main(String args[]){
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.print('*');
        }
        System.out.print('\n');
    }
}


