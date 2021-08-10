import {genYears} from "./genYears.js"

const container = document.querySelector(".container")

fetch("http://localhost:8080/api/ice/years")
    .then(response => response.json())
    .then(years => genYears(years))
    .catch(error => console.log(error))

