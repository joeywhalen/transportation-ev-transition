fetch("http://localhost:8080/api/ice/years")
    .then(response => response.json())
    .then(years => genYears(years))
    .catch(error => console.log(error))

const clearChildren = function (element) {
    while (element.firstChild) {
        element.removeChild(element.lastChild);
    }
}

const yearSelectElement = document.querySelector("#years")
const makeSelectElement = document.querySelector("#makes")
const modelSelectElement = document.querySelector("#models")

const genYears = function (years) {


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

        clearChildren(makeSelectElement)
        clearChildren(modelSelectElement)
        console.log("Test ran!")
        
        fetch("http://localhost:8080/api/ice/years/" + yearSelectElement.value, {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json'
                }
            })
            .then(response => response.json())
            .then(makes => genMakes(makes))
            .catch(error => console.log(error))

        const textUpdate = document.querySelector(".test-year")
        textUpdate.innerText = "User selected year: " + yearSelectElement.value

    })
}

const genMakes = function (makes) {
    
    clearChildren(modelSelectElement)
    const makeDefault = document.createElement("option")
    makeDefault.setAttribute("value", "choose-make")
    makeDefault.innerText = 'Make'
    makeSelectElement.appendChild(makeDefault)

    makes.forEach((make) => {
        const newOptionElement = document.createElement("option")
        newOptionElement.setAttribute("value", make.makeName)
        newOptionElement.innerText = make.makeName
        makeSelectElement.appendChild(newOptionElement)
    })

    makeSelectElement.addEventListener("change", () => {
        
        let userMake = makeSelectElement.value
        // http://localhost:8080/api/ice/years/2012/ford
        fetch("http://localhost:8080/api/ice/years/" + yearSelectElement.value + "/" + userMake.toLowerCase(), {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json'
                }
            })
            .then(response => response.json())
            .then(models => genModels(models))
            .catch(error => console.log(error))

        const textUpdate = document.querySelector(".test-make")
        textUpdate.innerText = "User selected make: " + makeSelectElement.value

    })
}

const genModels = function (models) {

    clearChildren(modelSelectElement)

    const defaultOption = document.createElement("option")
    defaultOption.setAttribute("value", "choose-model")
    defaultOption.innerText = 'Model'
    modelSelectElement.appendChild(defaultOption)

    models.forEach((model) => {
        const newOptionElement = document.createElement("option")
        newOptionElement.setAttribute("value", model.modelName)
        newOptionElement.innerText = model.modelName
        modelSelectElement.appendChild(newOptionElement)
    })

    modelSelectElement.addEventListener("change", () => {

        const textUpdate = document.querySelector(".test-model")
        textUpdate.innerText = "User selected model: " + modelSelectElement.value
    })


}