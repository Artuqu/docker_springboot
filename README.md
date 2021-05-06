# docker_springboot
## Simple Spring Boot project works with Docker
Here, basic on this project you can make simple docker's image. Firstable you need of course to have docker on. Then:
- Upload this project and in folder with, open terminal. You can use any Linux, InteliJ or Wsl.
- Write command: docker build -f dockerFile -t docker_image1:v1 .
 > ### Remember about this dot above !
- Now docker will create image with docker_image1 name. You can check all of images by command: docker images. Be notice, that every image has now his own id.
- Then you can run your container by command: docker run -p 8000:8080 (image_id). If everthing goes properly you will see starting Spring Boot.
- Now type in your web explorer adress: localhost:8000. If everthing works fine you will see inscription: Hello Docker!
### Remember: to run server in this case you don't need InteliJ. All of things make docker for you.
