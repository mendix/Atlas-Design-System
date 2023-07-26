var nav = document.getElementsByClassName('region-topbar')[0];
var scrollableArea = document.querySelector('.mx-scrollcontainer-center .mx-scrollcontainer-wrapper');

scrollableArea.addEventListener("scroll", (event) => {
    if (scrollableArea.scrollTop > 20) {
        nav.classList.add("nav-colored");
        nav.classList.remove("nav-transparent");
    } else {
        nav.classList.add("nav-transparent");
        nav.classList.remove("nav-colored");
    }
});