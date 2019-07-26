Feature: login page
This doc describe log in page in Testme App

Scenario Outline: log in
When open browser
And enter valid user name <uname>
And enter valid password <pwd>
And click on sig in button

Examples:
|uname    | |pwd          |
|"lalitha"| |"password123"|
