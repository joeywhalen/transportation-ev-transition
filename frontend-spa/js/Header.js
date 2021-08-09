// Displays header 
const displayHeader = function () {
    const header = document.createElement("header");
    header.classList.add("header-container");
    header.innerHTML = '<div class="header"><ul><li class="website-title"><h1>Compar<span>EV</span></h1></li></ul></div><input type="checkbox" class="openSidebarMenu" id="openSidebarMenu"><label for="openSidebarMenu" class="sidebarIconToggle"><div class="spinner diagonal part-1"></div><div class="spinner horizontal"></div><div class="spinner diagonal part-2"></div></label><div id="sidebarMenu"><ul class="sidebarMenuInner"><li><a href="./index.html" target="_blank">Home</a></li><li><a href="https://vanila.io" target="_blank">Vehicles</a></li><li><a href="https://instagram.com/plavookac" target="_blank">Articles</a></li><li><a href="https://twitter.com/plavookac" target="_blank">Contacts</a></li></ul></div>'
    return header;
}

export { displayHeader }

{/* <header class="header-container">

<div class="header">
    <ul>
        <li class="website-title">
            <h1>Compar<span>EV</span></h1>
        </li>
    </ul>
</div>
<input type="checkbox" class="openSidebarMenu" id="openSidebarMenu">
<label for="openSidebarMenu" class="sidebarIconToggle">
  <div class="spinner diagonal part-1"></div>
  <div class="spinner horizontal"></div>
  <div class="spinner diagonal part-2"></div>
</label>
<div id="sidebarMenu">
  <ul class="sidebarMenuInner">
    <li><a href="./index.html" target="_blank">Home</a></li>
    <li><a href="https://vanila.io" target="_blank">Vehicles</a></li>
    <li><a href="https://instagram.com/plavookac" target="_blank">Articles</a></li>
    <li><a href="https://twitter.com/plavookac" target="_blank">Contacts</a></li>
  </ul>
</div>

</header> */}