const genYears = function (years) {

    //clear year options
    const yearSelectElement = document.querySelector("#years")
    clearChildren(yearSelectElement)

    //add default blank line option
    const defaultOption = document.createElement("option")
    defaultOption.setAttribute("value","----")
    defaultOption.innerText = '----'
    yearSelectElement.appendChild(defaultOption)

    //loop to generate options for all years
    years.forEach((year) => {
        const newOptionElement = document.createElement("option")
        newOptionElement.setAttribute("value", year.year)
        newOptionElement.innerText = year.year
        yearSelectElement.appendChild(newOptionElement)
    })
}

const genMakes = function(makes) {
    
}

const setAttributes = function (el, attrs) {
    for (var key in attrs) {
        el.setAttribute(key, attrs[key]);
    }
}

const clearChildren = function (element) {
    while (element.firstChild) {
        element.removeChild(element.lastChild);
    }
};

export {
    genYears,
    clearChildren
}