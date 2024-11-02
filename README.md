# Spring Boot Docker

## Table of Contents
- [About The Project](#about-the-project)
- [Built With](#built-with)
- [Getting Started](#getting-started)
  - [Clone Project](#clone-project)
  - [Prerequisites](#prerequisites)
  - [Instructions](#instructions)
- [Contact Me](#contact-me)
- [Contributing](#contributing)

## ⚡️ About The Project
This project is a Spring Boot application packaged as a Docker container. It demonstrates how to create a RESTful API using Spring Boot and deploy it using Docker. The application can be easily run in any environment that supports Docker, providing a consistent setup and deployment process.

## 🪓 Built With
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Docker](https://www.docker.com/)
- [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)

## 🔥Getting Started
This project's purpose is to run a Java application as a Docker container. If you want to run your application as a container, follow the steps below.

### 🥡 Clone Project
To get a local copy of the project up and running, follow these steps:

1. Clone the repo
   ```
    git clone https://github.com/your-username/spring-boot-docker.git
   
### 🔑 Prerequisites
Make sure you have the following installed on your machine:
- [Java JDK 17](https://www.oracle.com/java/technologies/downloads/)
- [Docker](https://www.docker.com/)
- [Docker](https://maven.apache.org/download.cgi)

  
### 📝 Instructions
* Navigate to the project directory:
```sh
cd spring-boot-docker
```

* Build docker image
```sh
docker build -t spring-boot-docker .
```

* Run the Docker container:
```sh
docker build -t spring-boot-docker .
```
docker run -p 9090:8080 spring-boot-docker

* Check container
```sh
docker build -t spring-boot-docker .
```
docker ps

* check all containers including running container, not running container, unsuccessful running container
```sh
docker ps -a
```

* If you want to check running application logs or your output log values, you can type docker logs option.
```sh
docker logs -f -n 200 {container_id}
```

* If you want to delete your application container, you need to stop container first with above step.
  Please note that, it's better deleting unnecessary container or unsuccessful container as to reduce resource usage in your machine.

* if application is running, you need to stop with docker stop command first
```sh
docker rm {container_id}
```

* If you want to delete your application image, you need to stop and delete container first with above step.
  if container is still alive, you need to delete container first before deleting image
```sh
docker rmi {image_id}
```

* To remove all unused images (recommended way)
```sh
docker image prune
```

* To remove all unused networks
```sh
docker network prune
```

* To remove all unused volume (need to take care your volumes is used by other unactive containers which will use in future
```sh
docker volume prune
```

* To remove all unused containers, images and networks (including cache)
```sh
docker system prune
```


## ✉️ Contact Me
* Name - Yoon Myat Phoo 
* LinkedIn profile - [Yoon Myat Phoo's LinkedIn](https://www.linkedin.com/in/yoon-myat-phoo-9b32531b7/)
* Email Address - yoonmyatphoo.mmr@gmail.com
* Project Link - [Spring Boot Docker](https://github.com/yoonmyatphoo-mmr/spring-boot-docker)


## ⭐ Contributing
Contributions are welcome! Please read the CONTRIBUTING.md for more information.
Contributions are what make the open source community such an amazing place to be learnt, inspire, and create. Any contributions you make are greatly appreciated.
If you want to contribute....

1. Fork the Project
```sh
git checkout -b feature/yourname
```

3. Create your Feature Branch
```sh
git checkout -b feature/yourname
```

5. Commit your Changes
```sh
git commit -m 'Add some Amazing Features'
```

7. Push to the Branch
```sh
git push -u origin feature/yourname
```

9. Open a Pull Request




