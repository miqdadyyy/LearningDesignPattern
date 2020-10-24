package com.miqdadyyy.filter;

import java.util.List;

/**
 * Both criteria's must be matched to provide a filtered list of Sportspersons.
 * */
public class AndCriteria implements Criteria{

    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria fCriteria, Criteria sCriteria){
        this.firstCriteria = fCriteria;
        this.secondCriteria = sCriteria;
    }

    @Override
    public List<SportsPerson> meetCriteria(List<SportsPerson> sportsPersons) {
        List<SportsPerson> firstCriteriaFilteredList = firstCriteria.meetCriteria(sportsPersons);
        return secondCriteria.meetCriteria(firstCriteriaFilteredList);
    }
}
