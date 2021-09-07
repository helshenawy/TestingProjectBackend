#  Test  project Backend
Task Backend 

This backend project Spring boot for Task  that have sqlite by adding dependency sqlite-dialect and reading sample database which it exist with task.

Send request http from frontend to read the sample database in file sample and showing it on page and 
allow to filter on these result and check every phone vaild or not depend on the regular experssion .


the project have :

1- Controller layer 

2- service layer 

3- repostory layer 

4- testing SpringJUnit4ClassRunner and using MockMvc 

5- docker  

create dockerfile that have configuration for creater image for project 

mv clean package 

mv install 

docker build --build-arg JAR_FILE="build/libs/*.jar" -t splitdemo/spring-boot-docker .	






