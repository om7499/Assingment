

document.addEventListener("DOMContentLoaded",function(){
    
    //we are store element into const variable
    const toggelswich = document.getElementById("toggelswich");
    const container = document.querySelector(".container");

    //when i click button functionwill call
    toggelswich.addEventListener("click",function(){
        //it call clsslist on we create in css
        toggelswich.classList.toggle("on");

        if(toggelswich.classList.contains("on")){
            container,style.backgroundColor = "#4caf50";
        }
        else{
            container.style.backgroundColor = "#ccc";
        }
    })
})































