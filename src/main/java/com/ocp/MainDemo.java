package com.ocp;

import java.util.HashMap;
import java.util.Map;

public class MainDemo {

    public static final void main(String[] args) {
        System.out.println("Hi there with final");
        HashMap productMap = new HashMap();

        Map<String, String> map = getMap();

        //Throwable



 /*cp dir newDir

                rm -R dir

            java ->1.8



// store
        customers who havent paid bill in the current month

                customer - id, name, bill id, payment date, due
                                                             current
                                                                     due
                        payment
                                id amount_due


                                        payment.id = customer.id
                                        where amount_due >0 */





    }

    private static Map<String, String> getMap() {

        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("Key1", "Value1");
        sampleMap.put("Key2", "Value1");
        sampleMap.put("Key3", "#%$#$%");
        return sampleMap;
    }


}
