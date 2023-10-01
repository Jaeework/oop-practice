package org.example.restaurant;

// 요리사 객체
public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        Cook cook = new Cook(menuItem);

        return cook;
    }
}
