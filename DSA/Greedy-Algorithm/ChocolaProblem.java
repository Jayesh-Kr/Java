

import java.util.Arrays;
import java.util.Collections;


public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        Integer costVer[] = {1};
        Integer costHori[] = {6,10};

        Arrays.sort(costHori, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int h = 0;
        int v = 0;
        int hp = 1;
        int vp = 1;
        int cost = 0;

        while (h < costHori.length && v < costVer.length) {
            if (costHori[h] <= costVer[v]) {
                // vertical cut
                cost += (hp * costVer[v]);
                v++;
                vp++;
            } else {
                // horizontal cut
                cost += (vp * costHori[h]);
                h++;
                hp++;
            }
        }

        while (h < costHori.length) {
            cost += (vp * costHori[h]);
            h++;
            hp++;
        }

        while (v < costVer.length) {
            cost += (hp * costVer[v]);
            v++;
            vp++;
        }


        System.out.println("Min cost of cut : " + cost);
    }
}
