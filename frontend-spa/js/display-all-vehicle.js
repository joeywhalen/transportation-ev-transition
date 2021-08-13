const displayAllVehicles = function (ElectricVehicles) {


    const body = document.querySelector(".body")

    const wrapper = document.createElement("div");
    wrapper.classList.add("wrapper");
    body.append(wrapper);

    const pageTitle = document.createElement("div");
    pageTitle.classList.add("vehicle-page-title");
    pageTitle.innerHTML = '<h1 class="title-text">Check Out Our Wide Selection of EVs</h1>'
    body.append(pageTitle);


    const gridContainer = document.createElement("div");
    gridContainer.classList.add("grid-container");
    body.append(gridContainer);

    ElectricVehicles.forEach((ElectricVehicle) => {

        const gridItem = document.createElement("div");
        gridItem.classList.add("grid-item");
        gridContainer.appendChild(gridItem);

        const vehicle1 = document.createElement("img");
        vehicle1.setAttribute("src", "images/2015-Chevrolet-BoltEV-Concept-exterior-001.jpg");
        vehicle1.setAttribute("id", "vehicle1");
        gridItem.appendChild(vehicle1);

        const textContainer = document.createElement("div");
        textContainer.classList.add("text-container");
        gridItem.appendChild(textContainer);

        const vehicleName = document.createElement("p");
        vehicleName.innerText = "Vehicle Name";
        textContainer.appendChild(vehicleName);

        const vehiclePrice = document.createElement("p");
        vehiclePrice.innerText = "$18,000";
        textContainer.appendChild(vehiclePrice);

        const mPG = document.createElement("p");
        mPG.innerText = "60mpg";
        textContainer.appendChild(mPG);

        const exploreButton = document.createElement("button");
        exploreButton.classList.add("explore-button");
        exploreButton.innerText = "Explore"
        textContainer.appendChild(exploreButton);


        // gridItem.addEventListener("click", () => {


        //     displaySingleEV(ElectricVehicle)
        // })


    })

}

export {
    displayAllVehicles
}