#!/bin/bash

mvn clean install
docker build -t sudheerasl/docker-test:xray .
docker run sudheerasl/docker-test:xray
docker push sudheerasl/docker-test:xray