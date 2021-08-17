import {
    displayHeader
} from "./Header.js"

import {
     displayAllVehicles
 } from "./display-all-vehicle.js"

import {
    displaySingleEV
} from "./single-vehicle.js"

 import {
     displayFooter
 } from "./footer.js"



// All EVs -----------------------------------------------

const body = document.querySelector(".body")

body.append(displayHeader());

await fetch("http://localhost:8080/api/electricVehicles")
.then(response => response.json())
.then(allElectricVehicles => displayAllVehicles(allElectricVehicles))
.catch(error => console.log(error))

body.append(displayFooter());




// single EV -----------------------------------------------

// const body = document.querySelector(".svBody");

// body.append(displayHeader());

// body.append(displayFooter());







