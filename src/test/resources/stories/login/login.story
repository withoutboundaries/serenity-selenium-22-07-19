Login

Meta:
@login

Narrative:
  In order to use app functionality
  As a user
  I want to be able to login

Scenario: Successful user login
Meta:
@login01
@smoke
Given I open Landing page
When I click on 'Sign in' button
Then I should be on Login page
When I sign In as '<email>' , '<password>'
Then I should be on Home page
Examples:
|email                           |password|
|petrenkovira19890206@gmail.com |love19850526love|


Scenario: Unsuccessful user login in order to remain on Login page
Meta:
@login02
@smoke
Given I open Landing page
When I click on 'Sign in' button
Then I should be on Login page
When I sign In as '<email>' , '<password>'
Then I should be on Login page
Examples:
|email                           |password|
|   |Test123!|

Scenario: Unsuccessful user login in order to fall to Error Page
Meta:
@login03
Given I open Landing page
When I click on 'Sign in' button
Then I should be on Login page
When I sign In as '<email>' , '<password>'
Then I should be on Error page
Examples:
|email                           |password|
|petrenkovira19890206@gmail.com   |Test123!|









