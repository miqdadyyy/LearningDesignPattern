package com.miqdadyyy.filter;

import java.util.List;

/**
 * Either one of criteria's must matched to provide a filtered list of Sportspersons.
 * */
public class OrCriteria implements Criteria{

    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public OrCriteria(Criteria fCriteria, Criteria sCriteria){
        this.firstCriteria = fCriteria;
        this.secondCriteria = sCriteria;
    }

    @Override
    public List<SportsPerson> meetCriteria(List<SportsPerson> sportsPersons) {
        List<SportsPerson> firstCriteriaFilteredList = firstCriteria.meetCriteria(sportsPersons);
        List<SportsPerson> secondCriteriaFilteredList = secondCriteria.meetCriteria(sportsPersons);

        for(SportsPerson sp : secondCriteriaFilteredList){
            if(!firstCriteriaFilteredList.contains(sp)){
                firstCriteriaFilteredList.add(sp);
            }
        }

        return firstCriteriaFilteredList;
    }
}
