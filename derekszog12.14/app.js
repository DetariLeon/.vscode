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

    document.write(m + " méter egyenlő:" + '<br>')
    document.write(m * 3.280839895 + "ft" + '<br>')
    document.write(m * 0.00062137 + " mile" + '<br>')
    document.write(m / 1000 + " km" + '<br>')
    document.write(m * 1.0936133 + " yard" + '<br>')
    document.write(m * 39.3700787 + " inch" + '<br>')

}
function Masodperc() {
    mp = parseInt(document.getElementById("masodperc").value)
    document.write (hours = Math.floor(mp / 3600));
    document.write (minutes = Math.floor((mp % 3600) / 60));
    document.write (secs = mp % 60);
  
   
    document.write ( Math.floor(hours) + " hours, " + minutes + " minutes, " + secs + " seconds");
  }
  
