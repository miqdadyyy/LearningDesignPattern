package com.miqdadyyy.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class will provide list of Tennis Players only.
 * */
public class CriteriaTennis implements Criteria{

    @Override
    public List<SportsPerson> meetCriteria(List<SportsPerson> sportsPersons) {
        List<SportsPerson> tennisPlayers = sportsPersons.stream().filter(tp -> tp.getSport().equalsIgnoreCase(FilterPatternConstants.TENNIS)).collect(Collectors.toList());
        return tennisPlayers;
    }
}
