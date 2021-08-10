fetch("http://localhost:8080/api/ice/years")
    .then(response => response.json())
    .then(years => genYears(years))
    .catch(error => console.log(error))


const genYears = function (years) {

    //clear year options
    const yearSelectElement = document.querySelector("#years")
    clearChildren(yearSelectElement)

    //add default blank line option
    const defaultOption = document.createElement("option")
    defaultOption.setAttribute("value", "----")
    defaultOption.innerText = '----'
    yearSelectElement.appendChild(defaultOption)

    //loop to generate options for all years
    years.forEach((year) => {
        const newOptionElement = document.createElement("option")
        newOptionElement.setAttribute("value", year.year)
        newOptionElement.innerText = year.year
        yearSelectElement.appendChild(newOptionElement)
    })

    yearSelectElement.addEventListener("change", () => {

        //fetch makes based on year
        //http://localhost:8080/api/ice/years/{year}

        fetch("http://localhost:8080/api/ice/years/" + yearSelectElement.value, {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json'
                }
            })
            .then(response => response.json())
            .then(makes => genMakes(makes))
            .catch(error => console.log(error))

        const testChangeElement = document.querySelector("#makes")
        const testOption = document.createElement("option")
        testOption.setAttribute("value", "Test Value")
        testOption.innerText = 'Test Value'
        testChangeElement.appendChild(testOption)

        const textUpdate = document.querySelector(".test-pop")
        textUpdate.innerText = "UPDATED! " + yearSelectElement.value

    })
}

const genMakes = function (makes) {

}

// not needed yet
// const setAttributes = function (el, attrs) {
//     for (var key in attrs) {
//         el.setAttribute(key, attrs[key]);
//     }
// }

const clearChildren = function (element) {
    while (element.firstChild) {
        element.removeChild(element.lastChild);
    }
};