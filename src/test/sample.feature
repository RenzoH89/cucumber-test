@java-sample
Feature: Login Action

  @test
  Scenario: Search for test
    Given User is on Home Page
    When the users searches for "test"
    Then the system displays results on "test"

  @automation
  Scenario: Search for automation
    Given User is on Home Page
    When the users searches for "automation"
    Then the system displays results on "automation"

  @detesters
  Scenario: Search for detesters
    Given User is on Home Page
    When the users searches for "detesters"
    Then the system displays results on "detesters"

  @kvk
  Scenario: Search for kvk
    Given User is on Home Page
    When the users searches for "kvk"
    Then the system displays results on "kvk"

  @docker
  Scenario: Search for docker
    Given User is on Home Page
    When the users searches for "docker"
    Then the system displays results on "docker"

  @jenkins
  Scenario: Search for jenkins
    Given User is on Home Page
    When the users searches for "jenkins"
    Then the system displays results on "jenkins"