function szamol() {
    var evszam = document.getElementById("evszamok").value
    var T = evszam
    var A = T % 19
    var B = T % 4
    var C = T % 7
    var D = ((19 * A) + 24) % 30
    var E = (2 * B + 4 * C + 6 * D + 5) % 7
    var H = 22 + D + E
    var datumhusvet = ""
    if(E == 6&& D == 29)H=50;
    else if(E == 6&& D == 28 && A >10)H=49;
    else{
        H = 22 + D + E;
    }
    if (H <= 31) {
        datumhusvet = "Március"
    }
    else {
        H = H - 31
        datumhusvet = "Április"
    }
    document.getElementById("eredmeny").innerHTML = "Húsvét dátuma: " + datumhusvet + " " + H

}