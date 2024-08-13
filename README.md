# Question-Quiz-Microservice
 This is a project to demonstrate microservices, Eureka, Load balancing, OpenFeign, Routing
 
 # Use the following URLs for testing in Postman
 
 To Add data in Quiz table - http://localhost:8081/quiz (POST)
 BODY EXAMPLE -
 {
    "title":"Java Quiz 5"
}
 
 To Add data in Question table - http://localhost:8082/question (POST)
 BODY EXAMPLE -
 {
    "question":"what is pandas",
    "quizId":2
}
 
 To get all quiz and questions - http://localhost:8081/quiz (GET)
 To get any specific ID's quiz and questions - http://localhost:8081/quiz/1 (GET)
 To get all the Questions - http://localhost:8082/question (GET)
 To get all the questions for a specific Quiz ID - http://localhost:8082/question/quiz/1 (GET)
 
 
