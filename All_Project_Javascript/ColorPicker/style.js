document.addEventListener("DOMContentLoaded",function(){
    const colorbox = document.getElementById("colorbox");
    const colorbutton = document.getElementById("colorbutton")
    const colorcode = document.getElementById("colorcode");

    function getRandomColor(){
        const letters = '0123456789ABCDEF';
        let color = '#'
        for(let i= 0 ; i<6;i++){
            color += letters[Math.floor(Math.random() * 16)];
        }
        return color;
    }
    colorbutton.addEventListener("click",function(){
        const newcolor = getRandomColor();
        
        colorbox.style.backgroundColor = newcolor;
        colorcode.textContent = newcolor;
        
    })
    
})