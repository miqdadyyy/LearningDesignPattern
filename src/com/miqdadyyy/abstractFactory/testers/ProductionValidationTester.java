package com.miqdadyyy.abstractFactory.testers;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;

public class ProductionValidationTester implements EngineeringTeamMember {
    @Override
    public void getExpert() {
        System.out.println("I am a Production validation Tester!!");
    }
}
