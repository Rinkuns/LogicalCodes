package com.sasken.Rinkun;
/*There's a soldier named Abraham trapped in a CIRCLE OF DEATH,
now to get out of the circle, he comes up with a strategy to get out of the circle.
He kills every second enemy soldier in the circle, starting with the soldier standing in front of him.
Like, 1,3,5, and so on in the first go.
Then in the second go he'll be facing soldier 2 initially from where he'll go on killing
like soldier 2,4,6,8, and so on until only 1 soldier is left.

Now the strongest enemy soldier is Daryl, we need to figure out,
how many soldiers should stand between Abraham and Daryl, so that Abraham gets exhausted as much as possible before
facing Daryl (clockwise direction).

Given total number of soldiers initially.
   Test Input 1: 3
   Output: 1
   Explanation: The 1st and 3rd soldier will be killed in the first round. Hence, Daryl will be on the 2nd position 
   with 1 person between him and Abraham.

   Test Input 2: 4
   Output: 3
   Explanation: The 1st and 3rd soldier will be killed in the first round. In the 2nd round, only the soldier 
   standing at position 2 will be dead. Therefore, 3 soldiers must stand between them.
*/
public class Abraham {
   public static void main(String[] args) {
    
        int input1=8;
        int res=numberOfSolider(input1);
                System.out.println(res);
    }
    public static int numberOfSolider(int input1) {
        double a;
        double c=0;
        while(input1/2>=1) {
            c=c+1;
            input1=input1/2;
        }
        if(input1==2) {
            a=(2*Math.pow(2, c)-1);
        }
        else {
            a=(Math.pow(2, c)-1);
        }
        int value=(int)a;
        return value;
    }
}