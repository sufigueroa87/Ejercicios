## OOP. Introducción a la persistencia en BD

### 64\. Introducción al diagrama estático UML

- 64\. 

### 65\. Aplicaciones con BD no orientadas a objetos

- 65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0001
- 65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0002
- 65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0003
- 65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0004
- 65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0005
- 65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0006
- 65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0007
- 65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0008
- 65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0009
- 65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0010

### 66\. Aplicaciones con BD orientadas a objetos

- 66\. 

* * *

## Desarrollo del programario

### 67\. Desarrollo del programario

- 67\. 

### 68\. Instalación y uso de entornos de desarrollo

- [68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0001](https://github.com/sufigueroa87/Ejercicios/tree/main/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200001)
  - En Eclipse, crea una aplicación de escritorio independiente en Java con la interfaz gráfica que simule el cálculo de un seguro.
  - <ins>La pantalla está dividida en 3 bloques o partes:</ins>
    - Superior "Datos cliente", inicialmente activada.
    - "Datos seguro", inicialmente desactivada.
    - Inferior "Alertas", que contendrá un campo de tipo texto, que servirá para notificar por pantalla los errores que se produzcan en las validaciones de los campos de entrada. El contenido de este campo tiene que irse actualizando o borrando dependiendo de si queremos o no informar de algún error en aquel momento.
  - <ins>Se introducirán los datos:</ins>
    - "Año nacimiento" : Se introducirá el año en que nació el futuro asegurado.
    - "Fumador/a habitual" : Se seleccionará sí o no.
    - "Profesión de riesgo" : Se seleccionará uno de los 3 valores posibles:
      - Riesgo bajo
      - Riesgo moderado
      - Riesgo alto
  - <ins>Cuando se pulsa el botón "Aceptar":</ins>
    - <ins>Si hay algún error en los datos:</ins>
      - Se selecciona todo el cuadro de texto o combo que contiene este dato.
      - Se hace que gane focus.
      - Se muestra el error en el cuadro de texto largo del final.
      - No se realiza ninguna acción más.
      - Todos los datos son obligatorios.
      - Se tiene que cumplir que el asegurado tenga como mínimo 18 años y como máximo 70.
    - <ins>En caso contrario, cuando la validación sea correcta</ins>, se deshabilitan todos los campos y botones de la parte superior (sección / bloque "Datos cliente") y se habilita la sección "Datos seguro": esta incluye:
      - Cuadro de texto "Cantidad a asegurar"
      - Combo "Tipo": Tendrá 3 posibles valores:
        - Muerte o invalidez
        - Muerte o invalidez por accidente
        - Muerte o invalidez o enfermedad grave
      - Button "Restablecer" 
      - Button "Calcular"
      - El resto de cajas de este bloque no son editables, servirán para mostrar los resultados de los cálculos.
  - <ins>Cuando se pulsa el botón "CALCULAR":</ins>
    - Se comprueba que el valor del campo "Tipos" esté informado con un valor válido (identificado en un párrafo anterior).
    - En caso que no se haya seleccionado nada en el combo o el dato sea incorrecto:
      - El campo "Tipos" gana focus.
      - El cuadro de texto largo del final muestra el error correspondiente.
  - <ins>Se comprueba que la cantidad a asegurar tenga un mínimo de 50000 euros:</ins>
    - Si no se cumple esta condición o no se ha informado del dato, el campo "Cantidad a asegurar":
      - Gana focus.
      - Se muestra el error correspondiente en el recuadro de las alertas.
  - <ins>Si los datos son correctos,</ins> se calculan los datos de salida (el método para calcular las cuotas de seguro de vida son inventados):
    - Primero se tiene en cuenta la edad del asegurado:
      - Si tiene entre 18 y 40 años -> factor del 0,9
      - Si tiene entre 41 y 55 años -> factor del 1
      - Si tiene más de 55 años -> factor del 1,1
    - Seguidamente se tendrá en cuenta si el asegurado es fumador/a habitual:
      - Sí -> factor del 1,1
      - No -> factor del 0,9
    - En tercer lugar se valorará si tiene una profesión de riesgo o no:
      - Riesgo bajo -> factor del 0,95
      - Riesgo moderado -> factor del 1,05
      - Riesgo alto -> factor del 1,5
    - Por último, se tendrá en cuenta el tipo de seguro que se desea:
      - Muerte o invalidez -> factor del 1
      - Muerte o invalidez por accidente -> factor del 1,5
      - Muerte o invalidez o enfermedad grave -> factor del 1,1
    - Para calcular el valor de los pagos usaremos la fórmula:
      - anualidad = (Cantidad * Factor edad * Factor fumador * Factor profesión * Factor tipo seguro)/((70-Edad)*10)
      - semestralidad = (anualidad/2)*1,5
      - mensualidad = (anualidad/12)*1,10
  - <ins>Si el usuario pulsa el botón "Restablecer", se podrá:</ins>
    - Volver a iniciar la configuración de los parámetros del cálculo.
    - Habilitar campos y botones de la parte superior posibilitando la opción de reintroducir valores en la parte superior.
    - Se inhabilitará y se borrará el contenido de los campos y botones de la parte de en medio.
<p align="center">
  <img src="https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200001.jpg">
</p>

- [68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200002)
  - En Eclipse, crea una aplicación de escritorio independiente en Java con la interfaz gráfica que simule el cálculo del precio de una mensualidad de una hipoteca.
  - <ins>La pantalla está dividida en 3 bloques o partes:</ins>
    - Superior "Datos Vivienda", inicialmente activada.
    - "Datos Hipoteca", inicialmente desactivada.
    - Inferior "Alertas", que contendrá un campo de tipo texto, que servirá para notificar por pantalla los errores que se produzcan en las validaciones de los campos de entrada. El contenido de este campo tiene que irse actualizando o borrando dependiendo de si queremos o no informar de algún error en aquel momento.
  - <ins>Se introducirán los datos:</ins>
    - "Precio vivienda" : el precio sin impuestos del piso / casa / etc.
    - "Ahorros aportados" : se escribirá la cantidad que ya tienen ahorrada los compradores.
    - "Tipo residencia" : se seleccionará uno de los 2 valores posibles : vivienda habitual o segunda residencia.
  - <ins>Cuando se pulsa el botón "Aceptar":</ins>
    - <ins>Si hay algún error en los datos:</ins>
      - Se selecciona todo el cuadro de texto que contiene este dato.
      - Se hace que gane focus.
      - Se muestra el error en el cuadro de texto largo del final.
      - No se realiza ninguna acción más.
      - Todos los datos son obligatorios.
      - Los ahorros aportados tienen que ser del 20% del precio del habitáculo como mínimo.
    - <ins>En caso contrario, cuando la validación sea correcta</ins>, se deshabilitan todos los campos y botones de la parte superior (sección / bloque "Datos Vivienda") y se habilita la sección "Datos Hipoteca": esta incluye:
      - Combo "Descuento"
      - Los campos de texto "Edad Cliente"
      - "Años Hipoteca"
      - "Euríbor actual"
      - Botón "Restablecer"
      - Botón "CALCULAR"
      - El resto de cajas de este bloque no son editables, servirán para mostrar los resultados de los cálculos.
  - <ins>En el combo "Descuento" habrá 4 valores posibles:</ins>
    - funcionario
    - menor de 35 años
    - colectivos especiales
    - ninguno
    - Solo se podrá seleccionar un valor de "Descuento".
  - <ins>Seguidamente, el usuario selecciona el combo "Descuento", si puede recibir alguna, e introduce los datos requeridos al resto de campos:</ins>
    - Edad del cliente
    - De cuantos años quiere la hipoteca
    - A cuánto está el euríbor actualmente
  - <ins>Cuando se pulsa el botón "CALCULAR":</ins>
    - Se comprueba que el valor del campo "Descuento" esté informado con un valor válido (identificado en un párrafo anterior).
    - En caso que no se haya seleccionado nada en el combo o el dato sea incorrecto:
      - El campo "Descuento" gana focus.
      - El cuadro de texto largo del final muestra el error correspondiente.
  - <ins>Se comprueba que los años de hipoteca:</ins>
    - Si es vivienda habitual el máximo será de 30 años.
    - Si es segunda residencia, el máximo serán 25 años.
    - La edad del cliente sumada a los años de hipoteca tiene que ser igual o inferior a 75 años.
    - En caso que no se hayan completado estas condiciones o no se haya informado del dato, el campo "Años hipoteca" gana focus y en el cuadro de texto largo del final se muestra el error correspondiente.
    - Se comprueba que el euríbor sea un valor válido.
  - <ins>Se calculan los datos de salida:</ins>
    - Funcionario: -1%
    - Menores de 35 años: -0,5%
    - Colectivos especiales: -0,75%
    - Ninguno: no se modifica el interés (-0%)
  - <ins>Seguidamente, se tendrán en cuenta los precios de las diferentes hipotecas (los descuentos se restarán a estos intereses):</ins>
    - Fijo sin bonificar -> interés del 2,95%
    - Fijo bonificada -> interés del 2,55%
    - Variable sin bonificar -> interés del 1,24% + euríbor
    - Variable bonificada -> interés del 0,6% + euríbor
  - <ins>Para calcular el valor de cada mensualidad, usaremos la fórmula:</ins>
    - a=(1-(1 + (interés/12)))^(-años*12) / (interés/12)
    - mensualidad = (precio vivienda - ahorros) / a
  - <ins>Si el usuario pulsa el botón "Restablecer", se podrá:</ins>
    - Volver a iniciar la configuración de los parámetros del cálculo.
    - Habilitar campos y botones de la parte superior posibilitando la opción de reintroducir valores en la parte superior.
    - Se inhabilitará y se borrará el contenido de los campos y botones de la parte de en medio.

<p align="center">
  <img src="https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200002.jpg"/>
</p>

- [68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0003](https://github.com/sufigueroa87/Ejercicios/tree/main/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200003)
  - En Eclipse, crea una aplicación de escritorio independiente en Java con la interfaz gráfica que simule el cálculo del precio de vídeo bajo demanda de una compañía.
  - <ins>La pantalla está dividida en 3 bloques o partes:</ins>
    - Superior "Datos Contrato", inicialmente activada.
    - "Bonificaciones", inicialmente desactivada.
    - Inferior "Alertas", que contendrá un campo de tipo texto, que servirá para notificar por pantalla los errores que se produzcan en las validaciones de los campos de entrada. El contenido de este campo tiene que irse actualizando o borrando dependiendo de si queremos o no informar de algún error en aquel momento.
  - <ins>Se introducirán los datos:</ins>
    - "Paquete contratado" : Se seleccionará uno de los 4 valores posibles:
      - Básico
      - Básico + Series y Pelis
      - Básico + Deportes
      - Completo
    - "Duración contrato" : Se introducirá el nombre de meses iniciales que durará el contrato (un tipo de permanencia).
  - <ins>Cuando se pulsa el botón "Aceptar":</ins>
    - <ins>Si hay algún error en los datos:</ins>
      - Se selecciona todo el cuadro de texto que contiene este dato.
      - Se hace que gane focus.
      - Se muestra el error en el cuadro de texto largo del final.
      - No se realiza ninguna acción más.
      - Todos los datos son obligatorios.
      - El número de meses de contratación tiene que ser un número entero superior o igual a 1.
    - <ins>En caso contrario, cuando la validación sea correcta</ins>, se deshabilitan todos los campos y botones de la parte superior (sección / bloque "Datos Contrato") y se habilita "Productos adicionales contratados" y los buttons "Restablecer" y "CALCULAR". El resto de cajas de este bloque no son editables, servirán para mostrar los resultados de los cálculos.
  - <ins>En el combo "Productos adicionales contratados" habrá 4 valores posibles:</ins>
    - Internet
    - Internet + Mobile
    - Mobile
    - Ninguno
  - <ins>Seguidamente, el usuario selecciona el combo "Productos adicionales contratados" otros productos que tenga contratados.
  - <ins>Cuando se pulsa el botón "CALCULAR":</ins>
    - Se comprueba que el valor del campo "Productos adicionales contratados" esté informado con un valor válido (identificado en un párrafo anterior).
    - En caso que no se haya seleccionado nada en el combo o el dato sea incorrecto:
      - Los cálculos no se realizarán.
      - El cuadro de texto que contiene el dato incorrecto gana focus.
      - El cuadro de texto largo del final muestra el error correspondiente.
  - <ins>Si los datos de entrada son correctos, se calcularán los datos de salida:</ins>
    - "Importe base":
      - Primeramente se calculará el precio base, dependiendo del paquete contratado y de la duración del contrato:
        - básico: 35
        - básico + series + pelis: 45
        - básico + deportes: 55
        - completo: 60
      - A continuación se aplicará el siguiente factor, en función de la duración del contrato:
        - entre 1 y 11 meses (incluidos): 1,1
        - entre 12 y 23 meses (incluidos): 1
        - 24 o más meses: 0,9
      - Por lo tanto, el "Importe base" será el valor según el paquete contratado multiplicado por el valor según la duración del contrato. Por ejemplo, un básico + deportes para 24 meses: 55*0,9=49,50 euros.
    - "Descuento":
      - Se calculará en función de los "Productos adicionales contratados":
        - Si tiene contratado internet -> 5%
        - Si tiene contratado internet + mobile -> 10%
        - Si tiene contratado mobile -> 5%
        - Si no tiene nada contratado -> 0%
      - El descuento será el porcentage correspondiente a los "productos adicionales contratados" aplicado al "importe base". Por ejemplo, el caso anterior supongamos que tenemos contratado también internet i el mobile: el descuento será 49,50 * 5% = 2,48euros (los dos euros se redondean a 2 decimales).
    - "Importe total":
      - Corresponderá al valor del precio base menos el descuento.
  - <ins>Si el usuario pulsa el botón "Restablecer", se podrá:</ins>
    - Volver a iniciar la configuración de los parámetros del cálculo.
    - Habilitar campos y botones de la parte superior posibilitando la opción de reintroducir valores en la parte superior.
    - Se inhabilitará y se borrará el contenido de los campos y botones de la parte de en medio.

<p align="center">
  <img src="https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200003.jpg"/>
</p>

- [68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0004](https://github.com/sufigueroa87/Ejercicios/tree/main/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200004)
  - En Eclipse, crea una aplicación de escritorio independiente en Java con la interfaz gráfica que simule el cálculo del precio de un seguro de coche para un concesionario (solo seguros a todo riesgo).
  - <ins>La pantalla está dividida en 3 bloques o partes:</ins>
    - Superior "Datos Vehículo", inicialmente activada.
    - "Bonificaciones", inicialmente desactivada.
    - Inferior "Alertas", que contendrá un campo de tipo texto, que servirá para notificar por pantalla los errores que se produzcan en las validaciones de los campos de entrada. El contenido de este campo tiene que irse actualizando o borrando dependiendo de si queremos o no informar de algún error en aquel momento.
  - <ins>Se introducirán los datos:</ins>
    - "Caballos" : Se introducirá el número de caballos que tiene el coche. 
    - "Combustible" : Se seleccionará uno de los 4 valores posibles:
      - Gasolina
      - Diesel
      - Híbrido
      - Eléctrico
  - <ins>Cuando se pulsa el botón "Aceptar":</ins>
    - <ins>Si hay algún error en los datos:</ins>
      - Se selecciona todo el cuadro de texto que contiene este dato.
      - Se hace que gane focus.
      - Se muestra el error en el cuadro de texto largo del final.
      - No se realiza ninguna acción más.
      - Todos los datos son obligatorios.
      - El número de caballos tiene que ser superior a 60.
    - <ins>En caso contrario, cuando la validación sea correcta</ins>, se deshabilitan todos los campos y botones de la parte superior (sección / bloque "Parámetros") y se habilitan las cajas "Antigüedad carnet" y "Último comunicado de accidente", así como los buttons "Restablecer" y "Calcular". Eñ resto de cajas de este bloque no son editables, servirán para mostrar los resultados de los cálculos.
      - Después, el usuario introduce en la caja "Antigüedad carnet" el bloque correspondiente a los años que hace que tiene el carnet de conducir.
      - Luego, el usuario introduce en la caja "Último comunicado de accidente" los años que lleva sin presentar ningún comunicado de accidente:
        - Es necesario que sea un número entero igual o superior a 0.
  - <ins>Cuando se pulsa el botón "CALCULAR":</ins>
    - Se comprueba que el valor del campo "Antigüidad del carnet" y "Último comunicado de accidente" estén informados con un valores válidos (identificado en los dos párrafos anteriores):
      - En caso que el formato o los valores de los números introducidos en las cajas sean incorrectos:
        - Los cálculos no se realizarán.
        - El cuadro de texto que contiene el dato incorrecto gana focus.
        - En el cuadro final de texto largo se mostrará también el error correspondiente.
  - <ins>Si los datos introducidos son correctos, se calculan los datos de salida:</ins>
    - "Precio base":
      - Primeramente se calculará el precio base, dependiendo de los caballos del coche y el tipo de combustible según los siguientes valores:
        - menos de 90 caballos: 450
        - entre 90 y 99 caballos: 510
        - entre 100 y 109 caballos: 540
        - entre 110 y 119 caballos: 560
        - entre 120 y 135 caballos: 580
        - más de 135 caballos: 600
        - Gasolina: 1
        - Diesel: 1,2
        - Híbrido: 0,9
        - Eléctrico: 0,8
      - El importe resultante será el valor según los caballos multiplicado por el valor según el combustible. Por ejemplo, un coche de 110 caballos y diesel: 560*1,2=672.
    - "Bonificaciones":
      - Se calculará en función a los "Años de carnet" y a los "Años desde el último comunicado de accidente", según los siguientes valores:
        - Si el carnet tiene hasta 1 año de antigüedad: 1,2
        - Si tiene entre 2 y 9 años: 1
        - Si tiene entre 10 y 19 años: 0,9
        - Si tiene más de 20 años de antigüedad: 0,8
        - Si hace menos de un año del último comunicado -> +3,5%
        - Si hace entre 1 y 2 años: 0%
        - Si hace entre 3 y 4 años: -5%
        - Si hace 5 o más años: -15,5%
      - Al precio base se le aplicará la bonificación de los años de carnet y, sobre el valor obtenido, la de los años desde el último comunicado de accidente y se mostrará el importe resultante. Por ejemplo, continuando con el caso anterior, con 19 años de antigüedad de carnet y 5 años sin ningún accidente (la precisión es de 2 decimales porque se trabaja con euros):
        - 672*0,9 = 604,80
        - 604,80 - 15,5% de 604,80 = 511,06
        - La bonificación sería 672 - 511,06 = 160,94euros
    - "Precio total":
      - Corresponderá al valor del precio base menos las bonificaciones.
      - Lo calcularemos de la manera siguiente:
        - Para el importe anual, usaremos el precio que hemos calculado (precio base - bonificaciones) y le restaremos un 2%.
        - Para el importe trimestral, usaremos el precio que hemos calculado (precio base - bonificaciones) y lo dividiremos entre 4.
        - Para el importe mensual, usaremos el precio que hemos calculado (precio base - bonificaciones) y lo dividiremos entre 12 y le sumaremos el 2%.
  - <ins>Si el usuario pulsa el botón "Restablecer", se podrá:</ins>
    - Volver a iniciar la configuración de los parámetros del cálculo.
    - Habilitar campos y botones de la parte superior posibilitando la opción de reintroducir valores en la parte superior.
    - Se inhabilitará y se borrará el contenido de los campos y botones de la parte de en medio.

<p align="center">
  <img src="https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200004.jpg"/>
</p>

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
