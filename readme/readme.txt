
0) Spring zuul server URI
--------------------------------
#http://localhost:8888/config-client-employee/config/master

Note: Make sure you start the cloud server first before starting this client application.

1) Running the application
----------------------------
mvn spring-boot:run

2) Employee Application URI (Client App)
----------------------------------------
http://localhost:7600/swagger-ui.html


3) Request / Responses
---------------------------
A) Successful
----------------
Request:
------------
{
  "password": "string",
  "username": "string"
}


Response:
-----------
{
  "httpStatus": "UNAUTHORIZED",
  "applicationErrorCode": "9000",
  "applicationErrorMessage": "Invalid username or password"
}

B) Unsucessful
-------------------
Request:
------------
{
  "password": "ankur",
  "username": "ankur"
}

Response:
-----------
{
  "employees": [
    {
      "id": 1,
      "firstName": "ankur",
      "lastName": "israni"
    },
    {
      "id": 2,
      "firstName": "barack",
      "lastName": "obama"
    },
    {
      "id": 3,
      "firstName": "ravi",
      "lastName": "shastri"
    },
    {
      "id": 4,
      "firstName": "pamela",
      "lastName": "anderson"
    }
  ]
}
