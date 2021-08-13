import { displayHeader } from "./Header.js";
import { displayAllTopics } from "./articleTopics.js";
import { displayFooter } from "./footer.js";

const body = document.querySelector(".body");

body.append(displayHeader());

await fetch("http://localhost:8080/api/articleTopics")
    .then(response => response.json())
    .then(allArticleTopics => displayAllTopics(allArticleTopics))
    .catch(error => console.log(error))

body.append(displayFooter());