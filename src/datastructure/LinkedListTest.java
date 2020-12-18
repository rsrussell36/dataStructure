/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class LinkedListTest {
    public void operation()
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Abu Sayed Russell");
        ll.add("Masud");
        ll.add(1, "Alomgir");

        System.out.println("Initial LinkedList " + ll);

        ll.set(1, "Sumon");

        System.out.println("Updated LinkedList " + ll);
    }
}
