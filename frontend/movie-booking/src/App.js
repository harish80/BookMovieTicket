import MovieList from './components/MovieList'
import NavBar from './components/NavBar'
import 'semantic-ui-css/semantic.min.css'


function App() {
  
  return (
    <div>
      {NavBar()}
      {MovieList()}
    </div>
  );
}

export default App;
