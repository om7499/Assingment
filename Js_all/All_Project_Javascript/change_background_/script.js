


const button = document.getElementById('btn');
const body = document.querySelector('body');
const sathya = ['red', 'green', 'blue', 'yellow', 'pink', 'grey', 'lime'];

body.style.backgroundColor = 'black';



button.addEventListener('click', () => {
    const colorIndex = parseInt(Math.random() * sathya.length);
    body.style.backgroundColor = sathya[colorIndex];
    body.style.transition = '1s linear';
});
