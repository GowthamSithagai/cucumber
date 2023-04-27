#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@BackgroundExample
Feature: To explain the usage of background

Background: Student completed school Education
Given The student finished high school
Given The student finished higher secondary


Scenario: To study medicine
    Given the student applied for the medical course
    When the student cleared the entrance exam
    Then the student is eligible for joining any medical institute
Scenario: To study Engineering 
    Given the student applied for the Engineering course
    When the student has a sayable cut off
    Then the student is eligible for joining any Engineering institute
    
    
    #Every feature file having a single background