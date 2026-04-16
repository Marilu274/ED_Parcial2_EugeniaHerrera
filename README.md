# Examen Parcial 2 - Estructuras de Datos

## Información del Estudiante

- **Nombre:** Maria Eugenia Herrera Cifuentes
- **Carné:** 202605716
- **Curso:** Estructuras de Datos
- **Catedrático:** Ing. Brandon Chitay

## Descripción del Proyecto

Implementación de una **Lista Doblemente Enlazada Circular** en Java.  
La lista mantiene referencias siguiente y anterior en cada nodo, y el último nodo
siempre apunta de vuelta al primero head, formando un ciclo completo.

Operaciones implementadas:
- Insertar al inicio
- Insertar al final
- Eliminar al inicio
- Eliminar al final
- Buscar un elemento
- Recorrer e imprimir la lista
- Menú interactivo en consola

## Video Explicativo

[Enlace al video]

## Instrucciones de Compilación y Ejecución

bash
javac Nodo.java ListaDobleCircular.java Main.java
java Main


## Resultados
========================================
   LISTA DOBLEMENTE ENLAZADA CIRCULAR
========================================
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
========================================
Pruebas
Seleccione una opción: 1
Ingrese el dato a insertar al inicio: 8
? Elemento insertado al inicio.
Lista: 8 <-> (circular -> 8)

Seleccione una opción: 1
Ingrese el dato a insertar al inicio: 9
? Elemento insertado al inicio.
Lista: 9 <-> 8 <-> (circular -> 9)

Seleccione una opción: 1
Ingrese el dato a insertar al inicio: 10
? Elemento insertado al inicio.
Lista: 10 <-> 9 <-> 8 <-> (circular -> 10)

Seleccione una opción: 1
Ingrese el dato a insertar al inicio: 18
? Elemento insertado al inicio.
Lista: 18 <-> 10 <-> 9 <-> 8 <-> (circular -> 18)

Seleccione una opción: 1
Ingrese el dato a insertar al inicio: 19
? Elemento insertado al inicio.
Lista: 19 <-> 18 <-> 10 <-> 9 <-> 8 <-> (circular -> 19)

Seleccione una opción: 1
Ingrese el dato a insertar al inicio: 20
? Elemento insertado al inicio.
Lista: 20 <-> 19 <-> 18 <-> 10 <-> 9 <-> 8 <-> (circular -> 20)

Seleccione una opción: 5
Ingrese el elemento a buscar: 8
Encontrado: 8 está en la lista.

Seleccione una opción: 6
Lista: 20 <-> 19 <-> 18 <-> 10 <-> 9 <-> 8 <-> (circular -> 20)

Seleccione una opción: 4
? Elemento eliminado del final.
Lista: 20 <-> 19 <-> 18 <-> 10 <-> 9 <-> (circular -> 20)

Seleccione una opción: 3
? Elemento eliminado del inicio.
Lista: 19 <-> 18 <-> 10 <-> 9 <-> (circular -> 19)

Seleccione una opción: 6
Lista: 19 <-> 18 <-> 10 <-> 9 <-> (circular -> 19)

## Estructura del Proyecto

| Archivo                   | Descripción                                      |
|---------------------------|--------------------------------------------------|
| `Nodo.java`               | Clase del nodo (dato, siguiente, anterior)       |
| `ListaDobleCircular.java` | Operaciones principales de la lista              |
| `Main.java`               | Menú interactivo con ciclo do-while              |
| `README.md`               | Documentación del proyecto                       |
