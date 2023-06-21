//Los diagramas T de cada fragmento de codigo serán comentados debajo del codigo

//PRIMER FRAGMENTO
function muestraInformaciónContacto() {
    var auntContactInfo = ["Paula", "Smith", "Calle Principal 1234", "St. Louis", "MO", 12345];
    console.log(auntContactInfo);
}

// Una variable: 
//          auntContactInfo = ['Paula', 'Smith', 'Calle Principal 1234', 'St. Louis', 'MO', 12345]
// El console log imprime la variable que a su vez tiene todos esos valores



//SEGUNDO FRAGMENTO
function muestraListaDeCompras() {
    var produce = ["manzanas", "naranjas"];
    var frozen = ["brócoli", "helado"];
    frozen.push("croqueta de papa");
    console.log(frozen);
}
// Dos variables: produce = ["manzanas", "naranjas"]
//                frozen = ["brócoli", "helado"] 
// Despues que se ejecuta el método push a frozen se le anexa un nuevo valor
// frozen tiene un nuevo valor:
//                frozen =  ["brócoli", "helado", "croqueta de papa"]
// Se imprime frozen con el valor anexado = ["brócoli", "helado", "croqueta de papa"]



//TERCER FRAGMENTO
var movieLibrary = ["Bambi", "E.T.", "Toy Story"];
movieLibrary.push("Zoro");
movieLibrary[1] = "Beetlejuice";
console.log(movieLibrary);

// Una variable:
//         movieLibrary = ["Bambi", "E.T.", "Toy Story"]
// Despues del push se le asigna un valor al final del arreglo movieLibrary = ["Bambi", "E.T.", "Toy Story", "Zoro"]
// Luego se reemplaza el valor de la posición 1 por "Beetlejuice" movieLibrary = ["Bambi", "Beetlejuice", "Toy Story", "Zoro"]

