/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamee;

/**
 *
 * @author Aca
 */
public class Gamee {

    public static void main(String[] args) {
        //Buat Objek player
        Player hero = new Player();
        Player enemy = new Player();
        
        //mengisi atribut player
        hero.name = "shafa" ;
        hero.speed = 83 ;
        hero.damage = 65 ;
        hero.armor = 76 ;
        hero.healthPoin = 0;
        
        enemy.name = "aluna";
        enemy.speed = 7;
        enemy.damage = 76;
        enemy.armor = 23;
        enemy.healthPoin = 98;
        
        //menjalankan method
        hero.run();
        hero.attack(enemy.name);
        hero.defend();
    }
}
