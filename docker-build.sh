#!/bin/bash

mvn clean package
docker build -t sudheerasl/docker-test:xray .
docker run sudheerasl/docker-test:xray
docker push sudheerasl/docker-test:xray
echo "Done."