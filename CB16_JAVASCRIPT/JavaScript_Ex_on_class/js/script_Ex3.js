var lang = "JavaScript";
document.write("var lang = " + lang + "<br/>");

if (lang) {
      var lang = "React.js";
      document.write("var lang = " + lang + "<br/>");
}

document.write("var lang = " + lang + "<br/>");
document.write("<hr/>");

var lang = "JavaScript";
document.write("var lang = " + lang + "<br/>");

if (lang) {
      let lang = "React.js";  //use of let
      document.write(`var lang = ${lang} <br/>`);   // modern way of writing JS
}

document.write(`var lang = ${lang} <br/>`);

const PI = 3.14;
document.write("<hr/>");

const cars = ["Fiat", "Toyota", "Citroen"];
document.write(typeof cars);

cars[0] = "BMW";
console.table(cars);

cars.push("Audi");
console.table(cars);

const autos = cars;
console.table(autos);