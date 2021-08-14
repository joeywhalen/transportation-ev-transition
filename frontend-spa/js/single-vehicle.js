const displaySingleEV = function (ElectricVehicle) {    

    const body = document.querySelector(".svBody");

    const wrapper = document.createElement("div");
    wrapper.classList.add("wrapper");
    body.append(wrapper);


ElectricVehicle.forEach((ElectricVehicle) => {

    // ----------------------car image section-------------------------

    const carImage = document.createElement("div");
    carImage.classList.add("car-image");
    carImage.setAttribute("url", ElectricVehicle.imageUrl);
    body.append(carImage);

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

    const listElement1 = document.createElement("li");
    listElement1.innerText = ElectricVehicle.makeName;
    basicInfoText.append(listElement1);

    const listElement2 = document.createElement("li");
    listElement2.innerText = ElectricVehicle.modelName;
    basicInfoText.append(listElement2);

    const listElement4 = document.createElement("li");
    listElement4.innerText = ElectricVehicle.range;
    basicInfoText.append(listElement4);

    const listElement5 = document.createElement("li");
    listElement5.innerText = ElectricVehicle.mpgE;
    basicInfoText.append(listElement5);

    const listElement6 = document.createElement("li");
    listElement6.innerText = ElectricVehicle.zeroToSixty;
    basicInfoText.append(listElement6);

    const listElement7 = document.createElement("li");
    listElement7.innerText = ElectricVehicle.topSpeed;
    basicInfoText.append(listElement7);

    const listElement8 = document.createElement("li");
    listElement8.innerText = ElectricVehicle.wheelDrive;
    basicInfoText.append(listElement8);

    const listElement9 = document.createElement("li");
    listElement9.innerText = ElectricVehicle.homeCharge;
    basicInfoText.append(listElement9);

    const listElement10 = document.createElement("li");
    listElement10.innerText = travelCharge;
    basicInfoText.append(listElement10);

    const listElement11 = document.createElement("li");
    listElement11.innerText = autonomous;
    basicInfoText.append(listElement11);

    const listElement12 = document.createElement("li");
    listElement12.innerText = ElectricVehicle.safetyRating;
    basicInfoText.append(listElement12);

    const listElement13 = document.createElement("li");
    listElement13.innerText = ElectricVehicle.phoneKey;
    basicInfoText.append(listElement13);

    // standard equipment section -----------

    const center = document.createElement("center");
    const coloredRectangle = document.createElement("div");
    coloredRectangle.setAttribute("id", "colored-rectangle");
    detailsSection.append(center);

    const standardEquipSection = document.createElement("div");
    standardEquipSection.classList.add("standard-equip-section");
    standardEquipSection.innerHTML = '<h5 class="standard-equip-title">Standard Equipment</h5>';
    detailsSection.append(standardEquipSection);

    const standardEquipText = document.createElement("ul");
    standardEquipText.classList.add("standrd-equip-text");
    standardEquipSection.append(standardEquipText);

    const listItem1 = document.createElement("li");
    listItem1.innerText = ElectricVehicle.seating;
    standardEquipText.append(listItem1);

    const listItem2 = document.createElement("li");
    listItem2.innerText = ElectricVehicle.driverAssist;
    standardEquipText.append(listItem2);

    const listItem3 = document.createElement("li");
    listItem3.innerText = ElectricVehicle.freeOtaUpdate;
    standardEquipText.append(listItem3);

    const listItem4 = document.createElement("li");
    listItem4.innerText = ElectricVehicle.rearCargoSpace;
    standardEquipText.append(listItem4);

    const listItem5 = document.createElement("li");
    listItem5.innerText = ElectricVehicle.frunkSpace;
    standardEquipText.append(listItem5);

    // price details section -------------

    const center = document.createElement("center");
    const coloredRectangle = document.createElement("div");
    coloredRectangle.setAttribute("id", "colored-rectangle");
    detailsSection.append(center);

    const priceDetailsSection = document.createElement("div");
    priceDetailsSection.classList.add("price-details-section");
    priceDetailsSection.innerHTML = '<h5 class="price-details-title">Price Details</h5>';
    detailsSection.append(priceDetailsSection);

    const priceDetailsText = document.createElement("ul");
    priceDetailsText.classList.add("price-details-text");
    priceDetailsSection.append(priceDetailsText);

    const listOne = document.createElement("li");
    listOne.innerText = ElectricVehicle.msrp;
    priceDetailsText.append(listOne);

    const listTwo = document.createElement("li");
    listTwo.innerText = ElectricVehicle.taxCredit;
    priceDetailsText.append(listTwo);

    const listThree = document.createElement("li");
    listThree.innerText = ElectricVehicle.yearlyMaintenanceCost;
    priceDetailsText.append(listThree);


    
})
    


}

export {
    displaySingleEV
}
