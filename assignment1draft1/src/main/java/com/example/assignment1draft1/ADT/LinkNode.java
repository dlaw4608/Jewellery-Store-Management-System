package com.example.assignment1draft1.ADT;

public class LinkNode<N> {
    public LinkNode<N> next=null;
   // public int count = 0;
    public N contents; //ADT reference!
    public N getContents() { return contents; }
    public void setContents(N c) { contents=c; }
}
