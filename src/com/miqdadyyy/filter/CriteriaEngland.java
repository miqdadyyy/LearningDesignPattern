package com.miqdadyyy.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class will provide list of players from England.
 * */
public class CriteriaEngland implements Criteria{

    @Override
    public List<SportsPerson> meetCriteria(List<SportsPerson> sportsPersons) {
        List<SportsPerson> playersFromEngland = sportsPersons.stream().filter(pl -> pl.getCountry().equalsIgnoreCase(FilterPatternConstants.ENGLAND)).collect(Collectors.toList());
        return playersFromEngland;
    }
}
