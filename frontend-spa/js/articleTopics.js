import { displayArticle } from "./displayArticle.js";


const displayAllTopics = function (ArticleTopics) {

    const bodyElement = document.querySelector("body");

    const wrapperElement = document.createElement("div");
    wrapperElement.classList.add("wrapper");
    bodyElement.append(wrapperElement);

    ArticleTopics.forEach((ArticleTopic) => {
        const parallaxElement = document.createElement("div");
        parallaxElement.classList.add("parallax");
        // parallaxElement.src = ArticleTopic.ArticleTopicParallaxUrl;
        // parallaxElement.setAttribute("src", ArticleTopic.ArticleTopicParallaxUrl);
        // parallaxElement.setAttribute("id", ArticleTopic.id);
        bodyElement.append(parallaxElement);
        const parallaxImageElement = document.createElement("img");
        parallaxImageElement.classList.add("parallax-image");
        // parallaxImageElement.src = ArticleTopic.ArticleTopicParallaxUrl;
        parallaxImageElement.setAttribute("src", ArticleTopic.ArticleTopicParallaxUrl);
        parallaxImageElement.setAttribute("id", ArticleTopic.id);
        parallaxElement.append(parallaxImageElement);

        const parallaxTextElement = document.createElement("h1");
        parallaxTextElement.classList.add("text-over-parallax");
        parallaxTextElement.innerText = ArticleTopic.articleTopicTitle;
        bodyElement.append(parallaxTextElement);

        const topicElement = document.createElement("div");
        topicElement.classList.add("topic1");
        bodyElement.append(topicElement);

        const articleFlexElement = document.createElement("div");
        articleFlexElement.classList.add("article-flex");
        topicElement.append(articleFlexElement);

        ArticleTopic.articles.forEach((Article) => {
            const articleElement = document.createElement("div");
            articleElement.classList.add("article");
            articleFlexElement.appendChild(articleElement);

            const articleLinkElement = document.createElement("img");
            articleLinkElement.setAttribute("src", Article.imageUrl);
            articleLinkElement.setAttribute("id", Article.id);
            articleElement.appendChild(articleLinkElement);

            const articleTitleElement = document.createElement("p");
            articleTitleElement.innerText = Article.articleTitle;
            articleElement.appendChild(articleTitleElement);
            articleLinkElement.addEventListener("click", (clickEvent) => {
                clickEvent.preventDefault;
                displayArticle(Article)
            });
        
        })
    })

    // const parralaxOneElement = document.createElement("div");
    // parralaxOneElement.classList.add("parallax-one");
    // parralaxOneElement.innerHTML = '<h1 class="text-over-parallax">Why We Should Transition To EVs</h1>'
    // bodyElement.append(parralaxOneElement);

    // const topicOneElement = document.createElement("div");
    // topicOneElement.classList.add("topic1");
    // bodyElement.append(topicOneElement);

    // const articleFlexElement = document.createElement("div");
    // articleFlexElement.classList.add("articleFlex");
    // bodyElement.append(articleFlexElement);

    // ArticleTopics.forEach((Article) => {
    //     const articleElement = document.createElement("div");
    //     articleElement.classList.add("article");
    //     articleFlexElement.appendChild(articleElement);

    //     const articleLinkElement = document.createElement("img");
    //     articleLinkElement.setAttribute("src", Article.imageUrl);
    //     articleLinkElement.setAttribute("id", Article.id);
    //     articleFlexElement.appendChild(articleLinkElement);

    //     const articleTitleElement = document.createElement("p");
    //     articleTitleElement.innerText = Article.articleTitle;
    //     articleFlexElement.appendChild(articleTitleElement);
        
    // })
}
export {
    displayAllTopics
}

//  <body>
//  <div class="wrapper"></div>
//     <!-- topic1 -->
//    <div class="parallax-one">
//        <h1 class="text-over-parallax">Why We Should Transition To EVs</h1>
//    </div>
//    <div class="topic1">
//     <div class="article-flex">
//         <div class="article">
//             <a href="single-article-prototype.html"><img src="images/blog-article1.gif"></a>
//             <p>No More Road Accidents </p>      
//         </div>
//         <div class="article">
//             <a href="single-article-prototype.html"><img src="images/blog-article2.png"></a>
//             <p>Consider Switching Now...</p>
//         </div>
//     </div>
//    </div>

//    <!-- topic2 -->

//    <div class="parallax-two">
//         <h1 class="text-over-parallax">How To Charge At Home And On The Road</h1>
//    </div>

//    <div class="topic2">
//     <div class="article-flex">
//         <div class="article">
//             <a href="single-article-prototype.html"><img src="images/blog-article3.webp"></a>
//             <p>Charge your Ev At Home... </p>
//         </div>

//         <div class="article">
//             <a href="single-article-prototype.html"><img src="images/blog-article4.png"></a>
//             <p>OR on The Road </p>
//         </div>
//     </div>
//    </div>

//    <!-- topic3 -->

//    <div class="parallax-three">
//         <h1 class="text-over-parallax">Electric Vehicles - Separating Fact From Fiction</h1>
//    </div>

//    <div class="topic3">
//     <div class="article-flex">
//         <div class="article">
//            <a href="single-article-prototype.html"><img src="images/blog-article5.jpg"></a>
//            <p>Know Your Facts</p>
//         </div>

//         <div class="article">
//             <a href="single-article-prototype.html"><img src="images/blog-article6.png"></a>
//             <p>Don't Be Misled</p>
//         </div>
//     </div>
//    </div>
//  </body>

// // const displayTopicOneArticles = function (articleTopic) {
// const displayAllTopics = function (articleTopic) {    
//     const mainElement = document.querySelector(".article-flex");
//     clearChildren(mainElement);
//     articleTopic.forEach((article) => {
//         let articleElement = document.createElement("div");
//         articleElement.classList.add("btn-section");
//         let articleTitleElement = document.createElement("p");
//         articleTitleElement.innerText = article.articleTitle;
//         let articleLinkElement = document.createElement("a");
//         let articleImageElement = document.createElement("img");
//         articleImageElement.src = article.imageUrl;

//         articleLinkElement.addEventListener("click", (clickEvent) => {
//             displayArticle(article)
//         });
//         articleLinkElement.appendChild(articleImageElement);
//         articleElement.appendChild(articleTitleElement);
//         articleElement.appendChild(articleLinkElement);
//         mainElement.appendChild(articleElement);
//     });
//     return mainElement;
// }
// export {
//     displayAllTopics
// }