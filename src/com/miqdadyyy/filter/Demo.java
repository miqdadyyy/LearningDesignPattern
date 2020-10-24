package com.miqdadyyy.filter;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void start(){

        List<SportsPerson> famousSportPersons = new ArrayList<>();

        //Indian Sportspersons
        famousSportPersons.add(new SportsPerson("Sachin Tendulkar", FilterPatternConstants.INDIA, FilterPatternConstants.CRICKET));
        famousSportPersons.add(new SportsPerson("Sania Mirza", FilterPatternConstants.INDIA, FilterPatternConstants.TENNIS));
        famousSportPersons.add(new SportsPerson("Bhaichung Bhutia", FilterPatternConstants.INDIA, FilterPatternConstants.FOOTBALL));

        //US Sportspersons
        famousSportPersons.add(new SportsPerson("Pete Sampras", FilterPatternConstants.US, FilterPatternConstants.TENNIS));
        famousSportPersons.add(new SportsPerson("Serena Williams", FilterPatternConstants.US, FilterPatternConstants.TENNIS));

        //England Sportspersons
        famousSportPersons.add(new SportsPerson("David Beckham", FilterPatternConstants.ENGLAND, FilterPatternConstants.FOOTBALL));
        famousSportPersons.add(new SportsPerson("Andy Murray", FilterPatternConstants.ENGLAND, FilterPatternConstants.TENNIS));
        famousSportPersons.add(new SportsPerson("Ian Botham", FilterPatternConstants.ENGLAND, FilterPatternConstants.CRICKET));

        Criteria cricket = new CriteriaCricket();
        Criteria football = new CriteriaFootball();
        Criteria tennis = new CriteriaTennis();
        Criteria countryIndia = new CriteriaIndia();
        Criteria countryEngland = new CriteriaEngland();
        Criteria countryUS = new CriteriaUS();

        //AND criteria
        Criteria cricketersFromIndia = new AndCriteria(cricket, countryIndia);
        Criteria footballersFromIndia = new AndCriteria(football, countryIndia);
        Criteria tennisPlayersFromIndia = new AndCriteria(tennis, countryIndia);

        Criteria cricketersFromEngland = new AndCriteria(cricket, countryEngland);
        Criteria footballersFromEngland = new AndCriteria(football, countryEngland);
        Criteria tennisPlayersFromEngland = new AndCriteria(tennis, countryEngland);

        Criteria cricketersFromUS = new AndCriteria(cricket, countryUS);
        Criteria footballersFromUS = new AndCriteria(football, countryUS);
        Criteria tennisPlayersFromUS = new AndCriteria(tennis, countryUS);

        //OR criteria
        /**
         * FirstCriteria is US, second criteria is Tennis.
         * This criteria should add players from US first and then all Tennis players
         * (irrespective of the country)
         * */
        Criteria countryUS_OR_TennisPlayers = new OrCriteria(countryUS, tennis);


        System.out.println("Famous Cricketers from the list :: ");
        printSportsPersons(cricket.meetCriteria(famousSportPersons));

        System.out.println("\nFamous Footballers from the list :: ");
        printSportsPersons(football.meetCriteria(famousSportPersons));

        System.out.println("\nFamous Tennis players from the list :: ");
        printSportsPersons(tennis.meetCriteria(famousSportPersons));

        System.out.println("\nFamous Indian Cricketers from the list ::");
        printSportsPersons(cricketersFromIndia.meetCriteria(famousSportPersons));

        System.out.println("\nFamous Indian Footballers from the list ::");
        printSportsPersons(footballersFromIndia.meetCriteria(famousSportPersons));

        System.out.println("\nFamous Indian Tennis Players from the list :: ");
        printSportsPersons(tennisPlayersFromIndia.meetCriteria(famousSportPersons));

        System.out.println("\nFamous England Cricketers from the list :: ");
        printSportsPersons(cricketersFromEngland.meetCriteria(famousSportPersons));

        System.out.println("\nFamous England Footballers from the list ::");
        printSportsPersons(footballersFromEngland.meetCriteria(famousSportPersons));

        System.out.println("\nFamous England Tennis Players from the list :: ");
        printSportsPersons(tennisPlayersFromEngland.meetCriteria(famousSportPersons));

        System.out.println("\nFamous US Cricketers from the list :: ");
        printSportsPersons(cricketersFromUS.meetCriteria(famousSportPersons));

        System.out.println("\nFamous US Footballers from the list :: ");
        printSportsPersons(footballersFromUS.meetCriteria(famousSportPersons));

        System.out.println("\nFamous US Tennis players from the list :: ");
        printSportsPersons(tennisPlayersFromUS.meetCriteria(famousSportPersons));

        System.out.println("\nFamous Players from US as well as All Tennis players from the list :: ");
        printSportsPersons(countryUS_OR_TennisPlayers.meetCriteria(famousSportPersons));
    }


    public static void printSportsPersons(List<SportsPerson> sportsPersons) {

        if (null == sportsPersons || sportsPersons.isEmpty()) {
            System.out.println("Sorry....no match found for this criteria!!");
        } else {
            for (SportsPerson player : sportsPersons) {
                System.out.println("Person : [ Name : " + player.getName() + ", Country : " + player.getCountry()
                        + ", Sport : " + player.getSport() + " ]");
            }
        }

    }

}
