package com.miqdadyyy.abstractFactory.factories;

import com.miqdadyyy.abstractFactory.EngineeringTeamMember;

/**
 * This is super-factory or factory of factories.
 * Based on roles (developer, architect, tester, devops) respective
 * Factory pattern class will be returned.
 * */
public abstract class AbstractFactory {
    public abstract EngineeringTeamMember getEngineeringTeamMember(String skillset);
}
