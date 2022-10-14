package com.sasken.Rinkun;

/*There is an F1 race going on and there is just one pit crew (Return maximum number of racers that can be serviced, 
 setting up just one pit crew.)
  There is an F1 race going on and there is just one pit crew for a team. There are X racers. There is a position matrix, 
 which contains the current position of each of these X racers and the end point, till which point the fuel will get over. 
 Pit crew team can put their pit location to just one place. What is the maximum number of racers the pit crew team can attend to?
Example 1:
Input: 4, {{1,3},{2,5},{2,4},{3,5}}
Output: 3

Example 2:
Input: 5, {{1,7},{2,4},{6,9},{3,8},{5,10}}
Output: 4
*/

public class Race {
    public static void main(String[] args) {
        int input1=4;
        int[][]input2= {{1,3},{2,5},{2,4},{3,5}};
        System.out.println(race(input1, input2));
    }
    static int race(int input1,int[][] input2) {
        int hash[]=new int[100001];
        for(int j=0;j<input1;j++) {
            hash[input2[j][0]]++;
            hash[input2[j][1]]--;
        }
        int count=0;
        int tmp=0;
        for(int j=0;j<=100000;j++) {
            tmp+=hash[j];
            if(count<tmp)
                count=tmp;
        }
        return count;
    }
}
