@Smoke @Regression
Feature: Login function test
description: 

@Positive @TC_OB-4
Scenario: Check login with valid credentials
Given Go to application URL 
When put valid user name
When put valid password
When click login
Then Logout button should visible for Successfull login

@Negative @TC_LP-19
Scenario: Check login with invalid credentials
Given Go to application URL 
When put invalid user name
When put invalid password
When click login
Then Logout button should not visible for Successfull login



