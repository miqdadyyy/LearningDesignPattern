package com.miqdadyyy.abstractFactory.factories;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;
import com.miqdadyyy.abstractFactory.constants.FactoryConstants;
import com.miqdadyyy.abstractFactory.developers.GolangDeveloper;
import com.miqdadyyy.abstractFactory.developers.JavaDeveloper;
import com.miqdadyyy.abstractFactory.developers.PythonDeveloper;

/**
 * This factory class shall create below 3 classes based on programming language.
 * JavaDeveloper, PythonDeveloper, GolangDeveloper
 * */
public class DevelopersFactory extends AbstractFactory{
    @Override
    public EngineeringTeamMember getEngineeringTeamMember(String skillset) {
        if(null == skillset || skillset.equals("")){
            System.out.println("please provide valid skillset.");
            return null;
        }

        switch (skillset.toLowerCase()){
            case FactoryConstants.JAVA:
                return new JavaDeveloper();
            case FactoryConstants.PYTHON:
                return new PythonDeveloper();
            case FactoryConstants.GOLANG:
                return new GolangDeveloper();
            default:
                System.out.println("User provided invalid Developer skillset.");
        }
        return null;
    }
}
