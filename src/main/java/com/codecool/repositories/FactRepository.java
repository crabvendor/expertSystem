package com.codecool.repositories;

import com.codecool.model.*;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class FactRepository {

    private List<Fact> facts = new ArrayList<>();

    private class FactIterator implements Iterator<Fact> {
        
        int index;

        @Override
        public boolean hasNext() {
            return index < facts.size();
        }

        @Override
        public Fact next() {
            return facts.get(index++);
        }

        @Override
        public void remove() {}
    }

    public void addFact(Fact fact) {
        facts.add(fact);
    }
    
    public Iterator<Fact> getIterator() {
        return new FactIterator();
    }
}
