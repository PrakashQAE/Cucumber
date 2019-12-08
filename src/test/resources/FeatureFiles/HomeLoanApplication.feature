@HomeLoan
Feature: Validation of Home Loan Application Form

Scenario Outline: Verify whether the customer is able to submit the Home Loan Application Form
Given Customer is on "https://www.sc.com/in/" Webpage
When Customer clicks on OurProducts Menu
Then clicks on LoansAndMortgage Link 
And clicks on HomeLoan Link
And clicks on ApplyNow Button
Then switch to next window
#And page title should be "Apply for Home Loans upto INR 35 Cr in India – Standard Chartered India"
And selects <City_Name> from City Dropdown
And selects <Loan_Purpose> from PurposeOfLoan Dropdown
#And enters <DateOfBirth> in Date Of Birth InputBox
And selects <Resident_Type> from ResidentType Dropdown
And selects <Employment_Type> from EmploymentType Dropdown
And enters <Email_ID> in EmailID InputBox
And enters <Mobile_Number> in Mobile Number InputBox

Examples:
|City_Name|Loan_Purpose           |DateOfBirth   |Resident_Type   |Employment_Type|Email_ID       |Mobile_Number|
|Chennai  |Property not identified|05-06-1990    |Resident Indian |Salaried       |test@gmail.com |9003036635   |