//select all boxes
let boxes = document.querySelectorAll(".box");
let resetbtn = document.querySelector("#reset-btn");
let newbtn = document.querySelector("#new-btn");
console.log(newbtn)
let msgcontainer = document.querySelector(".msg-container");

console.log(msgcontainer)
let msg = document.querySelector("#msg");

//player-x plyaer-o
let turno = true ;

const resetgame =()=>{
 turno = true
 enableBoxes();
msgcontainer.classList.add("hide");
}

const winpatterns = [
    [0,1,2],
    [0,3,6],
    [0,4,8],
    [1,4,7],
    [2,5,8],
    [2,4,6],
    [3,4,5],
    [6,7,8]
];
boxes.forEach((box)=>{
    box.addEventListener("click",()=>{
        console.log("box was clicked");
        //box.innerText ="om"
        if(turno){
         box.innerText="o"
         turno=false;
        }else{
            box.innerText="x";
            turno = true;
        }
        box.disabled = true;

         checkwinner();
    })
})

const disableBoxes=()=>{
    for(let box of boxes){
        box.disabled = true;
    }
}

const enableBoxes=()=>{
    for(let box of boxes){
        box.disabled = false;
        box.innerText = "";
    }
}



const showwinner = (winner)=>{
  msg.innerText =`Congratulation, Winner is ${winner}`
  msgcontainer.classList.remove("hide");
  disableBoxes();
}

const checkwinner = ()=>{
  for(pattern of winpatterns){
       let pos1val= boxes[pattern[0]].innerText;
       let pos2val= boxes[pattern[1]].innerText;
       let pos3val= boxes[pattern[2]].innerText;

       if(pos1val != "" &&pos2val != "" && pos3val != ""){
         if(pos1val == pos2val && pos2val == pos3val){
            console.log("winner",pos1val)
            showwinner(pos1val);
         }
       }
  }   
}

newbtn.addEventListener("click",resetgame);
 resetbtn.addEventListener("click",resetgame);