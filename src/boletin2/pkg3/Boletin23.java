/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg3;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float euros, dolares;
        Scanner obx = new Scanner(System.in);
        System.out.println("teclea cambio");
        euros= obx.nextFloat();
        System.out.println("teclea euros");
        dolares= obx.nextFloat();
        System.out.println("dolares"+dolares*euros);
    
                }
    
}
