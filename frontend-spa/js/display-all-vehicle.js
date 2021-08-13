
const displayAllVehicles = function(ElectricVehicles) {
    // const body = document.body;
    // const wrapper = document.createElement("div");
    // wrapper.classList.add("wrapper");
    // body.append(wrapper);

    // const pageTitle = document.createElement("div");
    // pageTitle.classList.add("vehicle-page-title");
    // pageTitle.innerHTML = '<h1 class="title-text">Check Out Our Wide Selection of EVs</h1>'
    // body.append(pageTitle);

    // const gridContainer = document.createElement("div");
    // gridContainer.classList.add("grid-container");
    // body.append(gridContainer);

    ElectricVehicles.forEach((ElectricVehicle) => {
    const gridItem = document.createElement("div");
    gridItem.classList.add("grid-item");
    // body.append(gridItem);

    const vehicle1 = document.createElement("img");
    vehicle1.setAttribute("src", "images/2015-Chevrolet-BoltEV-Concept-exterior-001.jpg");
    vehicle1.setAttribute("id", "vehicle1");
    // gridItem.append(vehicle1);

    const textContainer = document.createElement("div");
    textContainer.classList.add("text-container");
    // gridItem.append(textContainer);

    const vehicleName = document.createElement("p");
    vehicleName.innerText =ElectricVehicle.;
    // textContainer.append(vehicleName);

    const vehiclePrice = document.createElement("p");
    vehiclePrice.innerText = "$18,000";
    // textContainer.append(vehiclePrice);

    const mPG = document.createElement("p");
    mPG.innerText = "60mpg";
    // textContainer.append(mPG);

    const exploreButton = document.createElement("button");
    exploreButton.classList.add("explore-button");
    exploreButton.innerHTML = '<button class="explore-button"><a></a>Explore</button>'
    // textContainer.append(exploreButton);


    gridItem.addEventListener("click", () => {
        displayAllVehicles(ElectricVehicle, ElectricVehicles)
    })
    body.append(gridItem);
    gridItem.append(vehicle1);
    gridItem.append(textContainer);
    textContainer.append(vehicleName);
    textContainer.append(vehiclePrice);
    textContainer.append(mPG);
    textContainer.append(exploreButton);

    })


    





}