package com.example.assignment1draft1;

import com.example.assignment1draft1.ADT.LinkList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {
    private LinkList trueList;

    @BeforeEach
    void setUp(){ trueList = new LinkList(); }

    @Test
    void listRange() {
            trueList.addElement(1);
            assertEquals(1,trueList.listRange());
        }


    @Test
    void addElement() {
        trueList.addElement(2);
        trueList.addElement(3);
        trueList.addElement(4);
        assertEquals(3, trueList.listRange());


    }

    @Test
    void removeElement() {
        trueList.addElement(1);
        trueList.addElement(2);
        trueList.addElement(3);
        trueList.addElement(4);
        trueList.removeElement(0);
        assertEquals(3, trueList.listRange());

    }


    @Test
    void isEmpty() {
        trueList.addElement(true);
        assertEquals(true, trueList.isEmpty());
    }

    @Test
    void searchElement() {
    }



    @Test
    void gethead() {
        trueList.addElement(1);
        trueList.addElement(2);
        assertEquals(2, trueList.gethead());
    }
    }
