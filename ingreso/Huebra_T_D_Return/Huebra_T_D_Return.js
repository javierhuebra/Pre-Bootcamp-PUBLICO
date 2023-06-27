
//DIAGRAMA UNO *********************************************************************************************************************************
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



//DIAGRAMA DOS *********************************************************************************************************************************
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



//DIAGRAMA TRES *********************************************************************************************************************************
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



//DIAGRAMA CUATRO *********************************************************************************************************************************
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




//DIAGRAMA CINCO *********************************************************************************************************************************
function timesTwoAgain(num) {
    console.log('num is', num);
    var y = num*2;
    return y;
}
var result = timesTwoAgain(3) + timesTwoAgain(5);
console.log('result is', result);

// Paso 1: Declaración de la función timesTwoAgain() que toma un parámetro num
// Imprime 'num is' seguido del valor del parámetro num en la consola
// Multiplica el parámetro num por 2 y asigna el resultado a la variable y
// Retorna el valor de y

// Paso 2: Llamada a la función timesTwoAgain() con el argumento 3 y se suma el resultado con la llamada a timesTwoAgain() con el argumento 5.
// El resultado se asigna a la variable result.

// Paso 3: Impresión del texto 'result is' seguido del valor de la variable result





//FRAGMENTO SEIS *********************************************************************************************************************************
function timesTwoAgain(num) {
    console.log('num is', num);
    var y = num*2;
    return y;
}
var result = timesTwoAgain(3) + timesTwoAgain(5);
console.log('result is', result);

// Paso 1: Declaración de la función timesTwoAgain() que toma un parámetro num
// Imprime 'num is' seguido del valor del parámetro num en la consola
// Multiplica el parámetro num por 2 y asigna el resultado a la variable y
// Retorna el valor de y

// Paso 2: Llamada a la función timesTwoAgain() con el argumento 3 y se suma el resultado con la llamada a timesTwoAgain() con el argumento 5.
// El resultado se asigna a la variable result.

// Paso 3: Impresión del texto 'result is' seguido del valor de la variable result


//FRAGMENTO SIETE *********************************************************************************************************************************
function sumNums(num1, num2) {  
    return num1+num2;
 }
 console.log(sumNums(2,3))
 console.log(sumNums(3,5))
 // Paso 1 : No hay variables declaradas, solo las que ingresan a la funcion
 // La funcion declarada retorna la suma de las variables que entran en el parametro (num1 y num2)
 // Se llama dentro de un console log una primera vez a la funcion con valores 2 y 3, retorna 5 e imprime 5
 // Se llama dentro de un console log una segunda vez a la funcion con valores 3 y 5, retorna 8 e imprime 8


 //FRAGMENTO OCHO *********************************************************************************************************************************
 function printSumNums(num1, num2) {
    console.log(num1);   
    return num1+num2;
 }
 console.log(printSumNums(2,3))
 console.log(printSumNums(3,5))
//Paso 1: No hay variables mas alla de las que entran como parametro en la funcion
// Se imprime el valor de num1 dentro de la funcion
//Retorna la suma de los valores num1 y num2
//Se llama la funcion dentro de un console log con valores 2 y 3, retorna 5 e imprime 5 
//Se llama la funcion dentro de un console log con valores 3 y 5, retorna 8 e imprime 8



//FRAGMENTO NUEVE *********************************************************************************************************************************
function sumNums(num1, num2) {
    var sum = num1 + num2;
    console.log('sum is', sum);
    return sum;
}
var result = sumNums(2,3) + sumNums(3,5);
console.log('result is', result);

// La funcion recibe parametros num1 y num2
// Suma los valores de num1 y num2 y los asigna a la variable sum
// Imprime en la consola el mensaje 'sum is' seguido del valor de sum
// Retorna el valor de sum
// Llama a la función sumNums dos veces y suma los resultados, asignando el valor a la variable result
// Imprime en la consola el mensaje 'result is' seguido del valor de result




//FRAGMENTO DIEZ *********************************************************************************************************************************
function sumNums(num1, num2) {
    var sum = num1 + num2;
    console.log('sum is', sum);
    return sum;
}
var result = sumNums(2,3) + sumNums(3,sumNums(2,1)) + sumNums(sumNums(2,1),sumNums(2,3));
console.log('result is', result);

// Suma los valores de num1 y num2 y los asigna a la variable que se crea llamada sum
// Imprime en la consola el mensaje 'sum is' seguido del valor de sum
// Retorna el valor de sum
// Llama a sumNums con los argumentos (2, 3)
// Llama a sumNums con los argumentos (2, 1) y luego llama a sumNums con los argumentos (3, resultado anterior)
// Llama a sumNums con los argumentos (2, 1) y luego llama a sumNums con los argumentos (2, 3)
// Imprime en la consola el mensaje 'result is' seguido del valor de result