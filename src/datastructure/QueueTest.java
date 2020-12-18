/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

import java.util.*;

/**
 *
 * @author User
 */
class QueueTest{
    public void operation(){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Abu");
        queue.add("Sayed");
        queue.add("Russell");
        queue.add("Masud");
        queue.add("Alomgir");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}  