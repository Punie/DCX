(function () {
'use strict';

console.log ("Hello world! o/");
var a = "lowercase";
var A = "UPPERCASE";

console.log ("a: '" + a + "' ; A: '" + A + "'");

var x;
console.log ("value : " + x + " ; type : " + typeof (x));
x = 1;
console.log ("value : " + x + " ; type : " + typeof (x));
x = "toto";
console.log ("value : " + x + " ; type : " + typeof (x));
x = true;
console.log ("value : " + x + " ; type : " + typeof (x));
x = null;
console.log ("value : " + x + " ; type : " + typeof (x));

var y = [1, 2, 3, 4, 5];
console.log (y[2]);
console.log (y[4]);

console.log (3 == "3");
console.log (3 === "3");

var b = 3;
b > 2 ? console.log ("b > 2") : console.log ("b <= 2"); // jshint ignore:line
b = 2;
b > 2 ? console.log ("b > 2") : console.log ("b <= 2"); // jshint ignore:line

var c = 0;
var count = "";
do
{
  count += c + " ";
} while (++c < 10);
console.log (count);

var txt = "";
for (var i in y)
{
  txt += i + " ";
}
console.log (txt);

function sum (a, b) { return a + b; }
console.log (sum (25, 75));

function loggin () { console.log (arguments); }
loggin(2, "toto", true, "ok", y);

// parseInt ();    =>  (string) -> int
// parseFloat ();  =>  (string) -> float
// isNaN ();       =>  == NaN ? true : false
// isFinite ();    =>  == Finite ? true : false

function divide (a, b)
{
  if (b === 0)
  {
    throw "Divide by zero";
  }

  return a / b;
}

try
{
  console.log (divide (5, 0));
}
catch (e)
{
  console.error ("Error : " + e);
}
finally
{
  console.info ("Info : divide (5, 0)");
}

}());
