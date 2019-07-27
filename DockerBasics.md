# Getting started with docker

Login into the below URL with docker hub username and password and start deploying the code into docker by means of using upcoming command . Please create a instance before we start to execute the commands .

## URL for getting into docker playground
[Link to Docker Playground !!!](https://labs.play-with-docker.com/)

## Now lets get into step by step procedure for deploying the code into docker

### Step 1 : Checking the docker version through CLI

```
docker version
```

### Step 2 : To check available images

```
docker image ls
```

### Step 3 : Cloning the code from github for deployment

```
git clone https://github.com/vembubalaji/dockertest.git
```

### Step 4 : Once the code is cloned get into the folder to build image for deployment

**Note** : The image would be built based on the information provided by the DockerFile

```
docker build -t sampledemo:v1 .
```

### Step 5 : Running the code from the image that has been built

```
docker run -d -p 8080:8080 sampledemo:v1
```

### Step 6 : We can see instance of the code being running under the container

```
docker container ls
```

### Step 7 : Webservice can be accessed through curl command

```
curl http://localhost:8080/hello
```

### Step 8 : Looking into the logs of the container 

```
docker logs -f << container id >>
```

### Step 9 : Logging in to the docker container

```
docker exec -it << container id >> /bin/bash
```

### Step 10 : Logging in to the docker

**Note** : You would be asken for username and password for docker hub 
 
```
docker login
```

### Step 11 : Tagging the image

```
docker tag << host image >> << hubHandleName/registry image >>
```

### Step 12 : Pushing the image to repository

```
docker push << hubHandleName/registry image >>
```

### Step 13 : Pulling the image from repository

```
docker pull << hubHandleName/registry image >>
```
### Step 14 : Stopping the docker container

```
docker container stop << container id >>
```

### Step 15 : To check if any other container is running

```
docker container ls --all
```