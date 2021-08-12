fetch("http://localhost:8080/api/ice/states")
    .then(response => response.json())
    .then(states => genStates(states))
    .catch(error => console.log(error))

fetch("http://localhost:8080/api/ice/years")
    .then(response => response.json())
    .then(years => genYears(years))
    .catch(error => console.log(error))

const clearChildren = function (element) {
    while (element.firstChild) {
        element.removeChild(element.lastChild);
    }
}

const mainContent = document.querySelector(".main-content")
const stateSelectElement = document.querySelector("#states")

const yearSelectElement = document.querySelector("#years")
// yearSelectElement.value = 2012


const makeSelectElement = document.querySelector("#makes")
const modelSelectElement = document.querySelector("#models")
const submitButton = document.querySelector(".user-form-submit-button")

submitButton.addEventListener("click", () => {

    clearChildren(mainContent)

    const userStateIndex = stateSelectElement.selectedIndex - 1
    const userYearIndex = yearSelectElement.selectedIndex - 1
    const userMakeIndex = makeSelectElement.selectedIndex - 1
    const userModelIndex = modelSelectElement.selectedIndex - 1

    const userStateId = stateSelectElement.getElementsByClassName("state-option")[userStateIndex].getAttribute("id")
    const userYearId = yearSelectElement.getElementsByClassName("year-option")[userYearIndex].getAttribute("id")
    const userMakeId = makeSelectElement.getElementsByClassName("make-option")[userMakeIndex].getAttribute("id")
    const userModelId = modelSelectElement.getElementsByClassName("model-option")[userModelIndex].getAttribute("id")
    

    console.log(yearSelectElement.getElementsByClassName("year-option")[userYearIndex].getAttribute("id"))

    // http://localhost:8080/api/ice/userVehicle/{year}/{make}/{model}
    fetch("http://localhost:8080/api/ice/userVehicle/" + userYearId + "/" + userMakeId + "/" + userModelId, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(response => response.json())
        .then(userVehicle => genUserVehicleComp(userVehicle))
        .catch(error => console.log(error))

})

const genStates = function (states) {
    clearChildren(stateSelectElement);
    const stateOption = document.createElement("option");
    stateOption.setAttribute("value", "choose-state");
    stateOption.innerText = 'State';
    stateSelectElement.appendChild(stateOption);

    states.forEach((state) => {
        const newOptionElement = document.createElement("option");
        newOptionElement.classList.add("state-option")
        newOptionElement.setAttribute("value", state.state);
        newOptionElement.setAttribute("id", state.id)
        newOptionElement.innerText = state.state
        stateSelectElement.appendChild(newOptionElement)
    })
}

const genYears = function (years) {

    clearChildren(yearSelectElement)
    const defaultOption = document.createElement("option")
    defaultOption.setAttribute("value", "choose-year")
    defaultOption.innerText = 'Year'
    yearSelectElement.appendChild(defaultOption)

    years.forEach((year) => {
        const newOptionElement = document.createElement("option")
        newOptionElement.classList.add("year-option")
        newOptionElement.setAttribute("value", year.year)
        newOptionElement.setAttribute("id", year.id)
        newOptionElement.innerText = year.year
        yearSelectElement.appendChild(newOptionElement)
    })

    yearSelectElement.addEventListener("change", () => {

        clearChildren(makeSelectElement)
        clearChildren(modelSelectElement)

        fetch("http://localhost:8080/api/ice/years/" + yearSelectElement.value, {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json'
                }
            })
            .then(response => response.json())
            .then(makes => genMakes(makes))
            .catch(error => console.log(error))

        // const textUpdate = document.querySelector(".test-year")
        // textUpdate.innerText = "User selected year: " + yearSelectElement.value

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
        newOptionElement.classList.add("make-option")
        newOptionElement.setAttribute("value", make.makeName)
        newOptionElement.setAttribute("id", make.id)
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

        // const textUpdate = document.querySelector(".test-make")
        // textUpdate.innerText = "User selected make: " + makeSelectElement.value

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
        newOptionElement.classList.add("model-option")
        newOptionElement.setAttribute("value", model.modelName)
        newOptionElement.setAttribute("id", model.id)
        newOptionElement.innerText = model.modelName
        modelSelectElement.appendChild(newOptionElement)
    })

    modelSelectElement.addEventListener("change", () => {

        // const textUpdate = document.querySelector(".test-model")
        // textUpdate.innerText = "User selected model: " + modelSelectElement.value
    })


}