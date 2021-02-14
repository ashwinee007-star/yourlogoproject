Feature: Login into the account
Scenario: User logins with valid details

Given the user has created account in the website
When the user wants to login
Then the user logs in to the website

Scenario: User logins to the system with invalid credentials

Given the user has not created his account in the website
When the user want to login
Then the user unable log in to the website
