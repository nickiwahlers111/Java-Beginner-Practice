package com.company;

public class Linked_List extends Generic_List{
    protected node head;

    public Linked_List(){
        head = null;
    }

    @Override
   public void Build_List() {
        if(head == null){
            head = new node();
            head.set_person();
        }
        node current = head;
        node temp = new node();
        temp.set_next(current.get_next());
        current.set_next(temp);
}

