function Derekszog() {
    let a = parseInt(document.getElementById("aOldal").value)
    let b = parseInt(document.getElementById("bOldal").value)
    let c = parseInt(document.getElementById("cOldal").value)

    if ((a * a) + (b * b) == (c * c)) {
        document.write("Derekszögű")


    } else {
        document.write("Nem derékszög")
    }
}
function MeterAtvaltas() {
    let m = parseInt(document.getElementById("szam").value)

    document.getElementById("meterAt").innerHTML=(m + " méter egyenlő:" + '<br>' + 
    m * 3.280839895 + "ft" + '<br>' + 
    m * 3.280839895 + "ft" + '<br>' + 
    m * 0.00062137 + " mile" + '<br>' + 
    m / 1000 + " km" + '<br>' + 
    m * 1.0936133 + " yard" + '<br>' + 
    m * 39.3700787 + " inch" + '<br>')
    

}
function Masodperc() {
    let fMp = parseInt(document.getElementById("masodperc").value)

    let sec = fMp
    let hour = Math.floor(sec / 3600)
    sec = sec % 3600
    let min = Math.floor(sec / 60)
    sec = sec % 60
    document.getElementById("mp").innerHTML = "" + hour + "-" + min + "-" + sec
}
function hatszogTerulet() {
    let hatSz = parseInt(document.getElementById("hatszogT").value)
    document.getElementById("hSz").innerHTML = "Hatszög területe: " + ((3 * Math.sqrt(3)) / 2) * Math.pow(hatSz, 2)
}


