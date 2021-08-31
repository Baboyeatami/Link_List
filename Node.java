/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Jamie Eduardo Rosal <Jamiewertalmighty@gmail.com>
 */
public class Node {

    public Node(String Name, int Age, String course, String Email) {
        this.Name = Name;
        this.Age = Age;
        this.course = course;
        this.Email = Email;

    }

    String Name;
    int Age;
    String course;
    String Email;

    Node Next;
    Node Previous;

}
