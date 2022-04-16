Feature: Get teset

@test
Scenario: Test get request

* def expectedOp = read('response01.json')


Given url 'https://reqres.in/api/users?page=2'
When method GET
Then status 200
Then print response
And match response == expectedOp


@test
Scenario: Test post request

* def payload = read('payload01.json')
* url 'https://reqres.in/api/users'
* header Content-Type = 'application/json'

And request payload
When method POST
Then status 201
Then print response