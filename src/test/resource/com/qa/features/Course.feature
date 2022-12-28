Feature: Add Course 
Background:
Given Admin is in HomePage
When Admin clicks on course link
Then Admin is navigated to Course page
When Admin clicks on Addnew link
Then Admin is Navigated to Course detailpage

Scenario: Adding in Engineering course for BioTech

When Admin Add the Course Name as  BioTech in Coursename textfied
And Selects the major Enginnering
And Selects the type of course UG
And Click on Submit Button
Then Course is added Successfull and displayed in course page

Scenario: Adding in Engineering course for AeroSpace

When Admin Add the Course Name as AeroSpace in Coursename textfied
And Selects the major Enginnering
And Selects the type of course UG
And Click on Submit Button
Then Course is added Successfull and displayed in course page

Scenario: Adding in Engineering course for GeoInformatics

When Admin Add the Course Name as GeoInformatics in Coursename textfied
And Selects the major Enginnering
And Selects the type of course UG
And Click on Submit Button
Then Course is added Successfull and displayed in course page

Scenario: Adding in Arts And Science course for BBA

When Admin Add the Course Name as BBA Coursename textfied
And Selects the major Arts
And Selects the type of course UG
And Click on Submit Button
Then Course is added Successfull and displayed in course page

Scenario: Adding in Arts And Science course for B.sc Geography

When Admin Add the Course Name as B.sc Geographyin Coursename textfied
And Selects the major Arts
And Selects the type of course UG
And Click on Submit Button
Then Course is added Successfull and displayed in course page

Scenario: Adding in Arts And Science course for B.sc Economics

When Admin Add the Course Name as B.sc Economics in Coursename textfied
And Selects the major Arts
And Selects the type of course UG
And Click on Submit Button
Then Course is added Successfull and displayed in course page
