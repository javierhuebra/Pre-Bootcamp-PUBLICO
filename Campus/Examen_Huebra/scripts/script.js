
//FUNCIONALIDAD 1 y 2

/* Cambia los estilos de lo que este seleccionado en la barra de navegacion
y en el footer en simultaneo */

/* Si se le da click a los li del header o del footer ambos cambian */

const itemsHeader = document.querySelectorAll('.nav')
const itemsFooter = document.querySelectorAll('.nav-footer')

console.log(itemsFooter)

itemsHeader.forEach((item, index) => {
    item.addEventListener('click', () => {

        
        itemsHeader.forEach((elemento,index) => {
            elemento.classList.remove('bold')
            itemsFooter[index].classList.remove('bold')
            itemsFooter[index].style.opacity = '1'
        })

        item.classList.add('bold');
        itemsFooter[index].classList.add('bold');
        itemsFooter[index].style.opacity = '0.5'



    });
});

itemsFooter.forEach((item, index) => {
    item.addEventListener('click', () => {

        
        itemsFooter.forEach((elemento,index) => {
            elemento.classList.remove('bold')
            itemsHeader[index].classList.remove('bold')
            elemento.style.opacity = '1'
        })

        item.classList.add('bold');
        itemsHeader[index].classList.add('bold');
        item.style.opacity = '0.5'



    });
});

//Funcionalidad 3 - alertas que se activan en cada boton mostrando el id del mismo

const botones = document.getElementsByTagName('button')
console.log(botones)

Array.from(botones).forEach((boton) => {
   boton.addEventListener('click', () => {
    alert(`presionado ${boton.id}, falta añadir funcionalidad`)
   })
})