var numBox = document.getElementById("numBox");
var check = document.getElementById("check");
check.addEventListener("click", function(){
    if(numBox.value != ""){
        var number = parseInt(numBox.value);
        if(number < 2){ //handles 0, 1, and negatives which are not prime.
            alert(`${number} is not prime.`)
        } else{
            var factors = [1,number] //a prime number only has 2 factors. 1 and itself
            for(let i = number - 1; i > 1; i--){ //count down from the base number and check every number for divisibility
                if(number % i == 0){ //add to factors list if it's divisible
                    factors.splice(1,0,i)
                }
            }

            if (factors.length > 2){
                alert(`${number} is not prime. It has the following factors: ${factors}.`)
            }else{
                alert(`${number} is prime!`)
            }
        }
    }
});
