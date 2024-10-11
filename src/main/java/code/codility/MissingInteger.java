package code.codility;

public class MissingInteger {
    /*
    This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
     */
    public static void main(String[] args) {
       int [] A = {4,5,6,1,1,2,3};
                // Implement your solution here
                int N = A.length;
                boolean[] present = new boolean[N+1];

                for(int i=0; i<N; i++){

                    if(A[i]>0 && A[i]<=N){
                        present[A[i]]=true;

                    }
                }

                for(int k=1; k<=N; k++){
                    if(!present[k]){
                        System.out.println(k);
                    }
                }

        System.out.println(N+1);

            }
        }


