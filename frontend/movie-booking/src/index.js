import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import MovieBookingForm from './components/MovieBookingForm';
import { Routes, Route, Link, BrowserRouter as Router } from 'react-router-dom'
import NavBar from './components/NavBar';

const route = (
  <Router>
    <div>
      <Routes>
        <Route path="/" element={<App/>} />
        <Route path="/home" element={<App/>} />
        <Route path="/book" element={<MovieBookingForm/>} />
      </Routes>
    </div>

  </Router>
)
ReactDOM.render(
  route,
  document.getElementById('root')
);

reportWebVitals();
