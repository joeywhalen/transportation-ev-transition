import { displayHeader } from "./Header.js";

const clearChildren = function (element) {
    while (element.firstChild) {
        element.removeChild(element.lastChild);
    }
}

const displaySingleEV = function (ElectricVehicle) {

    const body = document.querySelector("body");
    clearChildren(body);
    body.append(displayHeader());
    const wrapper = document.createElement("div");
    wrapper.classList.add("wrapper");
    body.append(wrapper);

    // ----------------------car image section-------------------------

    const mainElement = document.createElement("div");
    mainElement.classList.add("main-content");
    body.append(mainElement);

    const carImage = document.createElement("div");
    carImage.classList.add("car-image");
    carImage.setAttribute("src", ElectricVehicle.imageUrl);
    mainElement.append(carImage);

    const imageText = document.createElement("div");
    imageText.classList.add("car-image-text");
    carImage.append(imageText);

    const backToResults = document.createElement("div");
    backToResults.classList.add("back-to-results");
    backToResults.innerHTML = '<a href="/frontend-spa/vehicle-prototype.html"><h5 id="back"><i class="arrow"></i>Back to Results</h5></a>';
    imageText.append(backToResults);

    const carMake = document.createElement("div");
    carMake.classList.add("car-make");
    carMake.innerText = ElectricVehicle.makeName;
    imageText.append(carMake);

    const carModel = document.createElement("div");
    carModel.classList.add("car-model");
    carModel.innerText = ElectricVehicle.modelName;
    imageText.append(carModel);

    const carPrice = document.createElement("div");
    carPrice.classList.add("car-price");
    carPrice.innerText = ElectricVehicle.msrp;
    imageText.append(carPrice);

    const carMileage = document.createElement("div");
    carMileage.classList.add("car-mileage");
    carMileage.innerText = ElectricVehicle.mpgE;
    imageText.append(carMileage);

    // ---------------------white details section-------------------------

    const detailsSection = document.createElement("div");
    detailsSection.classList.add("details-section");
    mainElement.append(detailsSection);

    const center = document.createElement("center");
    const coloredRectangle = document.createElement("div");
    coloredRectangle.setAttribute("id", "colored-rectangle");
    detailsSection.append(center);

    const detailsTitle = document.createElement("div");
    detailsSection.innerHTML = '<h1 class="vehicle-details-title">Vehicle Details</h1>';
    detailsSection.append(detailsTitle);

    // basic info section -----------

    const basicInfoSection = document.createElement("div");
    basicInfoSection.classList.add("basic-info-section");
    basicInfoSection.innerHTML = '<h5 class="basic-info-title">Basic Information</h5>';
    detailsSection.append(basicInfoSection);

    const basicInfoText = document.createElement("ul");
    basicInfoText.classList.add("basic-info-text");
    basicInfoSection.append(basicInfoText);

    const makeElement = document.createElement("li");
    makeElement.innerText = ElectricVehicle.makeName;
    basicInfoText.append(makeElement);

    const modelElement = document.createElement("li");
    modelElement.innerText = ElectricVehicle.modelName;
    basicInfoText.append(modelElement);

    const rangeElement4 = document.createElement("li");
    rangeElement4.innerText = "Range: " + ElectricVehicle.range + " miles";
    basicInfoText.append(rangeElement4);

    const mpgEElement = document.createElement("li");
    mpgEElement.innerText = "MPGe: " + ElectricVehicle.mpgE;
    basicInfoText.append(mpgEElement);

    const zeroElement = document.createElement("li");
    zeroElement.innerText = "0 - 60: " + ElectricVehicle.zeroToSixty + " seconds";
    basicInfoText.append(zeroElement);

    const topSpeedElement = document.createElement("li");
    topSpeedElement.innerText = "Top speed: " + ElectricVehicle.topSpeed + " mph";
    basicInfoText.append(topSpeedElement);

    const driveElement = document.createElement("li");
    driveElement.innerText = "Drive: " + ElectricVehicle.wheelDrive;
    basicInfoText.append(driveElement);

    const homeChargeElement = document.createElement("li");
    homeChargeElement.innerText = "Home charging: " + ElectricVehicle.homeCharge + " hours";
    basicInfoText.append(homeChargeElement);

    const travelChargeElement = document.createElement("li");
    travelChargeElement.innerText = "Travel charging (10% - 80%): " + ElectricVehicle.travelCharge + " minutes";
    basicInfoText.append(travelChargeElement);

    const autonomousElement = document.createElement("li");
    autonomousElement.innerText = "Autonomous?: " + ElectricVehicle.autonomous;
    basicInfoText.append(autonomousElement);

    const nhtsaElement = document.createElement("li");
    nhtsaElement.innerText = "NHTSA Rating: " + ElectricVehicle.safetyRating + "/5";
    basicInfoText.append(nhtsaElement);

    const phoneKeyElement = document.createElement("li");
    phoneKeyElement.innerText = "Phone as key?: " + ElectricVehicle.phoneKey;
    basicInfoText.append(phoneKeyElement);

    // standard equipment section -----------

    const centerTwo = document.createElement("center");
    const coloredRectangleTwo = document.createElement("div");
    coloredRectangleTwo.setAttribute("id", "colored-rectangle");
    detailsSection.append(centerTwo);

    const standardEquipSection = document.createElement("div");
    standardEquipSection.classList.add("standard-equip-section");
    standardEquipSection.innerHTML = '<h5 class="standard-equip-title">Standard Equipment</h5>';
    detailsSection.append(standardEquipSection);

    const standardEquipText = document.createElement("ul");
    standardEquipText.classList.add("standrd-equip-text");
    standardEquipSection.append(standardEquipText);

    const seatingItem = document.createElement("li");
    seatingItem.innerText = "Seating: " + ElectricVehicle.seating + " adults";
    standardEquipText.append(seatingItem);

    const driverAssistItem = document.createElement("li");
    driverAssistItem.innerText = "Driver assist?: " + ElectricVehicle.driverAssist;
    standardEquipText.append(driverAssistItem);

    const freeOtaItem = document.createElement("li");
    freeOtaItem.innerText = "Free Over the Air Updates?: " + ElectricVehicle.freeOtaUpdate;
    standardEquipText.append(freeOtaItem);

    const rearCargoItem = document.createElement("li");
    rearCargoItem.innerText = "Rear Cargo Area: " + ElectricVehicle.rearCargoSpace + " cu. in.";
    standardEquipText.append(rearCargoItem);

    const frunkItem = document.createElement("li");
    frunkItem.innerText = "Frunk Cargo Area: " + ElectricVehicle.frunkSpace + " cu. in.";
    standardEquipText.append(frunkItem);

    // price details section -------------

    const centerThree = document.createElement("center");
    const coloredRectangleThree = document.createElement("div");
    coloredRectangleThree.setAttribute("id", "colored-rectangle");
    detailsSection.append(centerThree);

    const priceDetailsSection = document.createElement("div");
    priceDetailsSection.classList.add("price-details-section");
    priceDetailsSection.innerHTML = '<h5 class="price-details-title">Price Details</h5>';
    detailsSection.append(priceDetailsSection);

    const priceDetailsText = document.createElement("ul");
    priceDetailsText.classList.add("price-details-text");
    priceDetailsSection.append(priceDetailsText);

    const msrpElement = document.createElement("li");
    msrpElement.innerText = "MSRP: $" + ElectricVehicle.msrp;
    priceDetailsText.append(msrpElement);

    const taxCreditElement = document.createElement("li");
    taxCreditElement.innerText = "Eligible for $7500 Federal Tax Credit?: " + ElectricVehicle.taxCredit;
    priceDetailsText.append(taxCreditElement);

    const maintCostElement = document.createElement("li");
    maintCostElement.innerText = "Average Annual Maintenance Cost: $" + ElectricVehicle.yearlyMaintenanceCost;
    priceDetailsText.append(maintCostElement);

    if (ElectricVehicle.reviewComments !== null && ElectricVehicle.reviewComments.length !== 0) {
        ElectricVehicle.reviewComments.forEach((reviewComment) => {
            let reviewCommentsElement = document.createElement("section");
            reviewCommentsElement.classList.add("review-comments-section");
            let singleReviewCommentElement = document.createElement("p");
            singleReviewCommentElement.innerText = reviewComment;
            reviewCommentsElement.appendChild(singleReviewCommentElement);
            priceDetailsText.appendChild(reviewCommentElement);
        });
    }

    const form = document.createElement("form");
    form.classList.add("new-comment-form");
    const reviewCommentInput = document.createElement("input");
    reviewCommentInput.setAttribute("type", "text");
    reviewCommentInput.setAttribute("placeholder", "Enter your comment...");
    const submitReviewCommentButton = document.createElement("button");
    submitReviewCommentButton.classList.add("comment-button");
    submitReviewCommentButton.innerText = "Submit a comment";

    form.appendChild(reviewCommentInput);
    form.appendChild(submitReviewCommentButton);
    priceDetailsText.appendChild(form);

    submitReviewCommentButton.addEventListener("click", (clickEvent) => {
        clickEvent.preventDefault();
        const wrapperElement = document.querySelector("wrapper");
        clearChildren(wrapperElement);
        if (reviewCommentInput.value !== "") {
            const json = JSON.stringify(reviewCommentInput.value);
            const unqoutedJson = json.replace(/\"/g, "");
            fetch("http://localhost:8080/api/electricVehicles/" + ElectricVehicle.id + "/comments", {
                method: "PATCH",
                headers: {
                    'Content-Type': 'application/json'
                },
                body: unqoutedJson
            })
                .then(response => response.json())
                .then(ElectricVehicle => displaySingleEV(ElectricVehicle))
                .catch(error => console.log(error));
        }
    })
    wrapper.appendChild(mainElement);

    return wrapper;

}

export {
    displaySingleEV
}
