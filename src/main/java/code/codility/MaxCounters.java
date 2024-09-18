package code.codility;

import java.util.Arrays;

public class MaxCounters {
    /*
    You are given N counters, initially set to 0, and you have two possible operations on them:

increase(X) − counter X is increased by 1,
max counter − all counters are set to the maximum value of any counter.
A non-empty array A of M integers is given. This array represents consecutive operations:

if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
if A[K] = N + 1 then operation K is max counter.
For example, given integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the values of the counters after each consecutive operation will be:

    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
The goal is to calculate the value of every counter after all operations.

Write a function:

class Solution { public int[] solution(int N, int[] A); }

that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.

Result array should be returned as an array of integers.

For example, given:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the function should return [3, 2, 2, 4, 2], as explained above.

Write an efficient algorithm for the following assumptions:

N and M are integers within the range [1..100,000];
each element of array A is an integer within the range [1..N + 1].
     */
    public static void main(String[] args) {
        int N=0;
        int[] A={3,2,2,4,2};
            int[] counters = new int[N]; // N adet sayaç
            int max = 0; // Şu ana kadarki maksimum sayaç değeri
            int base = 0; // max counter sonrası kullanılacak minimum taban değeri

            for (int k = 0; k < A.length; k++) {
                if (A[k] >= 1 && A[k] <= N) {
                    // Sayaç artırma işlemi
                    int index = A[k] - 1; // Diziler 0-indeksli olduğundan, 1-indeksli değeri 0-indekse çeviriyoruz

                    // Eğer sayaç base değerinden küçükse, onu base'e eşitliyoruz
                    if (counters[index] < base) {
                        counters[index] = base;
                    }

                    // Şimdi sayacı 1 artırıyoruz
                    counters[index]++;

                    // En yüksek sayaç değerini güncelliyoruz
                    if (counters[index] > max) {
                        max = counters[index];
                    }
                } else if (A[k] == N + 1) {
                    // max counter işlemi: base değerini şu anki max değere ayarlıyoruz
                    base = max;
                }
            }

            // İşlemler tamamlandıktan sonra sayaçların güncel olup olmadığını kontrol ediyoruz
            for (int i = 0; i < N; i++) {
                if (counters[i] < base) {
                    counters[i] = base;
                }
            }

            System.out.println(Arrays.toString(counters));
        }

}
