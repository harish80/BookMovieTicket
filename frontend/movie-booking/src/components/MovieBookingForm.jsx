import React from 'react'
import { Button, Form } from 'semantic-ui-react'

const MovieBookingForm = () => {
    let movie = localStorage.getItem("movie");
    let data = movie.split('@')
    return (
        <div>
            <h1> Confirm booking for Movie {data[0]} </h1>
            <Form>
                <Form.Group widths={2}>
                    <Form.Input label='First name' placeholder='First name'
                        error={{ content: 'Please enter your first name', pointing: 'above' }}
                    />
                    <Form.Input label='Last name' placeholder='Last name' />
                    <Form.Input label='Email' placeholder='Email' />

                    <Form.Input label='Phone' placeholder='Phone' />
                    <Form.Input label='Number of Tickets' placeholder='Quantity' />

                </Form.Group>
                <Button type='submit' href='https://pmny.in/yI6kI3CEnOex' >Pay Now</Button>
            </Form>
        </div>
    )
}

export default MovieBookingForm