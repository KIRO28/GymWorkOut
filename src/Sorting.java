
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
class Sorting {

    public static ArrayList sort(ArrayList<String> Allprice) {

        // swapping and selection sort      
        
        for (int i = 0; i < Allprice.size(); i++) {
            int minipotition = i;

            for (int j = i; j < Allprice.size(); j++) {
                if (Integer.parseInt(Allprice.get(j)) < Integer.parseInt(Allprice.get(minipotition))) {
                    minipotition = j;

                }

            }

            int temp = (Integer.parseInt(Allprice.get(minipotition)));
            String value = Integer.toString(temp);
            Allprice.set(minipotition, Allprice.get(i));
            Allprice.set(i, value);

        }
        return (Allprice);

    }

}
