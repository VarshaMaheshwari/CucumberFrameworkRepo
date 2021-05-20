Feature: Accounr Details screen verification

Background: Login with valid credentials
Given user has already logged into  application
|userName|password|
|varshan1311@gmail.com|N@re$h#C5+204|
And user is on My account menu screen
Then selects Account Details link

Scenario: Account details screen navigation
Then user is navigated to Account Details screen

Scenario: Update user details on Account details screen 
Given user is on Account Details screen
When user enters First name as "Varsha" and Last Name as "Maheshwari"
And clicks on save changes button
Then user is navigated to My account menu screen