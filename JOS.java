package com.sasken.Rinkun;

/*jim is excited because he has just been delivered a new computer but he has a dilemma. it seems that the operation system 
scheduling works a little differently compared to what he has been before.he finds that he cannot force the computer to switch
 tasks and tasks that were given to the computer earlier are being executed after tasks that were submitted at later time. 
 He now has the task of figuring out the time at which a batch of tasks will be completed given their submit times and runtime 
 duration. note: if 2 tasks are submitted at the same time , the one encountered earlier in the input array is executed first.
input1: N number of tasks
input2:an array of N elements. each element contains: of i th task.
input3:an array of N elements.each elements contains :of i th task.
output: the function should return the final end time of the last task to be executed.

example 1:
input1:1
input2:{0}
input3:{4}
output:4

example2:
input1:5
input2:{0,3,9,2,6}
input3:{3,4,2,9,6}
output:24
*/

public class JOS {
	public static void main(String[] args) {
	    int input1=5;
	    int[] input2= {0,3,9,2,6};
	    int[] input3= {3,4,2,9,6};
	    System.out.println(totalTime(input1, input2, input3));
	}
	public static int totalTime(int input1,int[] input2,int[] input3) {
	    int min,count=0;
	    min=input2[0];
	    for(int i=0;i<input1;i++) {
	        if(input2[i]==0) {
	            count ++;
	            break;
	        }else {
	            if(input2[i]<min) {
	                min=input2[i];
	            }
	        }
	    }
	    int sum=0;
	    for(int i=0;i<input1;i++) {
	        sum=sum+input3[i];
	    }
	    if(count==0) {
	        return sum+min;
	    }else {
	    return sum;    
	    }
	}
}
