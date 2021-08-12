

const displayArticle = function (article) {
    const mainElement = document.querySelector(".main-content");
    const articleElement = document.createElement("div");
    articleElement.classList.add("article-content");
    const articleTopicElement = document.createElement("h1");
    articleTopicElement.innerText = article.articleTopic;
    const articleTitleElement = document.createElement("h2");
    articleTitleElement.innerText = article.articleTitle;
    const articleImageElement = document.createElement("img");
    articleImageElement.src = article.imageUrl;
    const articleAuthorElement = document.createElement("h3");
    articleAuthorElement.innerText = article.authorName;
    const articleTextElement = document.createElement("p");
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
    form.classList.add("new-article-comment-form");
    const articleCommentInput = document.createElement("input");
    articleCommentInput.setAttribute("type", "text");
    articleCommentInput.setAttribute("placeholder", "Enter your comment...");
    

}





{/* <body>
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