import React, { Component,useState } from 'react'
import { Menu, Segment } from 'semantic-ui-react'
import App from '../App'


function NavBar() {
  const [activeItem, setActiveItem] = useState('Movies');

  const handleItemClick = (e, { name }) => setActiveItem(name)

  return (
    <Segment inverted>
      <Menu inverted pointing secondary>
        <Menu.Item
          name='Movies'
          active={activeItem === 'Movies'}
          onClick={handleItemClick}
        />
      </Menu>
    </Segment>
  )
}

export default NavBar;