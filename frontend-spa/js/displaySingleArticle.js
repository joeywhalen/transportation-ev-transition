import { clearChildren } from "./userVehicleForm";

const displaySingleArticle = function (article) {
    // const bodyElement = document.querySelector("body");
    // clearChildren(bodyElement);
    // window.scrollTo(0, 0);
    // const mainElement = document.createElement("div");
    // mainElement.classList.add("main-content");
    // bodyElement.append(mainElement);
    // bodyElement.append(displayHeader());
    // const articleElement = document.createElement("div");
    // articleElement.classList.add("article-content");
    // const articleTopicElement = document.createElement("h1");
    // articleTopicElement.classList.add('article-topic');
    // articleTopicElement.innerText = article.articleTopicTitle;
    // const articleImageElement = document.createElement("img");
    // articleImageElement.classList.add("single-article-img");
    // articleImageElement.src = article.imageUrl;
    // const articleTitleElement = document.createElement("h2");
    // articleTitleElement.classList.add("single-article-title");
    // articleTitleElement.innerText = article.articleTitle;
    // const articleAuthorElement = document.createElement("h3");
    // articleAuthorElement.classList.add("single-article-author");
    // articleAuthorElement.innerText = "By: " + article.authorName;
    // const articleLineElementOne = document.createElement("hr");
    // articleLineElementOne.classList.add("single-article-line");
    // const articleTextElement = document.createElement("p");
    // articleTextElement.classList.add("single-article-content");
    // articleTextElement.innerText = article.articleContent;
    // const articleLineElementTwo = document.createElement("hr");
    // articleLineElementTwo.classList.add("single-article-line");
    // const articleCommentsNotationElement = document.createElement("article-comments");
    // articleCommentsNotationElement.classList.add("article-comments-notation");
    // articleCommentsNotationElement.innerText = "Comments: ";

    // articleElement.appendChild(articleTopicElement);
    // articleElement.appendChild(articleTitleElement);
    // articleElement.appendChild(articleImageElement);
    // articleElement.appendChild(articleAuthorElement);
    // articleElement.appendChild(articleLineElementOne);
    // articleElement.appendChild(articleTextElement);
    // articleElement.appendChild(articleLineElementTwo);
    // articleElement.appendChild(articleCommentsNotationElement);

    // if (article.articleComments !== null && article.articleComments.length !== 0) {
    //     article.articleComments.forEach((articleComment) => {
    //         let articleCommentsElement = document.createElement("section");
    //         articleCommentsElement.classList.add("article-comments-section");
    //         let singleArticleCommentElement = document.createElement("p");
    //         singleArticleCommentElement.innerText = articleComment;
    //         articleCommentsElement.appendChild(singleArticleCommentElement);
    //         articleElement.appendChild(articleCommentsElement);
    //     });
    // }

    // const form = document.createElement("form");
    // form.classList.add("new-comment-form");
    // const articleCommentInput = document.createElement("input");
    // articleCommentInput.setAttribute("type", "text");
    // articleCommentInput.setAttribute("placeholder", "Enter your comment...");
    // const submitArticleCommentButton = document.createElement("button");
    // submitArticleCommentButton.classList.add("comment-button");
    // submitArticleCommentButton.innerText = "Submit a comment";

    // form.appendChild(articleCommentInput);
    // form.appendChild(submitArticleCommentButton);
    // articleElement.appendChild(form);

    // submitArticleCommentButton.addEventListener("click", (clickEvent) => {
    //     clickEvent.preventDefault();
    //     const articleElement = document.querySelector(".article-content");
    //     clearChildren(articleElement);
    //     if (articleCommentInput.value !== "") {
    //         const json = JSON.stringify(articleCommentInput.value);
    //         const unqoutedJson = json.replace(/\"/g, "");
    //         fetch("http://localhost:8080/api/articleTopics/" + article.articleTopicId + "/articles/" + article.id + "/comments", {
    //             method: "PATCH",
    //             headers: {
    //                 'Content-Type': 'application/json'
    //             },
    //             body: unqoutedJson
    //         })
    //             .then(response => response.json())
    //             .then(article => displayArticle(article))
    //             .catch(error => console.log(error));
    //     }
    // })

    // mainElement.appendChild(articleElement);
}
export {displaySingleArticle}