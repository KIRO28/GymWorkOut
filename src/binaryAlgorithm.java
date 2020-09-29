
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class binaryAlgorithm {
    public static int value (ArrayList<String> sortedList, String priceSelected){
    

    // binar search algorithm.
                int li = 0;
                int hi = sortedList.size() - 1;
                int mi = (li + hi) / 2;
                int mainValue = Integer.parseInt(priceSelected);

                while (li <= hi) {
                    if (sortedList.get(mi).equals(priceSelected)) {
                            return mi;
                    } else if (Integer.parseInt(sortedList.get(mi)) < mainValue) {
                        li = mi + 1;
                    } else {
                        hi = mi - 1;
                    }
                    mi = (li + hi) / 2;
                }
               return 0;
        }
        
      
}
