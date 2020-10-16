package com.miqdadyyy.abstractFactory.factories;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;
import com.miqdadyyy.abstractFactory.constants.FactoryConstants;
import com.miqdadyyy.abstractFactory.devOps.AnsibleExpert;
import com.miqdadyyy.abstractFactory.devOps.ChefExpert;
import com.miqdadyyy.abstractFactory.devOps.PuppetExpert;

/**
 * This factory class shall create below 3 classes based on DevOps skills.
 * AnsibleExpert, ChefExpert, PuppetExpert
 * */
public class DevOpsFactory extends AbstractFactory{
    @Override
    public EngineeringTeamMember getEngineeringTeamMember(String skillset) {
        if(null == skillset || skillset.equals("")){
            System.out.println("please provide valid skillset.");
            return null;
        }

        switch (skillset.toLowerCase()){
            case FactoryConstants.ANSIBLE:
                return new AnsibleExpert();
            case FactoryConstants.CHEF:
                return new ChefExpert();
            case FactoryConstants.PUPPET:
                return new PuppetExpert();
            default:
                System.out.println("User provided invalid DevOps skillset.");
        }
        return null;
    }
}
