Feature: Admin Login
Scenario: Admin logins With Correct Username and Password in the application
Given Admin are in login page
When Admin Enters the username in the username text field
And Admin Enters the password in the password text field
When Admin clicks on Log in button
Then Admin is navigated to Homepage of Admin Module