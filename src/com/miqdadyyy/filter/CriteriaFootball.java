package com.miqdadyyy.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class will provide list of Footballers only.
 * */
public class CriteriaFootball implements Criteria{

    @Override
    public List<SportsPerson> meetCriteria(List<SportsPerson> sportsPersons) {
        List<SportsPerson> footballers = sportsPersons.stream().filter(fb -> fb.getSport().equalsIgnoreCase(FilterPatternConstants.FOOTBALL)).collect(Collectors.toList());
        return footballers;
    }
}
