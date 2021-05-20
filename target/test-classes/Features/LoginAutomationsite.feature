Feature: Login to http://practice.automationtesting.in/ site

Scenario: Login with valid credentials
Given user is on login page of practice automation site
When user enters username as "varshan1311@gmail.com" and password as "N@re$h#C5+204"
And clicks on Login button
Then user is logged into the application

Scenario: Verify lost your password link is present
Given user is on login page of practice automation site
Then user is able to find "Lost your password?" link

