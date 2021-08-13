import { clearChildren } from "./userVehicleForm.js";
import { displayArticle } from "./displayArticle.js";

const displayTopicOneArticles = function (articleTopic) {
    const mainElement = document.querySelector(".article-flex");
    clearChildren(mainElement);
    articleTopic.forEach((article) => {
        let articleElement = document.createElement("div");
        articleElement.classList.add("btn-section");
        let articleTitleElement = document.createElement("p");
        articleTitleElement.innerText = article.articleTitle;
        let articleLinkElement = document.createElement("a");
        let articleImageElement = document.createElement("img");
        articleImageElement.src = article.imageUrl;

        articleLinkElement.addEventListener("click", (clickEvent) => {
            displayArticle(article)
        });
        articleLinkElement.appendChild(articleImageElement);
        articleElement.appendChild(articleTitleElement);
        articleElement.appendChild(articleLinkElement);
        mainElement.appendChild(articleElement);
    });
    return mainElement;
}
export {
    displayTopicOneArticles
}



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