Feature: Testing basics

Scenario: 3.I want to  test google is up and running
Given google have website
When I hit google application
Then I validate status code

#Scenario: 2.I want to  test google is up and running
#When I hit google application
#Then I validate status code

Scenario: 4.I want to  test f1race is up and running
Given f1race have website
When I hit f1race application
Then I validate status of f1race
Then Validate f1race data 