# IMDbApiTop250Movies
## Search for the better movies

[![Build Status](https://img.shields.io/badge/Java-HttpClient-red)](https://github.com/Vitor0liveira)

IMDbApiTop250Movies consume the IMDB-API to return a list of top movies. With these movies on hand, you can create a front app to show some data however you like.

- ✨Top250Movies ✨

## Features

- Consumes external API
- Java: HttpClient | Generic Class
- Setupping apiKey through environment variables (Intellik IDEA) to maintain the value key security
- Creating an account in IMDB-API

IMDbApiTop250Movies is a lightweight project based on conventions API that people naturally use to enjoy their time.

## 🧪 Technologies

IMDbApiTop250Movies technologies:

- [Java] - evented I/O for the backend

## 🚀 How execute

Clone the project and access itself folder.

```sh
$ https://github.com/Vitor0liveira/IMDbApiTop250Movies.git
$ cd IMDbApiTop250Movies
```
Open your preferred IDE: I used Intellij IDEA

To start it, follow steps below:

First of all: 
- You will need to generate an APIKey (an access key), registering your email on the website. With the key in hand, you will be able to search for movies, series, etc., through the API. For example, to search for the name of a movie, just use: https://imdb-api.com/en/API/Top250Movies/<apiKey>
- Link to create a account: https://imdb-api.com/
- Case you use IntelliJ IDEA, you must add a path variable. (Edit Configurations... -> Environment variables: IMDB_API_KEY=apiKey)
- After done that above, running your project calling the URL: http://localhost:8081/api/movies

## License

MIT

**Free Software, Hell Yeah!**
