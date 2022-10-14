package com.sasken.Rinkun;

/*
N number of people participated in a coding marathon where they were asked to solve some problems.
Each problem carried 1 mark and at the end of the marathon,
the total marks that each person achieved was calculated. As an organizer,
you have the list of the total marks that each person achieved.
You have to calculate the sum of the marks of top K scorers from the list.
Input Specification:
input1: N,Total number of participants
input2: Top scorers
input3: An array of length N with the scores of all N participants
Output Specification:
Return S,
 sum of the marks of top K scorers from the list.

  Example 1:
  input1: 4
  input2: 2
  input3: {4, 1, 2, 5}
  Output: 9

   Explanation:
   Top 2 scores are 5 and 4. Sum = 5+4=9.

   Example 2:
   input1: 4
   input2: 3
   input3: {4, 3, 6, 1}
   Output: 13

   Explanation:
Top 3 scores are 6, 4 and 3. Sum = 6+4+3=13.
 */

public class CodMarth
{
    public static void main(String[] args) {

        int n1=4;
        int n2=2;
        int [] n3={4, 1, 2, 5};
        System.out.println(marathon(n1,n2,n3));
    }
    static int marathon(int n1,int n2,int[] n3)
    {
        int s=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                if(n3[i]>n3[j]){
                    int temp=n3[i];
                    n3[i]=n3[j];
                    n3[j]=temp;
                }
            }
        }
        for(int i=0;i<n2;i++){
            s+=n3[i];
        }
        return s;
    }
}
