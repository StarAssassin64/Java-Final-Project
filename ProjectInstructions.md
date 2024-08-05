## Part 4 Option B Spring Quiz ##
Build a new full stack project that allows users to take a quiz about Spring. Quiz questions, answers, and
users' scores will be stored in a mySQL DB or a NonSQL database of choice. To interact with your API, build
a web client using Thymeleaf or a separate web client using a web framework NO vanilla JS. Track your
project in a private repo(s). You should have two repos if you don't use Thymeleaf. Project will be graded on
function and on your participation based on commit history. No commits, no points.

### Build the project ###
* Using Spring Initializr to build the project
* Add the following Dependencies:
* Spring Web
* Thymeleaf (Only if you are using it)
* Validation
* Lombok (optional)
* MySQL Driver
* Any other as you see fit. Feel free to explore Spring
## Project Structure ##
### Model ###
Make sure to mark your Models with correct Entity, Table, Id and Lombok annotations. There are a lot of
moving parts now in our project. You need to make sure all is build, running, and configured correctly to be
successful.
* User **Bonus** add login validation with an encrypted password.
* Test and/or Questions. Feel free to split up Test, Questions, possible answers, and correct answers
      how you please.

### Repository ###
Extend CrudRepository or MongoRepository and make custom methods as needed.

### Service Layer ###
You will need service method for but not limited to. Make sure you add validation for each. Bonus use
Spring validation to make sure the user is logged in.
  * Logging in / creating an account.
  * Starting a quiz
  * Answering a question
  * Going to the next question
  * Finishing the test

### Controller ###
Use your services. Either turn JSON data and status codes or if you're using Thymeleaf views.

### Database ###
Your project needs to have at least two tables/collections. On project boot, you need to fill the questions in
the database. You can do this how you would like. For this project is makes sense to do this on every boot to
keep quiz up to date. Bonus Have a GUI way to update quiz questions via the font end.

## Font End ##
### UI ###
The way your website acts/looks is up to you. It is expected of you to make this look/feel like a modern
website. Feel free to use CSS frameworks. Users should be able to navigate thought the website without
using back button. Website should have (favicon)[https://www.w3schools.com/html/html_favicon.asp].

### UX ###
  * Login Screen: Users should be greeted with a prompt to enter their username. If a user is not found,
        make a new account. No Password needed.
  * Test screens: Should be multiple screens with questions. Needs have at least two different types of
        questions, i.e., multiple choice and short answer. Keep your code DRY by reusing these screens. Test
        should show users progress in the test (example 1/10).
  * Show the user their score on a leader board. If a user gets a high score, twice, replace their previous
        score.

## Supporting Parts ##
### Documentation ###
For this project, you will need to include documentation. This documentation should be in Markdown and
include information of how to get your project running like database name, where to put MySQL password.
This should include information about who worked on this project. Name this file README.md and put it in
the root of the project(s).

### Rubric ###
Your project is graded based on execution and quality of the code submitted. Each feature is evaluated
individually. It is assumed that all work is done by the student that submitted the work unless otherwise
cited.

| Topic                   | Task                                                                                                                                                                                                            | Points |
|-------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------|
| Model                   | Project's Model is build out in a logical manner to support the rest of the project including a test, questions, answers, and users scores.                                                                     | 3pts   |
|                         | Model includes all necessary annotations for mySQL/nonSQL database                                                                                                                                              | 2pts   |
| Font End                | Project includes Thymeleaf pages that services the project / Separate project is built and tracked with Git.                                                                                                    | 4pts   |
|                         | Web pages are stylized to look and feel like modern web pages                                                                                                                                                   | 2pts   |
|                         | Web UI is able to perform all tasks in a user friendlily manner.                                                                                                                                                | 5pts   |
| Repository and Services | Project has repositories for each model.                                                                                                                                                                        | 2pts   |
|                         | Project has services layer. These classes should hold logic for database actions not covered by Repository. Service layer includes validation and throws errors.                                                | 6pts   |
| Controller              | Users Controller: holds all necessary end points to handle creating users and keeping there scores.                                                                                                             | 2pts   |
|                         | Test Controller: holds all necessary end points to have users take test.                                                                                                                                        | 2pts   |
| Project Management      | Project is stored and managed with Git. Team member has a rich commit history with well defined commit/pull comments.                                                                                           | 3pts   |
|                         | Project is well documented using README.md. Project has comments and JavaDocs throughout.                                                                                                                       | 1pt    |
|                         | Participation and attendance. Team member communicated well with there team. Team member pulled there weight on the project. If you do not receive these points you are disqualified on the rest of the rubric. | 5pts   |
|                         | Presentation is given. Team is prepared to demonstrate the project they have built.                                                                                                                             | 3pts   |
| Total                   |                                                                                                                                                                                                                 | 40pts  |