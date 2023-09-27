package com.example.assignment1draft1.ADT;

import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

public class LinkList<D>  {
    public LinkNode<D> head = null; //Custom link list


    public int listRange()
    {
        LinkNode temp = head; //copy made of head
        int counter = 0;
        while (temp != null) //while there is one or more node after the head
        {
            counter++; //counter will add up how many nodes are in list
            temp = temp.next;
        }
        return counter;
    }

    public String addElement(D e) {     //adding elements of custom LinkList
        LinkNode<D> newNode = new LinkNode<>();
        newNode.setContents(e);
        newNode.next = head;
        head = newNode; //element is added to head/top of the list

        return null;
    }

    public void removeElement(int index) { //removing element from list
        index = listRange() - index -1;
        if (index == 0){
            head = head.next; //removing first  element in list
        }else{
            LinkNode current = head;
            for (int i = 0; i < index -1;i++){
                current = current.next;
            }
            current.next = current.next.next;
        }

    }
    public void deleteWholeList(){
        head = null; //if head equals null it destroys the list
    }
public boolean isEmpty(){
        if(listRange() <= 0){
            return false;
        }
        else{
            return true;
        }
}

    public void addContentstoListView(ListView lv){ //method adds contents to list view
        LinkNode<D> temp=head;
        while(temp != null){
            lv.getItems().add(temp.getContents());
            temp=temp.next;
        }
    }
    public D gethead(){
        return head.getContents();
    }

public LinkNode<D> getHeadNode(){
        return head;
}
    public void addContentstoComboBox(ComboBox cb){ //adds  contents to combo box
        LinkNode<D> temp=head;
        while(temp != null){
            cb.getItems().add(temp.getContents());
            temp=temp.next;
        }
    }

}
