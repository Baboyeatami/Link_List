/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javafx.scene.effect.DisplacementMap;

/**
 *
 * @author Jamie Eduardo Rosal <Jamiewertalmighty@gmail.com>
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Linked_List A = new Linked_List();
        A.Insert("jamie", 0, "BSCpE", "Email Jamie");
        A.Insert("Nikko", 90, "BSCpE", "Email Nikko");
        A.Insert("Kaycee", 0, "BSCpE", "Email kaycee");
        A.Insert("Crister", 0, "BSCpE", "Email Crister");
        A.Insert("Lozenz", 0, "BSCpE", "Email lozens");

        A.display();

    }

}
