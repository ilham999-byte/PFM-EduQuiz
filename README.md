# EduQuiz Advanced Online Quiz Management Platform with Role-Based Functionality
This platform will facilitate the management and evaluation of online quizzes by supporting two user roles: standard users and administrators. Standard users will be able to take quizzes within a defined time limit, while administrators will manage quiz creation, modification, and deletion, as well as categories, questions, and participant results. The platform is designed with modern technologies, including Spring Boot for backend services, React for frontend interfaces, and MySQL for data storage, ensuring a robust and scalable solution for comprehensive quiz management and knowledge assessment.
![image](https://github.com/user-attachments/assets/357c4b1f-66e1-4b3d-a6f5-71cc2b159029)
## Table of Contents

- [Docker Image](#docker-image)
- [Frontend](#frontend)
- [Backend](#backend)
- [Getting Started](#getting-started)
- [Video Demonstration](#video-demonstration)



## Docker Image



```yaml
version: '3.9'
services:
  mysql:
    image: mysql:latest
    environment:
      MYSQL_ROOT_PASSWORD:
      MYSQL_DATABASE: eduquiz
    ports:
      - "3306:3306"
  backend:
    build:
      context: ./eduquiz-backend
    ports:
      - "8085:8085"
    depends_on:
      - mysql
    environment:
      SPRING_DATASOURCE_URL: jdbc:mysql://mysql:3306/eduquiz
      SPRING_DATASOURCE_USERNAME: root
      SPRING_DATASOURCE_PASSWORD:
    healthcheck:
      test: "/usr/bin/mysql --user=root --password= --execute 'SHOW DATABASES;'"
      interval: 5s
      timeout: 2s
      retries: 100

  frontend:
    build:
      context: ./eduquiz-frontend
    ports:
      - "80:80"
    depends_on:
      - backend

  phpmyadmin:
    image: phpmyadmin/phpmyadmin
    environment:
      PMA_HOST: mysql
      PMA_PORT: 3306
      MYSQL_ROOT_PASSWORD: root
    ports:
      - "8081:80"
```yaml

 ## Frontend
Technologies Used
React
HTML
CSS

## Backend
Technologies Used
Spring Boot
MySQL
Backend Project Structure
The backend code follows a modular and organized structure, leveraging the power of Spring Boot for building a robust and scalable application.

1. com.project.eduquiz.EduquizApplication
Main Application Class: Application.java serves as the entry point for the Spring Boot application. It includes the main method to start the application.
2. com.project.eduquiz.controller
Controller Classes: The controller package contains classes responsible for handling incoming HTTP requests. Each controller class is dedicated to a specific feature or entity, exposing RESTful endpoints. These classes interact with the services to process requests and return appropriate responses.
3. com.project.eduquiz.model
Entity Classes: The model package includes classes representing data entities in the application. These classes are annotated with JPA annotations, defining the structure of the database tables. Each entity typically corresponds to a table in the MySQL database.
4. com.project.eduquiz.repository
Repository Interfaces: The repository package contains interfaces that extend Spring Data JPA repositories. These interfaces provide methods for basic CRUD operations and are used by services to interact with the database.
Dependencies
Spring Data JPA:
Purpose: Simplifies data access using JPA in Spring Boot.
MySQL Connector/J: Purpose: JDBC driver for connecting to a MySQL database.
xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>
## Getting Started
Certainly! Here are step-by-step instructions to set up and run your project locally:

Prerequisites:
Git:

Make sure you have Git installed. If not, download and install it from git-scm.com.
XAMPP:

Install XAMPP from apachefriends.org.
Start the Apache and MySQL servers in XAMPP.
Ensure MySQL is using port 3306.
Node Version Manager (NVM):

Install NVM from github.com/nvm-sh/nvm.
Use NVM to install Node.js version 14.11.0: nvm install 14.11.0.
Backend Setup:
Clone the Project: bash git clone <repository_url> cd <project_folder>

Install Backend Dependencies:

Open a terminal in the backend project folder.
Run the following commands: bash mvn clean install
Run Backend:

Start your XAMPP Apache and MySQL servers.
Run the Spring Boot application. The database and entities will be created automatically.
Verify that the backend is running by visiting http://localhost:8085 in your browser.
Frontend Setup:
Install Node.js and Angular:

Open a new terminal for the frontend project.
Ensure NVM is using Node.js version 14.11.0: nvm use 14.11.0.
Install Angular CLI globally: npm install -g @angular/cli.
Install Frontend Dependencies:

Run the following commands in the frontend project folder: bash npm install

If you encounter errors during installation, use the following command: bash npm install --save --legacy-peer-deps

Run Frontend:

After installing dependencies, start the Angular development server: bash ng serve

Access the frontend at http://localhost:3000 in your browser.

Now, your full-stack project should be up and running locally. If you encounter any issues during setup, check the console logs for error messages and ensure that all dependencies and prerequisites are correctly installed.

## Video Demonstration
Click the link below to watch a demonstration video:

Utilisation
Authentification :
Pour s'authentifier en tant que admin :
Email : salma@gmail.com
Mot de passe : salma
Username: salma
Pour s'authentifier en tant que utilisateur:
Email : ilhamettouil999@gmail.com
Mot de passe : ilham
Username:ilham



