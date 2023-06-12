/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

import java.util.ArrayList;

public abstract class Bag {
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    private String color;
    private int numberOfContents;
    private int capacity;
    private ArrayList<String> contents;




    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */

    /**
     * Create a new Bag object.
     * This constructor takes String and int as arguments.
     * @param color color of the Bag instance
     * @param capacity capacity of the Bag instance
     */
    public Bag(String color, int capacity){
        this.color = color;
        this.capacity = capacity;
        this.contents = new ArrayList<>();
        this.numberOfContents = 0;

    }




    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */

    /**
     * Get a color of Bag object.
     *
     * @return a color of this Bag object
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Get the number of contents of Bag object.
     *
     * @return the number of contents of this Bag object
     */
    public int getNumberOfContents(){
        return this.numberOfContents;
    }

    /**
     * Get a capacity of Bag object.
     *
     * @return a capacity of this Bag object
     */
    public int getCapacity(){
        return this.capacity;
    }





    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */

    /**
     * Set a new color of this Bag object.
     * @param newColor a new color of this Bag object
     */
    public void setColor(String newColor){
        this.color = newColor;
    }





    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */

    /**
     * Add a new item to this Bag object.
     * @param newItem a new item to add in this Bag object
     * @return whether the new item is successfully added.
     */
    public boolean addItem(String newItem){
        if (this.getNumberOfContents() < this.getCapacity()){
            this.contents.add(newItem);
            this.numberOfContents += 1;
            return true;
        } else{
            return false;
        }
    }





    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     * @return the last item in this Bag object. Null if the Bag is empty.
     */
    public String popItem(){
        if (this.getNumberOfContents() > 0){
            String lastItem = this.contents.get(this.numberOfContents - 1);
            this.contents.remove(this.numberOfContents - 1);
            this.numberOfContents -= 1;
            return lastItem;
        } else{
            return null;
        }

    }






    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        // TODO: Implement this method.
        this.capacity = this.capacity + n;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return string representation of this Bag object
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}