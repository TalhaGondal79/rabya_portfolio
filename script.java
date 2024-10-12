function toggleMenu() {
    var menu = document.getElementById("menu");
    if (menu.style.display === "block") {
        menu.style.display = "none";
    } else {
        menu.style.display = "block";
    }
}

function closeSite() {
    alert("Cannot close the site directly.");
}

window.onclick = function(event) {
    var menu = document.getElementById("menu");
    if (menu.style.display === "block" && !event.target.matches('.hamburger, .hamburger *')) {
        menu.style.display = "none";
    }
}

function toggleWork() {
    var workSection = document.getElementById("work-section");
    if (workSection.style.maxHeight) {
        // Collapse the section
        workSection.style.maxHeight = null;
        workSection.style.padding = "0 20px"; // Reset padding to collapse
    } else {
        // Expand the section
        workSection.style.maxHeight = workSection.scrollHeight + "px";
        workSection.style.padding = "20px 20px"; // Add padding when expanded
    }
}
