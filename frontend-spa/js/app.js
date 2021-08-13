import {
    displayHeader
} from "./Header.js"

import {
     displayAllVehicles
 } from "./display-all-vehicle.js"

 import {
     displayFooter
 } from "./footer.js"

const body = document.querySelector(".body")

body.append(displayHeader());

await fetch("http://localhost:8080/api/electricVehicles")
.then(response => response.json())
.then(allElectricVehicles => displayAllVehicles(allElectricVehicles))
.catch(error => console.log(error))

body.append(displayFooter());



