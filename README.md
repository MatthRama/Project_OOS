# Project for OO Systems Development

## Requirements

Java 17.

## Main

The code and databases of the Rental service will be present in the main src folder, more specifically in files such as Cars.java :

https://github.com/MatthRama/Project_OOS/blob/master/src/main/java/com/example/TP1/caracteristics/Cars.java

As specified, the business code has been separated from the web layer in accordance to the Java Coding rules.

## Project

This project is a finalization of what was done during the first two TPs, culminating in a Car Rental service.
Inserts however can only be done through direct modification of the code the Application file though :

https://github.com/MatthRama/Project_OOS/blob/master/src/main/java/com/example/TP1/Tp1Application.java

Beware, as sometimes, the gRPC server may start tomcat on the port used by the Rental Service if it is deemed as available on launch.
Therefore, the Rental service should be launched first, then the rest of the services can be started with the terminal.

## OpenAPI documentation

[![Screenshot](/relative/path/to/img.jpg?raw=true "Optional Title")](https://github.com/MatthRama/Project_OOS/blob/master/assets/openapi-doc.png)

## Services Launch

https://github.com/MatthRama/Project_OOS/blob/master/assets/launch-server.png

https://github.com/MatthRama/Project_OOS/blob/master/assets/launch-client.png

## Implementation of gRPC and REST :

https://github.com/MatthRama/Project_OOS/blob/master/myServiceInterface/src/main/proto/myService.proto


https://github.com/MatthRama/Project_OOS/blob/master/src/test/java/com/example/TP1/Tp1ApplicationTests.java

https://github.com/MatthRama/Project_OOS/blob/master/myServiceClient/src/test/java/com/example/myServiceClient/MyServiceClientApplicationTests.java

https://github.com/MatthRama/Project_OOS/blob/master/myServiceInterface/src/test/java/com/example/myServiceInterface/MyServiceInterfaceApplicationTests.java

https://github.com/MatthRama/Project_OOS/blob/master/myServiceServer/src/test/java/com/example/myServiceServer/MyServiceServerApplicationTests.java



