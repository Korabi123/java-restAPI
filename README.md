
# Simple SpringBoot REST API

A project for learning to build REST API's with java (its a pain to code in java 😭)


## Get Started

### Start by cloning the repo
```sh
git clone https://github.com/Korabi123/java-restAPI.git
```
### Go in the project directory
```sh
cd java-restAPI
```
### Then run the development instance
```sh
.\mvnw spring-boot:run
```
## API Reference

#### Add numbers

```http
  GET /api/addNumbers
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `firstNum` | `integer` | **Required**. The first number |
| `secondNum` | `integer` | **Required**. The second number |

