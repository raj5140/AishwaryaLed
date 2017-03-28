package com.aisw.app.navigation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> menu3 = new ArrayList<String>();
        List<String> menu4 = new ArrayList<String>();

        List<String> list1 = new ArrayList<String>();
        list1.add("Submenu 1-Home");
        list1.add("Submenu 2-Location");
        list1.add("Submenu 3-Attendance");
        list1.add("Submenu 4-Others");


        List<String> list2 = new ArrayList<String>();
        list2.add("Submenu 1");
        list2.add("Submenu 2");
        list2.add("Submenu 3");
        list2.add("Submenu 4");


        expandableListDetail.put("Menu 1-Marketing", list1);
        expandableListDetail.put("Menu 2", list2);
        expandableListDetail.put("Menu 3", menu3);
        expandableListDetail.put("Menu 4", menu4);


        return expandableListDetail;
    }
}
