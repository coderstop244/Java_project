package com.company;

public class Rectangle {
    private int length;
    private int width;

    public void setLength(int l){
        this.length=l;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int k){
        this.width=k;
    }
    public int getWidth(){
        return width;

    }
    public static void main(String[] args) {
        Rectangle sc=new Rectangle();
        sc.setLength(15);
        System.out.println(sc.getLength());
        sc.setWidth(14);
        System.out.println(sc.getWidth());
        
        
    }

}
