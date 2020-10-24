package com.miqdadyyy.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class will provide list of players from India.
 * */
public class CriteriaIndia implements Criteria{

    @Override
    public List<SportsPerson> meetCriteria(List<SportsPerson> sportsPersons) {
        List<SportsPerson> playersFromIndia = sportsPersons.stream().filter(pl -> pl.getCountry().equalsIgnoreCase(FilterPatternConstants.INDIA)).collect(Collectors.toList());
        return playersFromIndia;
    }
}
