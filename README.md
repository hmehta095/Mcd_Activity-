Created By- *Himanshu Mehta (C0-744069)
            *Simran Kaur Bal (C0-743319)
                                                                   
### Test Case on McDonald's App                  

#### A food app in which we are performing various test cases to see different different outcomes.
###Test Cases:
 ** TC1:  Title of the subscription feature is “Subscribe to my Mcd’s”.**

  Expected Outcome:
  The title of the section should be: “Subscribe to My McD’s”.

1. For this test case the function name is testTitle()
   * pop-up Screen is removed
   * Text is matched using assertEqual function.

**TC2:  Email signup - happy path.**

1. For this test case the function name is testPosEmailSignup()

 In this test case user enters first name , email address , 3 digit postal code in letter-number-letter manner , and the subscribe button is pressed. All this is done through test cases, when the code is executed all the above mentioned values gets automatically filled and subscribe button is auto-clicked. Further, showing on-time generated  captcha.

**TC3: Email signup -  negative case**

1. For this test case the function name is testNegEmailSignup() 

In this test case user do not provides any information to the fields and the expected outcomes is an on-time generated captcha.

