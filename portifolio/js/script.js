function mode() {
    const html = document.documentElement
    html.classList.toggle("claro")

    const img = document.querySelector(".profile img")

    if(html.classList.contains("claro"))(
        img.setAttribute("src","../")
    )

    
}