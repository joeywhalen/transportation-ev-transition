import {
    displayHeader
} from "./Header.js"

import {
    displayHomeBody
} from "./body.js"

import {
    displayFooter
} from "./footer.js"





const wrapper = document.querySelector(".wrapper")
wrapper.append(displayHeader());

wrapper.append(displayHomeBody());

wrapper.append(displayFooter());

