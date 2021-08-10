import {
    displayHeader
} from "./Header.js"

import {
    displayHomePage
} from "./body.js"

// import {
//     displayFooter
// } from "./footer.js"





const wrapper = document.querySelector(".wrapper")
wrapper.append(displayHeader());

wrapper.append(displayHomePage());

// wrapper.append(displayFooter());