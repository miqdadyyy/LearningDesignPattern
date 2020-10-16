package com.miqdadyyy.abstractFactory;

import com.miqdadyyy.abstractFactory.constants.FactoryConstants;
import com.miqdadyyy.abstractFactory.factories.AbstractFactory;
import com.miqdadyyy.abstractFactory.factories.FactoryProducer;

public class Demo {

    public static void start() {

        //Step-1 : Get all Factories.
        AbstractFactory developersFactory = FactoryProducer.getFactory(FactoryConstants.DEVELOPER);
        AbstractFactory architectsFactory = FactoryProducer.getFactory(FactoryConstants.ARCHITECT);
        AbstractFactory testersFactory = FactoryProducer.getFactory(FactoryConstants.TESTER);
        AbstractFactory devOpsFactory = FactoryProducer.getFactory(FactoryConstants.DEVOPS);

        //Step-2 : Get all developer classes based on developersFactory retrieved above.
        if(null != developersFactory){
            EngineeringTeamMember javaDeveloper = developersFactory.getEngineeringTeamMember(FactoryConstants.JAVA);
            if(null != javaDeveloper){
                javaDeveloper.getExpert();
            }

            EngineeringTeamMember pythonDeveloper = developersFactory.getEngineeringTeamMember(FactoryConstants.PYTHON);
            if(null != pythonDeveloper){
                pythonDeveloper.getExpert();
            }

            EngineeringTeamMember golangDeveloper = developersFactory.getEngineeringTeamMember(FactoryConstants.GOLANG);
            if(null != golangDeveloper){
                golangDeveloper.getExpert();
            }
        }

        //Step-3 : Get all architect classes based on architectsFactory retrieved above.
        if(null != architectsFactory){
            EngineeringTeamMember solutionArchitect = architectsFactory.getEngineeringTeamMember(FactoryConstants.SOLUTION_ARCHITECT);
            if(null != solutionArchitect){
                solutionArchitect.getExpert();
            }

            EngineeringTeamMember technicalArchitect = architectsFactory.getEngineeringTeamMember(FactoryConstants.TECHNICAL_ARCHITECT);
            if(null != technicalArchitect){
                technicalArchitect.getExpert();
            }
        }

        //Step-4 : Get all Testers classes based on testersFactory retrieved above.
        if(null != testersFactory){
            EngineeringTeamMember systemIntegrationTester = testersFactory.getEngineeringTeamMember(FactoryConstants.SYSTEM_INTEGRATION_TESTER);
            if(null != systemIntegrationTester){
                systemIntegrationTester.getExpert();
            }

            EngineeringTeamMember productionValidationTester = testersFactory.getEngineeringTeamMember(FactoryConstants.PRODUCTION_VALIDATION_TESTER);
            if(null != productionValidationTester){
                productionValidationTester.getExpert();
            }

            EngineeringTeamMember userAcceptanceTester = testersFactory.getEngineeringTeamMember(FactoryConstants.USER_ACCEPTANCE_TESTER);
            if(null != userAcceptanceTester){
                userAcceptanceTester.getExpert();
            }
        }

        //Step-5 : Get all DevOps classes based on devOpsFactory retrieved above.
        if(null != devOpsFactory){
            EngineeringTeamMember ansibleExpert = devOpsFactory.getEngineeringTeamMember(FactoryConstants.ANSIBLE);
            if(null != ansibleExpert){
                ansibleExpert.getExpert();
            }

            EngineeringTeamMember chefExpert = devOpsFactory.getEngineeringTeamMember(FactoryConstants.CHEF);
            if(null != chefExpert){
                chefExpert.getExpert();
            }

            EngineeringTeamMember puppetExpert = devOpsFactory.getEngineeringTeamMember(FactoryConstants.PUPPET);
            if(null != puppetExpert){
                puppetExpert.getExpert();
            }
        }

    }
}
