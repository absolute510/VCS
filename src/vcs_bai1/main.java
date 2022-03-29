/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vcs_bai1;

import java.util.Scanner;

/**
 *
 * @author Absolute
 */
public class main {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("nhap kich thuoc ban co vua: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][];
        a = new int[n][n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.println("nhap vao vi tri ton tai quan xe:");
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            if(checkline(a, n, i)==1) count+=2;
        }
        for(j=0;j<n;j++){
            if(checkrow(a, n, j)==1) count+=2;
        }
        System.out.println(count);
    }
    
    public static int checkline(int a[][],int n, int i){
        int j;
        int count = 0;
        for(j=0;j<n;j++){
            if(a[i][j]==1){
                count ++;
            }
        }
        if(count >1) return 1;
        return 0;
    }
    
    public static int checkrow(int a[][],int n, int j){
        int i;
        int count = 0;
        for(i=0;i<n;i++){
            if(a[i][j]==1) count++;
        }
        if(count>1) return 1;
        return 0;
    }
}
