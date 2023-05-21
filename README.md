## OOP. Introducción a la persistencia en BD

### 64\. Introducción al diagrama estático UML

- 64\. 

### 65\. Aplicaciones con BD no orientadas a objetos

- 65\. Persistencia · Netbeans 12.5 + JDBC + Java 11JDK + Apache Derby 10.14.2.0 · Ejercicio 0001
- 65\. Persistencia · Netbeans 12.5 + JDBC + Java 11JDK + Apache Derby 10.14.2.0 · Ejercicio 0002
- 65\. Persistencia · Netbeans 12.5 + JDBC + Java 11JDK + Apache Derby 10.14.2.0 · Ejercicio 0003
- 65\. Persistencia · Netbeans 12.5 + JDBC + Java 11JDK + Apache Derby 10.14.2.0 · Ejercicio 0004
- 65\. Persistencia · Netbeans 12.5 + JDBC + Java 11JDK + Apache Derby 10.14.2.0 · Ejercicio 0005
- 65\. Persistencia · Netbeans 12.5 + JDBC + Java 11JDK + Apache Derby 10.14.2.0 · Ejercicio 0006
- 65\. Persistencia · Netbeans 12.5 + JDBC + Java 11JDK + Apache Derby 10.14.2.0 · Ejercicio 0007
- 65\. Persistencia · Netbeans 12.5 + JDBC + Java 11JDK + Apache Derby 10.14.2.0 · Ejercicio 0008
- 65\. Persistencia · Netbeans 12.5 + JDBC + Java 11JDK + Apache Derby 10.14.2.0 · Ejercicio 0009
- 65\. Persistencia · Netbeans 12.5 + JDBC + Java 11JDK + Apache Derby 10.14.2.0 · Ejercicio 0010

### 66\. Aplicaciones con BD orientadas a objetos

- 66\. 

* * *

## Desarrollo del programario

### 67\. Desarrollo del programario

- 67\. 

### 68\. Instalación y uso de entornos de desarrollo

- 68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0001
- 68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0002
![68_SWT_2](https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200002.jpg)
 - En Eclipse, crea una aplicación de escritorio independiente en Java con la interfaz gráfica que simule el cálculo del precio de una mensualidad de una hipoteca.
 - La pantalla está dividida en 4 bloques o partes:
  - Superior "Datos Vivienda", inicialmente activada.
  - "Datos Hipoteca", inicialmente desactivada.
  - Inferior "Alertas", que contendrá un campo de tipo texto, que servirá para notificar por pantalla los errores que se produzcan en las validaciones de los campos de entrada. El contenido de este campo tiene que irse actualizando o borrando dependiendo de si queremos o no informar de algún error en aquel momento.
 - Funcionamiento:
  - <ins>Se introducirán los datos:</ins>
   - "Precio vivienda" : el precio sin impuestos del piso / casa / etc.
   - "Ahorros aportados" : se escribirá la cantidad que ya tienen ahorrada los compradores.
   - "Tipo residencia" : se seleccionará uno de los 2 valores posibles : vivienda habitual o segunda residencia.
  - <ins>Cuando se pulsa el botón "Aceptar":</ins>
   - Si hay algún error en los datos:
    - Se selecciona todo el cuadro de texto que contiene este dato.
    - Se hace que gane focus.
    - Se muestra el error en el cuadro de texto largo del final.
    - No se realiza ninguna acción más.
    - Todos los datos son obligatorios.
    - Los ahorros aportados tienen que ser del 20% del precio del habitáculo como mínimo.
    - En caso contrario, cuando la validación sea correcta, se deshabilitan todos los campos y botones de la parte superior (sección / bloque "Datos Vivienda") y se habilita la sección "Datos Hipoteca": esta incluye:
     - Combo "Bonificaciones"
     - Los campos de texto "Edad Cliente"
     - "Años Hipoteca"
     - "Euríbor actual"
     - Botón "Restablecer"
     - Botón "CALCULAR"
     - El resto de cajas de este bloque no son editables, servirán para mostrar los resultados de los cálculos.
     - En el combo "Bonificaciones" habrá 4 valores posibles:
      - funcionario
      - menor de 35 años
      - colectivos especiales
      - ninguno
      - Solo se podrá seleccionar un valor de "Bonificaciones".
  - <ins>Seguidamente, el usuario selecciona el combo "Bonificaciones", si puede recibir alguna, e introduce los datos requeridos al resto de campos:</ins>
   - Edad del cliente
   - De cuantos años quiere la hipoteca
   - A cuánto está el euríbor actualmente
  - <ins>Cuando se pulsa el botón "CALCULAR":</ins>
   - Se comprueba que el valor del campo "Bonificaciones" esté informado con un valor válido (identificado en un párrafo anterior).
   - En caso que no se haya seleccionado nada en el combo o el dato sea incorrecto:
   - El campo "Bonificaciones" gana focus.
   - El cuadro de texto largo del final muestra el error correspondiente.
   - Se comprueba que los años de hipoteca:
    - Si es vivienda habitual el máximo será de 30 años.
    - Si es segunda residencia, el máximo serán 25 años.
    - La edad del cliente sumada a los años de hipoteca tiene que ser igual o inferior a 75 años.
    - En caso que no se hayan completado estas condiciones o no se haya informado del dato, el campo "Años hipoteca" gana focus y en el cuadro de texto largo del final se muestra el error correspondiente.
    - Se comprueba que el euríbor sea un valor válido (numérico, puede ser negativo o positivo y puede tener decimales). En caso que no haya ningún valor o este sea incorrecto, el campo "Euríbor actual" gana focus y el cuadro de texto largo del final muestra el error correspondiente.
  - <ins>Si hay datos de entradas incorrectas, se calculan los datos de salida:</ins>
   - Funcionario: -1%
   - Menores de 35 años: -0,5%
   - Colectivos especiales: -0,75%
   - Ninguno: no se modifica el interés (-0%)
  - <ins>Seguidamente, se tendrán en cuenta los precios de las diferentes hipotecas (los descuentos se restarán a estos intereses):</ins>
   - Ficha sin bonificar -> interés del 2,95%
   - Ficha bonificada -> interés del 2,55%
   - Variable sin bonificar -> interés del 1,24% + euríbor
   - Variable bonificada -> interés del 0,6% + euríbor
  - <ins>Para calcular el valor de cada mensualidad, usaremos la fórmula:</ins>
   - a=(1-(interés/12))^(años*12) / (interés/12)
   - mensualidad = (precio vivienda - ahorros) / a
  - <ins>Si el usuario pulsa el botón "Restablecer", se podrá:</ins>
   - Volver a iniciar la configuración de los parámetros del cálculo.
   - Habilitar campos y botones de la parte superior posibilitando la opción de reintroducir valores en la parte superior.
   - Se inhabilitará y se borrará el contenido de los campos y botones de la parte de en medio.

- 68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0003
- 68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0004
- 68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0005
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0001
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0002
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0003
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0004
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0005
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0006
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0007
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0008
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0009
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0010

* * *

## Optimización del programario

### 69\. Diseño y realización de pruebas de programario

- 69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0001
- 69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0002
- 69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0003
- 69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0004
- 69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0005
- 69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0006
- 69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0007
- 69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0008
- 69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0009
- 69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0010
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0001
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0002
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0003
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0004
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0005
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0006
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0007
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0008
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0009
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0010

### 70\. Herramientas para el control y documentación del programario / Control de versiones

- 70\. Refacción · Ejercicio 0001
- 70\. Refacción · Ejercicio 0002
- 70\. Refacción · Ejercicio 0003
- 70\. Refacción · Ejercicio 0004
- 70\. Refacción · Ejercicio 0005
- 70\. Refacción · Ejercicio 0006
- 70\. Refacción · Ejercicio 0007
- 70\. Refacción · Ejercicio 0008
- 70\. Refacción · Ejercicio 0009
- 70\. Refacción · Ejercicio 0010
- 70\. Git · Ejercicio 0001
- 70\. Git · Ejercicio 0002
- 70\. Git · Ejercicio 0003
- 70\. Git · Ejercicio 0004
- 70\. Git · Ejercicio 0005
- 70\. Git · Ejercicio 0006
- 70\. Git · Ejercicio 0007
- 70\. Git · Ejercicio 0008
- 70\. Git · Ejercicio 0009
- 70\. Git · Ejercicio 0010

* * *
