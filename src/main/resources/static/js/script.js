const ourRequest = new XMLHttpRequest();
ourRequest.open('GET', 'http://localhost:8080/ships/all');
ourRequest.onload = function () {
    const ourShips = JSON.parse(ourRequest.responseText);
    console.log(ourShips[0]);
};
ourRequest.send();