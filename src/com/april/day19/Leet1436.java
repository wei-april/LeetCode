package com.april.day19;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author april
 * @date 2023-11-16
 * @description
 */
public class Leet1436 {

    public static void main(String[] args) {

    }

    public String destCity(List<List<String>> paths) {

        Set<String> ret = new HashSet<>();
        paths.forEach(l1 -> ret.add(l1.get(0)));
        for (List<String> path : paths) {
            if (!ret.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}
