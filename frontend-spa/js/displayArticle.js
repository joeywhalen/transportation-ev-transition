import { displayAllTopics } from "./articleTopics.js";

fetch("http://localhost:8080/api/articles")
    .then(response => response.json())
    .then(article => displayArticle(article))
    .catch(error => console.log(error))

const clearChildren = function (element) {
    while (element.firstChild) {
        element.removeChild(element.lastChild);
    }
}

const displayArticle = function (article) {
    const mainElement = document.querySelector(".main-content");
    // clearChildren(mainElement);
    const articleElement = document.createElement("div");
    articleElement.classList.add("article-content");
    const articleTopicElement = document.createElement("h1");
    articleTopicElement.innerText = article.articleTopic;
    // const articleImageElement = document.createElement("img");
    const articleImageElement = document.querySelector(".single-article-img");
    articleImageElement.src = article.imageUrl;
    const articleTitleElement = document.createElement("h2");
    articleTitleElement.innerText = article.articleTitle;
    const articleAuthorElement = document.createElement("h3");
    articleAuthorElement.innerText = article.authorName;
    // const articleTextElement = document.createElement("p");
    const articleTextElement = document.querySelector(".single-article-content");
    articleTextElement.innerText = article.articleContent;
    const articleCommentsNotationElement = document.createElement("article-comments");
    articleCommentsNotationElement.classList.add("article-comments-notation");
    articleCommentsNotationElement.innerText = "Comments: ";

    articleElement.appendChild(articleTopicElement);
    articleElement.appendChild(articleTitleElement);
    articleElement.appendChild(articleImageElement);
    articleElement.appendChild(articleAuthorElement);
    articleElement.appendChild(articleTextElement);
    articleElement.appendChild(articleCommentsNotationElement);

    if (article.articleComments !== null && article.articleComments.length !== 0) {
        article.articleComments.forEach((articleComment) => {
            let articleCommentsElement = document.createElement("section");
            articleCommentsElement.classList.add("article-comments-section");
            let singleArticleCommentElement = document.createElement("p");
            singleArticleCommentElement.innerText = articleComment;
            articleCommentsElement.appendChild(singleArticleCommentElement);
            articleElement.appendChild(articleCommentsElement);
        });
    }

    const form = document.createElement("form");
    form.classList.add("new-comment-form");
    const articleCommentInput = document.createElement("input");
    articleCommentInput.setAttribute("type", "text");
    articleCommentInput.setAttribute("placeholder", "Enter your comment...");
    const submitArticleCommentButton = document.createElement("button");
    submitArticleCommentButton.classList.add("comment-button");
    submitArticleCommentButton.innerText = "Submit a comment";

    form.appendChild(articleCommentInput);
    form.appendChild(submitArticleCommentButton);
    articleElement.appendChild(form);

    submitArticleCommentButton.addEventListener("click", (clickEvent) => {
        clickEvent.preventDefault();
        const articleElement = document.querySelector(".article-content");
        clearChildren(articleElement);
        if (articleCommentInput.value !== "") {
            const json = JSON.stringify(articleCommentInput.value);
            const unqoutedJson = json.replace(/\"/g, "");
            fetch("http://localhost:8080/api/articleTopics/" + article.articleTopicId + "/articles/" + article.id + "/comments", {
                method: "PATCH",
                headers: {
                    'Content-Type': 'application/json'
                },
                body: unqoutedJson
            })
                .then(response => response.json())
                .then(article => displayArticle(article))
                .catch(error => console.log(error));
        }
    })

    mainElement.appendChild(articleElement);

    return mainElement;
}
export {
    displayArticle
}

{/* <div class="main-content">
        <img class="single-article-img"
            src="https://www.zerohedge.com/s3/files/inline-images/2019-07-21_13-21-38.png?itok=NQxqZjHQ">
        <h1 class="single-article-title">
            <font color="green">Electric Vehicle Benefits and</font>
            <font color="orange">Considerations</font>
        </h1>
        <h3 class="single-article-author"> By Jackie Brown</h3>
        <hr class="single-article-line" width="900px" size="5px" color="black">
        <p class="single-article-content">
            Lorem ipsum dolor sit amet, consectetur adipisicing elit.
            Officia laborum amet quia excepturi et totam ex suscipit alias?
            Tempore exercitationem necessitatibus quam quae error repellat quisquam totam ratione
            reprehenderit odit illo fugiat expedita,
            ducimus ab amet tenetur perspiciatis ut voluptas aperiam, deserunt sunt nemo accusantium
            nihil consequuntur? Dignissimos,
            porro rem! Ducimus temporibus iure, odio officiis reiciendis id vero rem aliquid? Vitae
            quaerat ipsum blanditiis aliquid adipisci nobis,
            accusamus necessitatibus illum commodi. Voluptate odio, provident labore neque tenetur at
            molestiae ut voluptates adipisci nam est, deleniti harum,
            unde vel illo beatae quidem accusantium magnam reiciendis numquam autem! Repellat quis
            delectus quas.
            Lorem ipsum dolor sit amet, consectetur adipisicing elit.
            Officia laborum amet quia excepturi et totam ex suscipit alias?
            Tempore exercitationem necessitatibus quam quae error repellat quisquam totam ratione
            reprehenderit odit illo fugiat expedita,
            ducimus ab amet tenetur perspiciatis ut voluptas aperiam, deserunt sunt nemo accusantium
            nihil consequuntur? Dignissimos,
            porro rem! Ducimus temporibus iure, odio officiis reiciendis id vero rem aliquid? Vitae
            quaerat ipsum blanditiis aliquid adipisci nobis,
            accusamus necessitatibus illum commodi. Voluptate odio, provident labore neque tenetur at
            molestiae ut voluptates adipisci nam est, deleniti harum,
            unde vel illo beatae quidem accusantium magnam reiciendis numquam autem! Repellat quis
            delectus quas.
        </p>
        <hr class="single-article-line" width="900px" size="5px" color="black">
    </div>
    
    <body>
    <h1 class="single-article-topic">Why We Should Transition To EVs</h1>
    <h2 class="single-article-title"> Electric Vehicle Benefits and Considerations</h2>
    <img class="single-article-img"
        src="https://www.zerohedge.com/s3/files/inline-images/2019-07-21_13-21-38.png?itok=NQxqZjHQ">
    <h3 class="single-article-author"> By: Jackie Brown<h3>
            <p class="single-article-content">Lorem ipsum dolor sit amet consectetur adipisicing elit.
                Facere soluta beatae porro provident ut rerum quas quae maxime ex doloribus eligendi aspernatur,
                distinctio at neque iusto asperiores velit consequatur et!
            <p>
</body> */}