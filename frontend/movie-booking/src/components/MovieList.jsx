import PaymentForm from "./PaymentForm.jsx"
import React, { useState, useEffect } from 'react';
import { Button, Card, Icon, Image } from 'semantic-ui-react'

import { useNavigate } from "react-router-dom";



function MovieList() {
  const src = 'https://react.semantic-ui.com/images/wireframe/white-image.png'

  const [movies, setMovies] = useState([])

  useEffect(() => {
    const fetchPosts = async () => {
      const response = await fetch('http://localhost:8081/api/v1/Movies');
      const movies = await response.json();
      setMovies(movies);
      console.log(movies);
    };
    fetchPosts();
  }, []);

  let history = useNavigate();

  function handleClick (e) {
    localStorage.setItem("movie",e.target.value)
    history('/book', { replace: true })
  };

  const content = movies.map((movie) => {
    return (<div key={movie.id}>
      <Card>
        <Image src={src} wrapped ui={false} />
        <Card.Content>
          <Card.Header>{movie.title}</Card.Header>
          <Card.Meta>
            <span className='date'>{movie.releaseDate}</span>
          </Card.Meta>
          <Card.Description>
            {movie.metadata}
          </Card.Description>
        </Card.Content>
        <Card.Content extra>
          <Button value={movie.title+"@"+movie.id} onClick={e => handleClick(e)}>Book Now</Button>
        </Card.Content>
      </Card>

    </div>);
  })

  return (
    <div>
      <Card.Group itemsPerRow={4}>
        {content}
      </Card.Group>
    </div>
  );

}

export default MovieList;