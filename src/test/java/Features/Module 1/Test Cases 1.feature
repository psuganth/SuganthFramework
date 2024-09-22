#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
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
@tag
Feature: Open nyse website and do anything to learn selenium framework


  @tag1
  Scenario Outline: Title of your scenario outline
    Given I want to open the nyse <URL>
    When I want to get all the ipo data of <Waystar Holding Corp> in ipo table
    Then verify something
    Adding line for testing wipro interview

    Examples: 
      | URL  | IPO Name |
      | QAURL | Waystar Holding Corp |

