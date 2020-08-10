package com.company;

public class node extends Person{
    protected node next;

    public node(){
        next = null;
    }
    public void set_next(node to_set){
        next = to_set;
    }

    public node get_next(){
        return next;
    }
}
