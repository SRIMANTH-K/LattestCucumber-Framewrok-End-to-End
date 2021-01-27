Feature: LoginFuntionality

Scenario Outline: Login Credentilas
Given user launch browser and navigate to the shopping website
When Title of shopping page is "Login MyStore"
Then user click on singn button and navigate to login page
And user enter mailid "<username>" and pass "<password>"
Then validate loginpage Ttile
And user is on Accounts Page

Examples:
|username|password|
|teju4069@gmail.com|Jonas@kkhanwald123|

