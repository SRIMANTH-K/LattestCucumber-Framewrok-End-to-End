Feature: AccountsSectionpage and Contact Service
Scenario: Getting Account Sections Count
Given user is on loginpage
And use enter userid and pass
|username|password|
|teju4069@gmail.com|Jonas@khanwald123|
When accounts page title should be "My Login Accounts"
Then User getts Total Account Sections Text
When Sections count 4

Scenario Outline: Custamer Service - ContactUs Page
Given User is click on ContactUs Page 
When Title of contact page is "Contact us - My Store"
Then User sholud select Subject Heading
And User eneter "<Email>" and "<Order_reference>"
Then user eneter Message in Message Box "<Message>"
And user click on send button

Examples:
|Email|Order_reference|Message|
|jonas123@gmail.com|2|Hi im joans|
|khanwald54@gmail.com|1|iam khanwald|