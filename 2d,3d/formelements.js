function valasz() {
    var kivalsztott = document.getElementById("markak");
    var autovalasztek = kivalsztott.options[kivalsztott.selectedIndex].value;
    var autoText = kivalsztott.options[kivalsztott.selectedIndex].text;
    document.getElementById("valasz").innerHTML = ("A válasz: " + autovalasztek);
    document.getElementById("valasz").innerHTML = ("A válasz: " + autoText);
    return false
}
function valaszt() {
    var selectedOption = document.querySelector('input[name="evszak"]:checked').value;
    console.log(selectedOption);
    document.getElementById("valasz").innerHTML = "A kiválasztott évszak a " + selectedOption;
    return false;
}