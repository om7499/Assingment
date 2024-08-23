let userScore = 0;// track user score
let compscore = 0;// track comp score

const choices = document.querySelectorAll(".choice");
const msg = document.querySelector("#msg")

const userScorepara = document.querySelector("#user") ;
const compScorepara = document.querySelector("#computer") 

//use this function for genrate random option
const gencompchoice = ()=>{
    const options = ["rock","papaer","scissor"]
    const randTdx = Math.floor(Math.random()*3)
    return options[randTdx];
}

const drawGame = ()=>{//when drow
   // console.log("game was draw.");
    msg.innerText = "game was draw.Play again"
    msg.style.background ="rgb(10, 4, 46)"
}

const showwinner = (userwin,userchoice,compchoice)=>{
    if(userwin){//when user win
        userScore ++;
        userScorepara.innerText=userScore;
       // console.log("you win!");
        msg.innerText = `You win! Your ${userchoice} beats ${compchoice}`
        msg.style.background ="green"
    }
    else{
        compscore++;//when comp win
        compScorepara.innerText = compscore;
       // console.log("You loss")
        msg.innerText = `You loss ${compchoice} beats Your ${userchoice}`
        msg.style.background ="red"
    }
}

const playGame = (userchoice)=>{
   console.log("user choice = ",userchoice)
   //computer choice
   const compchoice = gencompchoice();
   console.log("computer choice = ",compchoice)


   //we can use this function for fight user and comp 
   if(userchoice === compchoice){
    //draw game
    drawGame();
}else{
    let userwin = true;
    if(userchoice === rock){
        //scisser,paper
        userwin = compchoice === "paper" ? false : true ;

    }
    else if(userchoice === "paper"){
        //rock ,scissor
        userwin = compchoice === "scissor"? false : true ;
    }
    else{
        // rock,paper
        userwin = compchoice === "rock" ? false : true;
    }
    //finaly we can show our winner
    showwinner(userwin,userchoice,compchoice);
}
   
}

// add event lisner for allchoise
choices.forEach((choice)=>{
    choice.addEventListener("click",()=>{
        const userchoice = choice.getAttribute("id")
       console.log("choice was clicked",userchoice)
       playGame(userchoice);
    })
})