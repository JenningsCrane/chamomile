package ru.jenningc.chamomile.utils;

public enum IdGenerator {
    INSTANCE;

    private int id = 0;

    public int generateId() {
        return ++id;
    }
}
