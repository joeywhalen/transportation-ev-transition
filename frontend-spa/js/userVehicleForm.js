fetch("http://localhost:8080/api/ice/years")
    .then(response => response.json())
    .then(years => genYears(years))
    .catch(error => console.log(error))


const genYears = function (years) {

    const yearSelectElement = document.querySelector("#years")
    clearChildren(yearSelectElement)

    const defaultOption = document.createElement("option")
    defaultOption.setAttribute("value", "choose-year")
    defaultOption.innerText = 'Year'
    yearSelectElement.appendChild(defaultOption)

    years.forEach((year) => {
        const newOptionElement = document.createElement("option")
        newOptionElement.setAttribute("value", year.year)
        newOptionElement.innerText = year.year
        yearSelectElement.appendChild(newOptionElement)
    })

    yearSelectElement.addEventListener("change", () => {
        const userYear = yearSelectElement.value
        //http://localhost:8080/api/ice/years/{year}
        fetch("http://localhost:8080/api/ice/years/" + userYear, {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json'
                }
            })
            .then(response => response.json())
            .then(makes => genMakes(makes,userYear))
            .catch(error => console.log(error))

        const textUpdate = document.querySelector(".test-year")
        textUpdate.innerText = "User selected year: " + yearSelectElement.value

    })
}

const genMakes = function (makes,year) {
    const makeSelectElement = document.querySelector("#makes")
    clearChildren(makeSelectElement)
    //add default blank line option
    const defaultOption = document.createElement("option")
    defaultOption.setAttribute("value", "choose-make")
    defaultOption.innerText = 'Make'
    makeSelectElement.appendChild(defaultOption)

    makes.forEach((make) => {
        const newOptionElement = document.createElement("option")
        newOptionElement.setAttribute("value", make.makeName)
        newOptionElement.innerText = make.makeName
        makeSelectElement.appendChild(newOptionElement)
    })

    makeSelectElement.addEventListener("change", () => {
        const textUpdate = document.querySelector(".test-make")
        textUpdate.innerText = "User selected make: " + makeSelectElement.value
        
        // http://localhost:8080/api/ice/years/2012/ford
        fetch("http://localhost:8080/api/ice/years/" + year + "/" + makeSelectElement.value.toLowerCase(), {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json'
                }
            })
            .then(response => response.json())
            .then(models => genModels(models))
            .catch(error => console.log(error))

        

    })


}

const genModels = function(models) {

}

const clearChildren = function (element) {
    while (element.firstChild) {
        element.removeChild(element.lastChild);
    }
};