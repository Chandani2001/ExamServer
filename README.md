ExamPortalSpringBoot

Team Java

Portal for Examinations

Vaibhav Agarwal

EXAMSERVER

** Portal for Examinations **

Contents :-
About the Software
Software Design
Software Optimizations
Software Diagrams
Flow of Control
Entity Relationship Diagram
Database Design
Relationships Among Table within Database
Demonstration Images of the Software
Admin Profile
Registration Page
Login Page
Welcome Page of Admin-Side
Viewing Your Profile Details
Adding a Category
Viewing Created Category
Deleting a Created Category
Adding a Quiz 
Adding Questions to a Quiz
Viewing Created Quizzes
Updating Quiz Information
Viewing the Result for a Quiz as a Professor
Student Profile
View All Quizzes
View Quizzes of a Particular Subject
Viewing the Result for a Quiz

**About the Software
Examserver is a software that provides professors a user-friendly platform to host quizzes for all of their courses while ensuring that these quizzes are answered by students in an ethical manner.

** There are 2 types of profiles that are available in Examserver

Admin – to be used by the Professor
Student
Users working on the Admin Profile have the following functionalities available to them:

Create Courses
Modify Courses
Delete Courses
Create Quizzes
Modify Quizzes
Delete Quizzes
Enable Tab Switch Prevention
Create Questions
View Student-Wise Test Results
Users working on the Student Profile have the following functionalities available to them:
Attempt Quizzes
Review Quizzes

** Software Design
This software was developed using
SpringBoot – Backend
MySQL – Database Management

** Software Optimizations
Authentication is quick and secure with JWT Authentication
Use of Single Webpages ensures faster load times
Use of a widely-used open-source editor results in the ability for the professor to add questions of various media types, enhancing the breadth of usability of the software and ensuring wider inclusivity
Usage of automatic submission benefits both profiles of users as work is always saved 

** Flow of Control:-
Entity Relationship Diagram

Database Design:
Tables in Database:-
Table - User
Table - Role
Table - User_Role
Table - Category
Table - Quiz
Table - Question
Table - Result

Relationships Among Table within Database

Admin Profile:

** Registration Page
Users: All who are not registered with Exam Dojo
Users are required to enter a valid:
Username
Password
First Name
Last Name
Email
Phone Number
All entries are validated and appropriate errors will be given
Accounts are authenticated using JWT Authentication

** Login Page
Users: All who are registered with Exam Dojo
Users are required to enter a valid:
Username
Password
First Name
Last Name
Email
Phone Number
All entries are validated and appropriate errors will be given
Accounts are authenticated using JWT Authentication

** Welcome Page of Admin-Side
Users: Professors or anyone who has logged in with an Admin Profile

** Viewing Your Profile Details
Users: Professors or anyone who has logged in with an Admin Profile
How to Get Here: Click on the ‘Profile’ button from the menu on the left

** Adding a Category
Users: Professors or anyone who has logged in with an Admin Profile
How to Get Here:
Click on the ‘Add Category’ button from the menu on the left
Click on ‘Add New Category’ below the created category within the ‘categories’ sub-menu
What you have to enter:
Name of the category
Description of the category

** Viewing Created Category
Users: Professors or anyone who has logged in with an Admin Profile
How to Get Here: Click on the ‘Categories’ button from the menu on the left

** Deleting a Created Category
Users: Professors or anyone who has logged in with an Admin Profile
How to Get Here: Click on the ‘Delete’ button marked in red present on the right of the subject name

** Adding a Quiz
Users: Professors or anyone who has logged in with an Admin Profile
How to Get Here: Click on the ‘Add Quiz’ button from the menu on the left
What you have to enter:
Name of the Quiz
Description of the Quiz
Maximum Marks for the Quiz
Number of Questions to be asked
Subject that the quiz is part of
‘Publish Status’ toggle will control whether the student is able to view the quiz on their profile
  

** Adding Questions to a Quiz
Users: Professors or anyone who has logged in with an Admin Profile
How to Get Here: Click on the ‘Questions’ button from the row of buttons below the name of a created quiz within the Quizzes Page
How to Create Your First Question:
After clicking on the ‘Questions’ button, click on ‘Add Question’ Button
Enter your question in the text field given
Enter the four options you would like the student to choose from
The correct answer must be one of the options
Click on ‘Add’ button at the bottom of the page
You have successfully created a question
Questions can be updated after adding by clicking on the ‘Update’ button within the ‘Questions’ Page
    

** Viewing Created Quizzes
Users: Professors or anyone who has logged in with an Admin Profile
How to Get Here: Click on the ‘Quizzes’ button from the menu on the left


 ** Updating Quiz Information
Users: Professors or anyone who has logged in with an Admin Profile
How to Get Here: Click on the ‘Update’ button from the row of buttons below the name of a created quiz within the Quizzes Page


** Viewing the Result for a Quiz as a Professor
Users: Professors or anyone who has logged in with an Admin Profile
How to Get Here: From the “Quizzes” page, click on the “View Result” button below the name of the quiz you would like to see the results
The results will be shown student-wise in a tabular manner


Student Profile
** View All Quizzes
Users: Students
How to Get Here: Click on the ‘All Quizzes’ button from the menu on the left

** View Quizzes of a Particular Subject
Users: Students
How to Get Here: Click on the subject name button from the menu on the left. For example, if you would like to view the quizzes available in the subject, “MAT_3003 complex”, click on the button, “MAT_3003 complex”

** Viewing the Result for a Quiz
Users: Students
How to Get Here: From the “Available Quizzes” page, click on the “See Results” button below the name of the quiz you would like to see the results for

