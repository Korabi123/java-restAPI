
# Simple SpringBoot REST API + CLI TESTER (cuz why the hell not)

Oversimplified version of a authentication flow with springboot (for the REST API) and maven (for the CLI)


## Get Started

### Start by cloning the repo
```sh
git clone https://github.com/Korabi123/java-restAPI.git
```
### Go in the project directory
```sh
cd java-restAPI
```
### Setup the app
```sh
.\mvnw compile
```
### Run the API Server (!!Located at port 8080)
```sh
.\mvnw spring-boot:run
```
### Run the CLI
```sh
cd target\classes && java com/example/demo/ConsoleApp
```
## API Reference

#### Authentication

```http
  GET /api/getUsers
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `userId` | `string` | **Optional**. Get a user by their id (coming soon) |
| `email` | `string` | **Optional**. Get a user by their email (coming soon) |
| `name` | `string` | **Optional**. Gets all users with the same name (coming soon) |

```http
   POST /api/createUser
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `email` | `string` | **Required**. The user email |
| `name` | `string` | **Required**. The user name |
| `password` | `string` | **Required**. The user password |



## Next Steps

#### Some goals for this project are

- [ ] Add a hashing algorithm (serverside) so that the passwords don't get saved as plaintext
- [ ] Add serverside validation so users can't directly request to server and create users without the needed information
- [ ] Add login functionality (oversimplified ofc) with session tokens that are saved to a variable 💀
- [ ] Add optional params to the getUsers route to get a user by id, get a user by email and get multiple users by the same name
- [ ] Add a config file for customizability
- [ ] And lastly add a database cuz who actually uses arrays to store users???
