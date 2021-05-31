function seleccionarTodo(){
    
    let seleccionarTodo = document.getElementById('seleccionar-todo');
    
    for (var i = 0; i < seleccionarTodo.elements.length; i++) {
        if (seleccionarTodo.elements[i].type === 'checkbox') {
            seleccionarTodo.elements[i].checked = 1;
        }
    }
    
}