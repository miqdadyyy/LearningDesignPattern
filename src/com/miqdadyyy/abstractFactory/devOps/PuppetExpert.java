package com.miqdadyyy.abstractFactory.devOps;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;

public class PuppetExpert implements EngineeringTeamMember {
    @Override
    public void getExpert() {
        System.out.println("I am a Puppet expert!!");
    }
}
