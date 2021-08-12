

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