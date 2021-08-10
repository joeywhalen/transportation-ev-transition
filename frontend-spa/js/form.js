const displayForm = function () {
    const parallax = document.createElement("div");
    parallax.classList.add("parallax");

    const topSecton = document.createElement("div");
    topSecton.classList.add("top-section");

    const formBox = document.createElement("div");
    formBox.classList.add("form-box");
    const formQuestion1 = document.createElement("h1");
    formQuestion1.classList.add("example");

    const h1 = document.querySelector(".example");
    h1.textContent= "Is switching to electric right for you? Let's find out.";

    const formQuestion2 = document.createElement("h3");
    formQuestion2.classList.add("example");
    const h3 = document.querySelector(".example");
    h3.textContent= "What do you currently drive?";
    
    const carForm = document.createElement("form");
    carForm.appendChild.add("form");
    
    const userBox = document.createElement("div");
    userBox.classList.add("user-box");

    const carFormInput = document.createElement("input");
    carFormInput.setAttribute("type", "text");  
    const carLabel = document.createElement("label");
    carLabel.setAttribute("Enter Your Zipcode");

    const optionSelect = document.createElement("div");
    optionSelect.classList.add("year-make-model");
    
    const select = docuemnt.createElement("select");
    select.classList.add("drop-down");
    const option = document.createElement("option");
    const select = document.createElement("select");
    select.classList.add("drop-down");
    const option = document.createElement("option");
    const select = document.createElement("select");
    select.classList.add("drop-down");
    const option = document.createElement("option");
    
    const submitButton = document.createElement("a");
    a.href = "#";
    document.body.appendChild(a);
    const span1 = document.createElement("span");
    const span2 = document.createElement("span");
    const span3 = document.createElement("span");
    const span4 = document.createElement("span");
    submitButton.innerText = "Submit";
 

}


{/* <div class="parallax">
        <div class="top-section">
            <div class="form-box">
                <h1>Is switching to electric right for you? Let's find out.</h1>
                <h3>What do you currently drive?</h3>
                <form>
                  <div class="user-box">
                    <input type="text" name="" required="">
                    <label>Enter Your Zipcode</label>
                  </div>
                 <div class="year-make-model">    
                              <select class="drop-down"><option>Year</option></select>
                              <select class="drop-down"><option>Make</option></select>
                              <select class="drop-down"><option>Model</option></select>
                          </div>
                  <a href="#">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                    Submit
                  </a>
                </form>
              </div>
        </div>
    </div> */}
