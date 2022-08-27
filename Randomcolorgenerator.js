const getcolor = () => {
    //hex code 
    const randomNumnber =Math.floor( Math.random()*16777215 );
    const randomcode = "#" + randomNumnber.toString(16);
    document.body.style.backgroundColor = randomcode;
    console.log(randomNumnber,randomcode);
    document.getElementById("color-code").innerText=randomcode;

    navigator.clipboard.writeText(randomcode);
}

// event call
document.getElementById("btn").addEventListener(
    "click",
    getcolor
)

// initial call
getcolor();