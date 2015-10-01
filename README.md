# RainMicroservice
A simple microservice built using Spring Boot. Uses Gradle as a build and dependency management tool.

## Startup Guide
If you have not already, clone this repository to your local machine:
>git clone https://github.com/SelwynL/RainMicroservice.git

Change into the RainMicroservice directory (This is the directory in which you perform all Gradle and Git commands):
>cd ~/Development/RainMicroservice

Pull recent changes from Git:
>git pull

Build the source code and deploy the application with Gradle:
>./gradlew bootRun

Navigate to the following url with a browser:
>http://localhost:8080/rain

You have to stop the microservice in order to build new changes. In order to stop press:
>Control + C

Before making code changes, make sure you move to a separate development branch (aka NewBranchName in the sample):
>git checkout -b NewBranchName

When you are ready to push your branch with changes to github for a "pull request":
>git add . <br/>
>git commit -m "Your commit description goes here" <br/>
>git checkout master <br/>
>git pull <br/>
>git checkout NewBranchName <br/>
>git merge master <br/>
>git push origin NewBranchName <br/>

## API Endpoints

| Method  | Url             | Description                        |
|---------|-----------------| -----------------------------------|
| GET     | `/rain`         | Returns "Raining..."               |
