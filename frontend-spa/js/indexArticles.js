import { clearChildren } from "./userVehicleForm.js";
import { displayArticle } from "./displayArticle.js";

const indexArticles = function (article) {
  const mainElement = document.querySelector(".articles-wrapper");
  clearChildren(mainElement);
  articles.forEach((article) => {
    let articleElement = document.createElement("div");
    articleElement.classList.add("btn-section");
    let articleTitleElement = document.createElement("h3");
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
  indexArticles
}

{/* <div class="article-section">
        
        <div class="rectangle">
            <p class="articles-title">Articles</p>
        </div> 
        <div class="articles-wrapper">
            <div class="articles-grid">
              <div class="article1">
                  <a href="/frontend-spa/single-article-prototype.html">
                    <h3>This is an article</h3>
                    <p>You can find all kinds of car related things here.</p>
                 </a>
              </div>
              <div class="article2">
                  <a href="/frontend-spa/single-article-prototype.html">
                     <h3>This is also an article</h3>
                     <p>blah blah blah blah</p>
                 </a>
              </div>
              <div class="article3">
                  <a href="/frontend-spa/single-article-prototype.html">
                    <h3>Cars are really cool</h3>
                    <p>blahhhhhhhhhhh</p>
                 </a>
              </div>
              <div class="article4">
                  <a href="/frontend-spa/single-article-prototype.html">
                    <h3>i love cars</h3>
                    <p>i really..... love cars </p>
                </a>
              </div>
              <div class="article5">
                  <a href="/frontend-spa/single-article-prototype.html">
                    <h3>This is another article</h3>
                    <p>car stuff</p>
                 </a>
            </div>
              <div class="article6">
                  <a href="/frontend-spa/single-article-prototype.html">
                    <p>cars cars cars cars carrrrs </p>
                 </a>
                </div>
            </div>
            </div>
        </div> */}