package com.miqdadyyy.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class will provide list of Cricketers only.
 * */
public class CriteriaCricket implements Criteria{

    @Override
    public List<SportsPerson> meetCriteria(List<SportsPerson> sportsPersons) {
        List<SportsPerson> cricketers = sportsPersons.stream().filter(sp -> sp.getSport().equalsIgnoreCase(FilterPatternConstants.CRICKET)).collect(Collectors.toList());
        return cricketers;
    }
}
