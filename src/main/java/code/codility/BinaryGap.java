package code.codility;
/*
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].
*/
public class BinaryGap {
    public static void main(String[] args) {

                int N=529  ;
                // Binary temsili oluşturma
                String binaryRepresentation = "";
                for (int n = N; n > 0; n /= 2) { // /= bölümünü tekrar n' e atar
                    int remainder = n % 2;
                    binaryRepresentation = remainder + binaryRepresentation;
                }

                // Binary temsili üzerinde gap'leri bulma
                int currentGap = 0;
                int maxGap = 0;
                boolean inGap = false;

                for (int i = 0; i < binaryRepresentation.length(); i++) {
                    char c = binaryRepresentation.charAt(i);

                    if (c == '1') {
                        // Eğer 1 bulunursa, mevcut gap uzunluğunu kontrol et
                        if (inGap) {
                            if (currentGap > maxGap) {
                                maxGap = currentGap;
                            }
                            currentGap = 0; // Yeni gap için sıfırla
                        }
                        inGap = true; // Artık gap içinde olduğumuzu belirt
                    } else if (c == '0' && inGap) {
                        // Eğer gap içindeysek ve 0 bulursak gap uzunluğunu artır
                        currentGap++;
                    }
                }
                System.out.println(maxGap);

                // En uzun binary gap'i döndür

            }

        }


        //-----------------------------------

/*
class Solution {
    public int solution(int N) {
       String binaryNumber="";
        int maxGap=0;
        int currentGap=0;

        for(int i=N; i>0; i/=2){
            int kalan=i%2;
            binaryNumber=kalan+binaryNumber;
        }

        for(int k=0; k<binaryNumber.length(); k++){

            char charK = binaryNumber.charAt(k);

            if(charK=='1'){
                if(currentGap>maxGap){
                    maxGap=currentGap;
                }
                currentGap=0;

            }else if(charK=='0'){
                currentGap++;
            }

        }return maxGap;
    }
}
 */