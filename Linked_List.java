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
public class Linked_List {

    Node First_link;

    public Linked_List() {
    }

    void Insert(String Name, int Age, String course, String Email) {
        Node newLink = new Node(Name, Age, course, Email);
        newLink.Next = First_link;
        First_link = newLink;

    }

    void display() {
        Node theLink = First_link;

        while (theLink.Next != null) {
            System.out.println(theLink.Name + " " + theLink.course + " " + theLink.Age + " " + theLink.Email);
            theLink = theLink.Next;
        }

    }

    void Find() {
    }

    void Delete() {
    }
;

}
