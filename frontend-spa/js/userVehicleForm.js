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
const formContainer = document.querySelector(".form-container")
const topSection = document.querySelector(".top-section")
const stateSelectElement = document.querySelector("#states")

const yearSelectElement = document.querySelector("#years")
// yearSelectElement.value = 2012


const makeSelectElement = document.querySelector("#makes")
const modelSelectElement = document.querySelector("#models")
const submitButton = document.querySelector(".user-form-submit-button")

let userStateObj = null;
let userChargeObj = null;


//SUBMIT BUTTON FOR USER VEHICLE DROP-DOWN FORM
submitButton.addEventListener("click", () => {

    clearChildren(formContainer)

    const userStateIndex = stateSelectElement.selectedIndex - 1
    const userYearIndex = yearSelectElement.selectedIndex - 1
    const userMakeIndex = makeSelectElement.selectedIndex - 1
    const userModelIndex = modelSelectElement.selectedIndex - 1

    const userStateId = stateSelectElement.getElementsByClassName("state-option")[userStateIndex].getAttribute("id")
    const userYearId = yearSelectElement.getElementsByClassName("year-option")[userYearIndex].getAttribute("id")
    const userMakeId = makeSelectElement.getElementsByClassName("make-option")[userMakeIndex].getAttribute("id")
    const userModelId = modelSelectElement.getElementsByClassName("model-option")[userModelIndex].getAttribute("id")

    //console.log(yearSelectElement.getElementsByClassName("year-option")[userYearIndex].getAttribute("id"))
    //console.log(makeSelectElement.getElementsByClassName("make-option")[userMakeIndex].getAttribute("id"))
    //console.log(modelSelectElement.getElementsByClassName("model-option")[userModelIndex].getAttribute("id"))
    //console.log(stateSelectElement.getElementsByClassName("state-option")[userStateIndex].getAttribute("id"))

    fetch("http://localhost:8080/api/ice/userVehicle/" + userStateId, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then(response => response.json())
    .then(userState => userStateObj = userState)
    .catch(error => console.log(error))

    
 


    // http://localhost:8080/api/ice/userVehicle/{year}/{make}/{model}
    fetch("http://localhost:8080/api/ice/userVehicle/" + userYearId + "/" + userMakeId + "/" + userModelId, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(response => response.json())
        .then(userVehicle => genUserVehicleComp(userVehicle,userStateObj))
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

const genUserVehicleComp = function (userVehicle,userStateObj) {

    const formH1 = document.querySelector(".form-h1")
    formH1.innerText = "What is your current vehicle lifestyle?"

    const formH3 = document.querySelector(".form-h3")
    formH3.innerText = "What is important in your next vehicle?"

    const lifestyleForm = document.createElement("form")
    const lifestyleDiv = document.createElement("div")
    lifestyleDiv.classList.add("lifestyle-form")

    const priceRangeInput = document.createElement("input")
    priceRangeInput.setAttribute("type", "text")
    priceRangeInput.setAttribute("id", "user-price-range")
    priceRangeInput.setAttribute("name", "user-price-range")
    priceRangeInput.setAttribute("placeholder", "Price Range")

    const weeklyMilesInput = document.createElement("input")
    weeklyMilesInput.setAttribute("type","text")
    weeklyMilesInput.setAttribute("id", "user-weekly-miles")
    weeklyMilesInput.setAttribute("name", "user-weekly-miles")
    weeklyMilesInput.setAttribute("placeholder","Miles Driven Weekly")

    const lifestyleSubmit = document.createElement("a")
    lifestyleSubmit.classList.add("lifestyle-submit-button")
    for (let i = 0; i < 5; i++) {
        let spanElement = document.createElement("span")
        lifestyleSubmit.appendChild(spanElement)
    }
    lifestyleSubmit.innerText = "Submit"

    lifestyleDiv.appendChild(priceRangeInput)
    lifestyleDiv.appendChild(document.createElement("br"))
    lifestyleDiv.appendChild(weeklyMilesInput)
    lifestyleDiv.appendChild(document.createElement("br"))
    lifestyleDiv.appendChild(lifestyleSubmit)
    lifestyleForm.appendChild(lifestyleDiv)
    formContainer.appendChild(lifestyleForm)

    lifestyleSubmit.addEventListener("click", () => {
        
        clearChildren(formContainer)
        genEVComparison(priceRangeInput.value, userVehicle, userStateObj, weeklyMilesInput.value)
    })
}


const genEVComparison = function (priceRange, userVehicle, userStateObj, weeklyMiles) {
    
    console.log("http://localhost:8080/api/ev/charge/" + stateSelectElement.value)
    
    fetch("http://localhost:8080/api/ev/charge/" + stateSelectElement.value, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then(response => response.json())
    .then(returned => userChargeObj = returned)
    .catch(error => console.log(error))
    
    
    fetch("http://localhost:8080/api/electricVehicles/compare/" + priceRange, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(response => response.json())
        .then(evResponse => displayEVs(evResponse, userVehicle, userStateObj, weeklyMiles, userChargeObj))
        .catch(error => console.log(error))
}


const displayEVs = function (allEVs, userVehicle,userStateObj,weeklyMiles,userChargeObj) {

    const mainContent = document.querySelector(".main-content")
    clearChildren(mainContent)

    //generate the user vehicle DIV
    //this will be appended to main-content DIV
    const userVehicleInfoDiv = document.createElement("div")
    userVehicleInfoDiv.classList.add("user-vehicle-info")

    const compareGridElement = document.createElement("div")
    compareGridElement.classList.add("compare-grid")

    userVehicleInfoDiv.appendChild(compareGridElement)

    const userVehicleElement = document.createElement("div")
    userVehicleElement.classList.add("user-vehicle")
    compareGridElement.appendChild(userVehicleElement)

    const userVehicleStatsDiv = document.createElement("div")
    userVehicleStatsDiv.classList.add("user-vehicle__list-stats")
    userVehicleElement.appendChild(userVehicleStatsDiv)

    const userVehicleTitle = document.createElement("h1")
    userVehicleTitle.innerHTML = 'Comparing:<br> 2012 Ford F-150'
    userVehicleStatsDiv.appendChild(userVehicleTitle)

    const userVehicleMsrp = document.createElement("h2")
    userVehicleMsrp.innerText = 'MSRP: $' + userVehicle.msrp
    userVehicleStatsDiv.appendChild(userVehicleMsrp)

    const userVehicleMGP = document.createElement("h2")
    userVehicleMGP.innerText = 'Avgerage MPG: ' + userVehicle.mpg
    userVehicleStatsDiv.appendChild(userVehicleMGP)

    const userStateGasPrice = document.createElement("h2")
    userStateGasPrice.innerText = userStateObj.state + "'s Average Gas Price: $" + userStateObj.pricePerGal + ' per gallon'
    userVehicleStatsDiv.appendChild(userStateGasPrice)

    const galPerMonth = (weeklyMiles / userVehicle.mpg) * 4
    const monthlyGasCost = parseInt(galPerMonth * userStateObj.pricePerGal)
    const yearlyGasCost = monthlyGasCost * 12
    
    const userWeeklyMiles = document.createElement("h2")
    userWeeklyMiles.innerText = 'Your Annual Gas Cost: $' + yearlyGasCost
    userVehicleStatsDiv.appendChild(userWeeklyMiles)
    


    //console.log(userChargeObj)
    //console.log(userStateObj)
 
    

    //loop through EVs creating grid items
    for (let i = 1; i < 5; i++) {


        const evDivElement = document.createElement("div")
        evDivElement.classList.add('ev' + i)
        compareGridElement.appendChild(evDivElement)


            const evTitle = document.createElement("h2")
            evTitle.innerText = allEVs[i].modelName
            evDivElement.appendChild(evTitle)


            const evImageElement = document.createElement("img")
            evImageElement.setAttribute("id", "vehicle1")
            evImageElement.setAttribute("src", allEVs[i].imageUrl)
            evImageElement.setAttribute("width", "100%")
            evDivElement.appendChild(evImageElement)

            const paraMsrpElement = document.createElement("p")
            evDivElement.appendChild(paraMsrpElement)

                    const evMSRP = document.createElement("span")
                    evMSRP.classList.add("compare-stat-one")
                    evMSRP.innerText = 'MSRP: $' + allEVs[i].msrp
                    paraMsrpElement.appendChild(evMSRP)

                    paraMsrpElement.appendChild(document.createElement("br"))

                    const iceMSRP = document.createElement("span")
                    var msrpCostDiff = allEVs[i].msrp - userVehicle.msrp
                    var isMsrpNeg = Boolean(msrpCostDiff > 0)
                    if (isMsrpNeg) {
                        iceMSRP.classList.add("compare-stat-minus")
                        iceMSRP.innerText = '$' + msrpCostDiff + ' over your vehicle'

                    } else {
                        iceMSRP.classList.add("compare-stat-plus")
                        iceMSRP.innerText = '$ ' + msrpCostDiff + ' under your vehicle'
                    }

                    paraMsrpElement.appendChild(iceMSRP)

            const evMPGElement = document.createElement("p")
            evDivElement.appendChild(evMPGElement)
                    
                    const evRange = parseInt(allEVs[i].range)
                    const userYearlyMiles = weeklyMiles * 52
                    const numOfChargesPerYear = userYearlyMiles / evRange
                    const chargeCost = numOfChargesPerYear * userChargeObj.costPerHomeCharge
            
            
                    const evMPG = document.createElement("span")
                    evMPG.classList.add("compare-stat-one")
                    evMPG.innerText = 'Yearly Charge Costs: $' + Math.round(chargeCost)
                    evMPGElement.appendChild(evMPG)

                    evMPGElement.appendChild(document.createElement("br"))

                    const gasSavings = yearlyGasCost - chargeCost
                    const iceMPG = document.createElement("span")
                    iceMPG.classList.add("compare-stat-plus")
                    iceMPG.innerText = 'You would save $' + Math.round(gasSavings) + ' per year'
                    evMPGElement.appendChild(iceMPG)


            
            evDivElement.appendChild(document.createElement("hr"))

            const paraTotalsElement = document.createElement("p")
            evDivElement.appendChild(paraTotalsElement)

            const msrpDiffElement = document.createElement("h2")
            paraTotalsElement.appendChild(msrpDiffElement)
            msrpDiffElement.innerText = 'Cost Difference: $' + msrpCostDiff

    }


    mainContent.appendChild(userVehicleInfoDiv)
}