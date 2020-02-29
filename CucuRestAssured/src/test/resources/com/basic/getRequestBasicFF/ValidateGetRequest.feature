Feature: Testing Rest Assured Get basics

Scenario: 1.I want to  test get request
Given Race circuit application is running
When I hit get request to get response          
#Then I validate circuit limit value
#Then I validate circuit id value
#we can write steps like this to make code more flexible and take values from feature file
Then I validate circuit "MRData.limit" value as "30" present               
Then I validate circuit "MRData.total" value as "20" present
Then I validate circuit "MRData.CircuitTable.Circuits[0].circuitId" value as "albert_park" present
Then I validate circuit total value