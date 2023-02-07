function vizsgal() {
    var szoveg = document.getElementById("name").value
    document.getElementById("ideir").innerHTML = szoveg



}
function validateEmail() {
    var email = document.getElementById("email").value

    if (email.length >= 5 && email.includes('@') && email.includes('.')) {
        document.getElementById("EmailIfValid").innerHTML = "Jó"
    } else {
        document.getElementById("EmailIfValid").innerHTML = "Nem jo"
    }


    var regex = /^[^@]+@[^.]+\.[a-z]+$/i;
    console.log(regex.test(email) && email.length >= 5)
}
function felhasznalonev() {
    var nev = document.getElementById("Fnev").value
    document.getElementById("felhasznalonev").innerHTML = nev
}
