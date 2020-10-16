package com.miqdadyyy.abstractFactory.testers;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;

public class SystemIntegrationTester implements EngineeringTeamMember {
    @Override
    public void getExpert() {
        System.out.println("I am a System Integration Tester!!");
    }
}
