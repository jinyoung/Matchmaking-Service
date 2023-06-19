# 

## Model
www.msaez.io/#/storming/17a85b0e-a122-b450-4d0e-2cb7e54fd8af

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- user-profile-registration
- matching-algorithm
- matching-result
- chat


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- user-profile-registration
```
 http :8088/userProfiles userId="userId" firstName="firstName" lastName="lastName" age="age" gender="gender" profileImage="profileImage" 
```
- matching-algorithm
```
 http :8088/matchingAlgorithms userId="userId" agePreferenceMin="agePreferenceMin" agePreferenceMax="agePreferenceMax" genderPreference="genderPreference" 
```
- matching-result
```
 http :8088/matchingResults userId="userId" matchedUserId="matchedUserId" matchedOn="matchedOn" 
```
- chat
```
 http :8088/chatRooms chatRoomId="chatRoomId" 
 http :8088/chatMessages messageId="messageId" chatRoomId="chatRoomId" senderId="senderId" receiverId="receiverId" messageText="messageText" messageTime="messageTime" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

