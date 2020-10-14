package com.miqdadyyy.abstractFactory.factories;

import com.miqdadyyy.abstractFactory.constants.FactoryConstants;

/**
 * This class will create role-based factories based on roles
 * provided as input - Developer, Tester, Architect, DevOps.
 *
 * */
public class FactoryProducer {

    public static AbstractFactory getFactory(String role){
        if(null == role || role.equals("")){
            System.out.println("Valid role is needed to provide Factory class.");
            return null;
        }

        switch (role.toLowerCase()){
            case FactoryConstants.ARCHITECT:
                return new ArchitectsFactory();
            case FactoryConstants.DEVELOPER:
                return new DevelopersFactory();
            case FactoryConstants.DEVOPS:
                return new DevOpsFactory();
            case FactoryConstants.TESTER:
                return new TestersFactory();
            default:
                System.out.println("User provide invalid role.");
        }
        return null;
    }
}
