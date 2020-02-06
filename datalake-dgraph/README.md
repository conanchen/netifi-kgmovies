# datalake-dgraph
1. [Run Dgraph](https://tour.dgraph.io/intro/2/)

# Run Dgraph

Let’s run an instance of Dgraph on your machine; that’ll give you a handle on installing Dgraph and loading data yourself.

All the data in this tutorial will be stored in the instance you install and all the queries will look for Dgraph on your local machine. By running it in a container, you’ll have a fresh Dgraph that will serve as a sandbox for you to learn and experiment with.

There are a number of ways to install and run Dgraph. For this tutorial, let’s run it in a container with Docker.

First, grab the latest version of Docker.

Then, pull the latest Dgraph version with:

```
docker pull dgraph/dgraph
```

Now, to run Dgraph in Docker, it’s:

```shell
mkdir -p ~/dgraph
```

```shell
# Run dgraphzero
docker run -it -p 5080:5080 -p 6080:6080 -p 8080:8080 -p 9080:9080 -p 8000:8000 -v ~/dgraph:/dgraph --name dgraph dgraph/dgraph dgraph zero

# In another terminal, now run dgraph
docker exec -it dgraph dgraph alpha --lru_mb 2048 --zero localhost:5080

# And in another, run ratel (Dgraph UI)
docker exec -it dgraph dgraph-ratel
```
That’s it!

Dgraph Alpha will now be running and listening for HTTP requests on port 8080 and Ratel would be listening on port 8000. There are more options, but that’s all we need to get started.

# Now tutorial
https://tour.dgraph.io/intro/3/


# Real Example 
1. [IEntityService define interfaces to manipulate data](https://github.com/intuit/katlas/blob/c0529ed75d7f121eca08e92791043ff132b6019b/service/apis/entity_service.go)