package com.javahouse.demo.devops.entities;

public class Book
{
    private int id;
    private String title;
    private String publisher;
    private double cost;

    public Book(int id, String title, String publisher, double cost) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", cost=" + cost +
                '}';
    }
}
