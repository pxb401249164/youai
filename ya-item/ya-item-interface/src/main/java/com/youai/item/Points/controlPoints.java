package com.youai.item.Points;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 面试的一个问题
 * @date 2019/11/25-17:11
 */
public class controlPoints {
    public static void main(String[] args) {
        String a = "[" +
                "{ lng: 110.258489,lat: 19.666209,controlPoints: null}, " +
                "{lng: 110.302955,lat: 19.749328,controlPoints: [{lng: 110.33222,lat: 19.692905}]}, " +
                "{lng: 110.204255,lat: 19.779106,controlPoints: [{lng: 110.263218, lat: 19.788125}]}, " +
                "{lng: 110.107615,lat: 19.805002,controlPoints: [{lng: 110.164518,lat: 19.810467}]}" +
                "]";

        List list = myUtil(a);
        System.out.println("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("[");
            Object obj = list.get(i);
            String[] arr = (String[]) obj;
            if (arr.length > 3) {
                for (int j = 2; j < arr.length; j++) {
                    System.out.print(arr[j] + ",");
                }
                for (int j = 0; j < arr.length - 2; j++) {
                    if (j == arr.length - 3) {
                        System.out.print(arr[j]);
                    } else {
                        System.out.print(arr[j] + ",");
                    }
                }
            } else {
                for (int j = 0; j < arr.length; j++) {
                    if (j == arr.length - 1) {
                        System.out.print(arr[j]);
                    } else {
                        System.out.print(arr[j] + ",");
                    }
                }
            }
            if (i == (list.size() - 1)) {
                System.out.print("]");
            } else {
                System.out.print("],");
            }
            System.out.println();

        }
        System.out.println("]");
    }

    public static List myUtil(String a) {
        Matcher matcher = Pattern.compile("[\\[\\]{}\\s]").matcher(a.replace
                ("},", "|"));
        String string = matcher.replaceAll("");
        String[] split = string.split("\\|");
        ArrayList list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            String ss = split[i].replace("controlPoints", "").replace("null",
                    "").replace("lng", "").replace("lat", "").replace
                    (":", "");
            list.add(ss.split(","));
        }
        return list;
    }

}


