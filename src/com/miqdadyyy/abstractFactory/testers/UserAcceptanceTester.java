package com.miqdadyyy.abstractFactory.testers;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;

public class UserAcceptanceTester implements EngineeringTeamMember {
    @Override
    public void getExpert() {
        System.out.println("I am a User acceptance Tester!!");
    }
}
