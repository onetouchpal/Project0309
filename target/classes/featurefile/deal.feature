Feature: Create a new deal
Scenario: create a new deal test
Given user homepage
|username	|password|
|onetouchpal|Easy2use|
When user clicks on new deal
|title		|company	|primary contact	|amount	|pedicated date		|actual date	  |
|friday 	|google		|shilpi malik		|1000	|28th october 2018  |28th october 2018|
|saturday	|amazon		|rashmi sharma		|2000	|29th october 2018  |29th october 2018|
|sunday		|apple		|varun bhardwaj		|3000	|28th october 2018  |28th october 2018|
|monday 	|bose		|vishal				|4000	|29th october 2018  |29th october 2018|
Then user clicks on new task
|title	|deadline		  |key contact	|key company|
|tuesday|28th october 2018|priya thakur	|adobe		| 
Then user browers closed