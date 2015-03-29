# hromadskeTV
Automation project for UWC 7 - Hromadske TV  
Autor - Oleksandr Khotemskyi

Tests are running on each commit on Travis-CI platform.  
Current tests status:  
[![Build Status](https://travis-ci.org/Xotabu4/hromadskeTV.svg)](https://travis-ci.org/Xotabu4/hromadskeTV)

###How to run?
To run this project on your local machine - you need  
- Installed JDK (I used 8, but it was also tested with 7)  
- Latest Maven to be configured  
- Installed Firefox latest version  

Run ```mvn test``` from root folder (were pom.xml is located) to compile, download dependencies and run tests.

###Tests
/src/test/java/SearchTest.java 
- searchFromHomePageShouldBeSuccessfulTest
- searchFromSearchPageShouldBeSuccessfulTest  

/src/test/java/DonateTest.java
- bankInformationShouldBeCorrectTest
- moneyUaDonationMethodShouldHaveCorrectParametersTest

###PageObjects
located in /src/main/java/hromadske/pages

###Used Libraries
Selenide - http://selenide.org/  
Selenium WebDriver - http://docs.seleniumhq.org/projects/webdriver/  
TestNG - http://testng.org/doc/index.html  
webdriver-logging-wrapper - https://github.com/barancev/webdriver-extensions/tree/master/webdriver-logging-wrapper  
