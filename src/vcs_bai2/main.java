/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vcs_bai2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Absolute
 */
public class main {
    public static void main(String[] args) {
        int n,i,j,k;
        int count;
        int a[];
        a = new int[1000];
        int b[];
        b= new int[100];
        System.out.println("nhap so phan tu cua mang:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 0;i<n;i++){
            System.out.println("nhap phan tu thu"+i);
            a[i]=sc.nextInt();
        }
        
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (i = 0; i < n; i++) {
            addElement(map, a[i]);
        }
        
        for (i=0;i<n;i++) {
            for(Integer key : map.keySet()){
                b[i]=map.get(key);
            }
        }
        System.out.println("nhap k: ");
        k=sc.nextInt();
        for (Integer key : map.keySet()) {
            if(k==map.get(key)) System.out.println(key);
        }
    }

    private static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }
    
}
