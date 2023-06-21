
//DIAGRAMA UNO
function hello() {
    console.log('hello');
}
hello();
console.log('Dojo');

// Paso 1: Declaración de la función hello()
// No se asigna ningún valor a las variables en este paso

// Paso 2: Llamada a la función hello()
// No se asigna ningún valor a las variables en este paso
// Salida: 'hello' (se muestra en la consola)

// Paso 3: Impresión del texto 'Dojo'
// No se asigna ningún valor a las variables en este paso
// Salida: 'Dojo' (se muestra en la consola)



//DIAGRAMA DOS
function hello() {
    console.log('hello');
    return 15;
}
var result = hello();
console.log('result is', result);

// Paso 1: Declaración de la función hello()
// Imprime 'hello' en la consola
// Retorna el número 15

// Paso 2: Llamada a la función hello() y asignación del resultado a la variable result

// Paso 3: Impresión del texto 'result is' seguido del valor de la variable result



//DIAGRAMA TRES
function numPlus(num) {
    console.log('num is', num);
    return num+15;
}
var result = numPlus(3);
console.log('result is', result);

// Paso 1: Declaración de la función numPlus() que toma un parámetro num
// Imprime 'num is' seguido del valor del parámetro num en la consola
// Retorna la suma de num y 15

// Paso 2: Llamada a la función numPlus() con el argumento 3 y asignación del resultado a la variable result

// Paso 3: Impresión del texto 'result is' seguido del valor de la variable result



//DIAGRAMA CUATRO
var num = 15;
console.log(num);
function logAndReturn(num2){
   console.log(num2);   
   return num2;
}
var result = logAndReturn(10);
console.log(result);
console.log(num);

// Paso 1: Declaración de la variable num y asignación del valor 15
// Paso 2: Impresión del valor de la variable num en la consola
// Paso 3: Declaración de la función logAndReturn() que toma un parámetro num2
// Paso 4: Impresión del valor del parámetro num2 en la consola
// Paso 5: Retorno del valor del parámetro num2
// Paso 6: Llamada a la función logAndReturn() con el argumento 10 y asignación del resultado a la variable result
// Paso 7: Impresión del valor de la variable result en la consola
// Paso 8: Impresión del valor de la variable num en la consola




//DIAGRAMA CINCO
function timesTwoAgain(num) {
    console.log('num is', num);
    var y = num*2;
    return y;
}
var result = timesTwoAgain(3) + timesTwoAgain(5);
console.log('result is', result);
