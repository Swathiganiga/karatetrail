Feature: Demo test api testing

Scenario: Testing valid GET endpoints
Given url 'https://reqres.in/api/users?page=2'
When method GET
Then status 200
And match response.last_name =="Weaver"

Scenario: scenario description
    Given url 'https://reqres.in/api/users?page=2/5'
    When an action is performed
    Then something should be asserted
    And match response.first_name: "Charles",last_name: "Morris"}
