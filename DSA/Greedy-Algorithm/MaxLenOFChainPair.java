import java.util.Arrays;
import java.util.Comparator;

public class MaxLenOFChainPair {
    public static void main(String[] args) {
        int chain[][] = {{5,24}, {36,60}, {5,28}, {27,40}, {50,90}};

        Arrays.sort(chain, Comparator.comparingDouble(o -> o[1]));

        int longestChain = 1;
        int lastElem = chain[0][0];
        
        for(int i = 1; i < chain.length; i++) {
            if(lastElem < chain[i][0]) {
                longestChain++;
                lastElem = chain[i][1];
            }
        }
        System.out.println("Longest chain : " + longestChain);
    }
}
