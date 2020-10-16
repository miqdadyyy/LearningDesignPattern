package com.miqdadyyy.abstractFactory.developers;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;

public class JavaDeveloper implements EngineeringTeamMember {
    @Override
    public void getExpert() {
        System.out.println("I am a Java Developer!!");
    }
}
