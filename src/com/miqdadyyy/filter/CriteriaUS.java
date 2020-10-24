package com.miqdadyyy.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class will provide list of players from United States.
 * */
public class CriteriaUS implements Criteria{

    @Override
    public List<SportsPerson> meetCriteria(List<SportsPerson> sportsPersons) {
        List<SportsPerson> playersFromUS = sportsPersons.stream().filter(pl -> pl.getCountry().equalsIgnoreCase(FilterPatternConstants.US)).collect(Collectors.toList());
        return playersFromUS;
    }
}
