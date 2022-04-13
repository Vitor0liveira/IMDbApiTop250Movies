import React, { useState, useEffect } from "react";
import api from "../services/api";

function Movie() {

  const [movie, setMovie] = useState(null);
  
  const fetchMovies = async () => {
    try {
      const response = await api.get("/movies");
      setMovie(response.data.items);
    }
    catch (error) {
      console.log(error);
    }
  }

  useEffect(() => {
    fetchMovies();
  }, []);

  return (
   <div>
      <table className="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Title</th>
            <th scope="col">Year</th>
            <th scope="col">imDbRating</th>
            <th scope="col">Image</th>
          </tr>
        </thead>
        <tbody>
          {movie?.map(movie => (
            <tr key={movie.id}>
              <th scope="row">{movie.imdbID}</th>
              <td>{movie.fullTitle}</td>
              <td>{movie.year}</td>
              <td>{movie.imDbRating}</td>
              <td><img src={movie.image} alt="Movie" /></td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default Movie;
