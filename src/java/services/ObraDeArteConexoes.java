/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author bruno
 */
public class ObraDeArteConexoes {
    public  static void main(String[] args){
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("obras");
    }
}
