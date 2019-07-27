# Swarm and orchestration

We would be initializing the swarm and orchestrate the deployment of the application through docker-compose.yml . Execute the below command one by one .

## Step 1 : Initializing swarm

```
docker swarm init --advertise-addr << ip address of instance >>
```

## Step 2 : Deploying the code in form of stack

```
docker stack deploy --compose-file docker-compose.yml << give name for stack >>
```

## Step 3 : Seeing the deployed instances

```
docker stack service << stack name >>
```

## Step 4 : Stopping the stack

```
docker service rm << stack name >>
```