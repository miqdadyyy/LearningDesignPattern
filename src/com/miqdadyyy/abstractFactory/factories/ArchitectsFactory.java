package com.miqdadyyy.abstractFactory.factories;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;
import com.miqdadyyy.abstractFactory.architects.SolutionArchitect;
import com.miqdadyyy.abstractFactory.architects.TechnicalArchitect;
import com.miqdadyyy.abstractFactory.constants.FactoryConstants;

/**
 * This factory class shall create below 2 classes based on architect skills.
 * TechnicalArchitect, SolutionArchitect
 * */
public class ArchitectsFactory extends AbstractFactory{
    @Override
    public EngineeringTeamMember getEngineeringTeamMember(String skillset) {
        if(null == skillset || skillset.equals("")){
            System.out.println("please provide valid skillset.");
            return null;
        }
        switch (skillset.toLowerCase()){
            case FactoryConstants.TECHNICAL_ARCHITECT:
                return new TechnicalArchitect();
            case FactoryConstants.SOLUTION_ARCHITECT:
                return new SolutionArchitect();
            default:
                System.out.println("User provided invalid architect skillset.");
        }
        return null;
    }
}
