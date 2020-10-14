package com.miqdadyyy.abstractFactory.architects;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;

public class SolutionArchitect implements EngineeringTeamMember {
    @Override
    public void getExpert() {
        System.out.println("I am a Solution Architect!!");
    }
}
