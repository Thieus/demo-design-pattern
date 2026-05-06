package com.mla.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private String news;
    private List<Observer> channels = new ArrayList<>();

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        channels.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        channels.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : channels) {
            observer.update(this.news);
        }
    }
}
