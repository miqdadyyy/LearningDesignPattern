package com.miqdadyyy.abstractFactory.architects;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;

public class TechnicalArchitect implements EngineeringTeamMember {
    @Override
    public void getExpert() {
        System.out.println("I am a Technical Architect!!");
    }
}
