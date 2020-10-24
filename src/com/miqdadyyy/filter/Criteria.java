package com.miqdadyyy.filter;

import java.util.List;

/**
 * This interface provides method to extract {@link java.util.List<SportsPerson>}
 * based on various criteria.
 * */
public interface Criteria {

    public List<SportsPerson> meetCriteria(List<SportsPerson> sportsPersons);

}
