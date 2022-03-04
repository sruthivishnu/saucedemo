Feature: Testing if User registration is possible
  
  Scenario Outline: User has their personal data
  
  Given User open Web browser and navigate to the Website
  When user type <First_Name> and <Last_Name>
  And User type <user_email> and <website> and <password> and <con_password>
  And User Click the Check box
  And user Click on Radio button
  And User Select <country>
  And User choose a Number <number>
  And User select <option>
  And the User enters some Text <text>
  And User click on Submit button
  Then User should be complete the registration
  
	Examples:
  |First_Name|Last_Name|user_email|website|password|con_password|country|number|option|text|
  |abc|efg|1234578@gmail.com|https://www.facebook.com/|123|123|India|1|Option1|gfgfjksd|
  |zyx|uvw|4567890@gmail.com|https://www.google.com/|456|456|Austria|3|Option 3|wetyu|
