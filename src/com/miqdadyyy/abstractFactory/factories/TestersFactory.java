package com.miqdadyyy.abstractFactory.factories;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;
import com.miqdadyyy.abstractFactory.constants.FactoryConstants;
import com.miqdadyyy.abstractFactory.testers.ProductionValidationTester;
import com.miqdadyyy.abstractFactory.testers.SystemIntegrationTester;
import com.miqdadyyy.abstractFactory.testers.UserAcceptanceTester;

/**
 * This factory class shall create below 3 classes based on Testing skills.
 * SystemIntegrationTester, ProductionValidationTester, UserAcceptanceTester
 * */
public class TestersFactory extends AbstractFactory{
    @Override
    public EngineeringTeamMember getEngineeringTeamMember(String skillset) {
        if(null == skillset || skillset.equals("")){
            System.out.println("please provide valid skillset.");
            return null;
        }

        switch (skillset.toLowerCase()){
            case FactoryConstants.SYSTEM_INTEGRATION_TESTER:
                return new SystemIntegrationTester();
            case FactoryConstants.PRODUCTION_VALIDATION_TESTER:
                return new ProductionValidationTester();
            case FactoryConstants.USER_ACCEPTANCE_TESTER:
                return new UserAcceptanceTester();
            default:
                System.out.println("User provided invalid Tester skillset.");
        }
        return null;
    }
}
