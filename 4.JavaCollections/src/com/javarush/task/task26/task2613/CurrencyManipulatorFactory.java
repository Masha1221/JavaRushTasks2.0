package com.javarush.task.task26.task2613;

import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CurrencyManipulatorFactory {

    private static Map<String, CurrencyManipulator> map = new HashMap<>();


    private CurrencyManipulatorFactory() {

    }


    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {

        currencyCode = currencyCode.toUpperCase();
        if (!map.containsKey(currencyCode)) {
            CurrencyManipulator currencyManipulator = new CurrencyManipulator(currencyCode);
            map.put(currencyManipulator.getCurrencyCode(), currencyManipulator);
        }
        return map.get(currencyCode);
    }

    public static Collection <CurrencyManipulator> getAllCurrencyManipulators(){

        return map.values();//create a collection of the map
    }


    }
