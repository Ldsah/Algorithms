import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class VariousTerms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentDifference = in.nextInt();
        List<Integer> terms = new ArrayList<>();
        for (int i = 1; i <= currentDifference; i++) {
            if (currentDifference - i != i) {
                if (currentDifference == i) {
                    terms.add(i);
                } else {
                    if (!terms.contains(currentDifference - i)) {
                        currentDifference = currentDifference - i;
                        terms.add(i);
                    }
                }
            }
        }
        System.out.println(terms.size());
        for (Integer term : terms) {
            System.out.print(term + " ");
        }


    }

}
