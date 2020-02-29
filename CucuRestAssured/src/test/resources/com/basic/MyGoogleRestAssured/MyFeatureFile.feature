Feature: Testing basics

Scenario: 1.I want to  test google is up and running
Given google have website
When I hit google application              #We can use 'And' alsofor writing script but jenkins create problem for that so avoid  using 'And'
Then I validate status code

#Scenario: 2.I want to  test google is up and running
#When I hit google application
#Then I validate status code

Scenario: 2.I want to  test f1race is up and running
Given f1race have website
When I hit f1race application
Then I validate status of f1race
Then Validate f1race data 