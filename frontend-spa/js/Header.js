// Displays header 
const displayHeader = function () {
    const header = document.createElement("header");
    header.classList.add("header-container");
    header.innerHTML = '<nav class="nav-bar"><ul><li class="website-title"><h1>Compar<span>EV</span><h1></li><li class="nav-buttons"><a href="index.html">Home</a></li><li class="nav-buttons"><a href="vehicle-prototype.html">Vehicles</a></li><li class="nav-buttons"><a href="article-prototype.html">Articles</a></li><li class="nav-buttons"></li><a href="">Contacts</a></li></ul></nav>'
    return header;
}

export { displayHeader }


{/* <header class="header-container">
    <nav class="nav-bar">
        <ul>
            <li class="website-title">
                <h1>Compar<span>EV</span></h1>
            </li>
            <li class="nav-buttons"><a href="index.html">Home</a></li>
            <li class="nav-buttons"><a href="vehicle-prototype.html">Vehicles</a></li>
            <li class="nav-buttons"><a href="article-prototype.html">Articles</a></li>
            <li class="nav-buttons"></li><a href="">Contacts</a></li>
        </ul>
    </nav>
</header > */}