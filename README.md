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
    - a=(1-(1 + (interés/12))^(-años*12)) / (interés/12)
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
  - Utiliza el entorno de desarrollo Eclipse para trabajar con una aplicación cliente-servidor, haciendo uso de un servlet.
  - Apache Tomcat es un servidor web que admite programario Java, por ejemplo, admite la ejecución de servlets.
  - Usaremos el servidor de aplicaciones Apache Tomcat para realizar una aplicación servlet que:
    - Llame a un servlet a través de un formulario HTML, que permite introducir el menú a elegir de una cena de cumpleaños y los comensales que asistirán.
    - El servlet captura los datos introducidor en el formulario, que viajan por el servidor.
    - El mismo servlet se encarga de devolver una respuesta HTML, que consiste en una tabla con los datos introducidos por el usuario.
    - Esto permite al usuario validar que los datos que ha introducido son correctos, antes de pasar a otras gestiones, cosa que confirma la comunicación entre el cliente y el servidor.
    - A tener en cuenta:
      - 1. Tiene que estar instalado y configurado el servidor Tomcat: Primero descargamos el tomcat:
        - Ir a la página tomcat.apache.org y descargar la última versión de Tomcat (tar.gz). Descomprimir el archivo descargado.
      - 2. Configurar Eclipse para que trabaje con la instalación de Tomcat: Abrimos Eclipse:
        - Vamos a la pestaña de Servers.
        - Clicamos en: "No servers are available. Click this link to create a new server..."
        - Select the server type: Buscamos el servidor Tomcat que nos hemos descargado anteriormente y lo seleccionamos.
      	- Server's host name: localhost
      	- Server name: El nombre del servidor que nos hemos descargado, al seleccionarlo anteriormente se rellena automáticamente.
      	- Clicamos en: Next.
      	- Name: El nombre del servidor que nos hemos descargado. Por ejemplo "Apache Tomcat v10.1"
      	- Tomcat installation directory: En Browse buscamos donde tenemos el servidor que nos hemos descargado anteriormente.
      	- Finish.
      - 3. Para poner en marcha el servidor, botón derecho encima del servidor en la pestaña Servers -> Start.
      - 4. Crear una aplicación que trabaje con el servlet:
        - File -> New -> Dynamic Web Project
        - Project name: Nombre del proyecto.
        - Target runtime: Debería salir el servidor que hemos instalado anteriormente.
        - Dynamic web module version: Elegimos la versión 5.0.
        - Next.
        - Next.
        - MUY IMPORTANTE: La opción "Generate web.xml deployment descriptor" tiene que estar elegida.
        - Al finalizar, se habrá creado el nuevo proyecto para poder usar el servlet.
      - 5. Dentro del directorio src -> main -> webapp -> WEB-INF: Debería haberse creado el archivo web.xml.
      - 6. Ahora crearemos la página HTML:
        - Botón derecho encima del proyecto -> New -> New HTML File: Le damos el nombre de FormularioEntrada.html
      - 7. Creación del servlet:
        - Botón derecho encima del proyecto -> New -> Servlet
        - Class name: Necesitamos poner el nombre de la clase que implementa el servlet.
        - Java package: Necesitamos poner el nombre del paquete que contendrá la clase que implementa el servlet.
      - 8. Edición del fichero XML.
    - Datos importantes:
      - servlet-class: indica el nombre del Servlet (incluyendo el paquete donde se encuentra)
      - url-pattern: dirección web sobre la cual se mapeará. Tiene que coincidir con la indicada en el formulario .html (línea <form method="post" action= "./ServletFormulariEntrada">).
      - welcome-file-list: Lista de los "ficheros de bienvenida" (welcome-file). Estos ficheros son los que se ejecutan cuando solo se pone el nombre del sitio web, pero no el del fichero que queremos ejecutar. 
      - Mirar las bibliotecas (Libraries):
        - Botón derecho encima del proyecto -> Properties -> Java Build Path -> Libraries.
        - Tienen que ser:
          - JRE System Library[JavaSE-17]
          - EAR Libraries
          - Server Runtime[Apache Tomcat v10.1](o de la versión de Tomcat)
          - Web App Libraries
    - Ejecución del servlet:
      - Botón derecho encima del archivo html -> Run As -> 1 Run on Server -> Seleccionar el servidor 
        
- [68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/68.%20Servlet%20Apache%20Tomcat%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200002)
  - Utiliza el entorno de desarrollo Eclipse para trabajar con una aplicación cliente-servidor, haciendo uso de un servlet.
  - Usaremos el servidor de aplicaciones Apache Tomcat para realizar una aplicación servlet que:
    - Llame a un servlet a través de un formulario HTML, que permite introducir los datos personales de una persona.
    - El servlet captura los datos introducidor en el formulario, que viajan por el servidor.
    - El mismo servlet se encarga de devolver una respuesta HTML, que consiste en una tabla con los datos introducidos por el usuario.
    - Esto permite al usuario validar que los datos que ha introducido son correctos, antes de pasar a otras gestiones, cosa que confirma la comunicación entre el cliente y el servidor.

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

- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0001](https://github.com/sufigueroa87/Ejercicios/tree/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200001)
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **precioConDescuento**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0001;

	public class Ej_69_Pruebas_Programario_Ejercicio0001 {
		
		private static final int DESCUENTO_5 = 5;
		private static final int DESCUENTO_10 = 10;
		
		public static float precioConDescuento(float precio) throws PrecioException {
	  		float resultado;

	  		if(precio <0) throw new PrecioException();

	  		resultado = calcularDescuento(precio, DESCUENTO_10); // descontamos el 10% al precio
	  		
	  		if(precio >= 5000 && precio <= 10000){ // entre 500 y 1000, los dos incluídos
	  		
	  			resultado = calcularDescuento(resultado, DESCUENTO_5);
	  		
	  			System.out.println("resultado: " + resultado);
	  		} else if (precio > 10000) { // por encima de 10000
	  			
	  			resultado = calcularDescuento(resultado, DESCUENTO_10);
	  			System.out.println("resultado: " + resultado);

	  		}
	  		return resultado;
	  	}

	private static float calcularDescuento(float precio, float descuento) {
		float resultado;
		resultado = precio - precio * descuento / 100;
		return resultado;
	}
}
```
```Java
	package ej_69_Pruebas_Programario_Ejercicio0001;

	public class PrecioException extends Exception {
	  	public PrecioException() {
	  	super("Preu negatiu");
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200002)
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **operacionsEsfera**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0002;
	
	public class Ej_69_Pruebas_Programario_Ejercicio0002 {
	
		public static double operacionsEsfera (double radi, String operacio){
			double resultat=0;
			
			if(radi <0) {
				resultat = -1;
			} else if(operacio.equals("perimetre")){
				resultat= 2 * Math.PI * radi;
			} else if(operacio.equals("superficie")){
				resultat= 4 * Math.PI * Math.pow(radi, 2);
			} else if (operacio.equals("volum")){
				resultat= 4.0 / 3 * Math.PI * Math.pow(radi, 3);
			} 
			return resultat;
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0003]()
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **saluda**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0003;

	public class Ej_69_Pruebas_Programario_Ejercicio0003 {
	
		public static String saluda(int hora) throws SaludaException { //el método saluda devuelve una salutación en función de la hora del día
			if(hora < 0 || hora > 23) throw new SaludaException(); //si el método recibe un valor incorrecto, se lanza la excepción definida en la clase SaludaException
			else if (hora < 6 || hora >= 20) return "Bona nit";
			else if (hora < 14) return "Bon dia";
			else return "Bona tarda";
		}
	}
```
```Java
	package ej_69_Pruebas_Programario_Ejercicio0003;
	public class SaludaException extends Exception {
		public SaludaException() {
			super("Hora inexistent");
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0004]()
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **determinaDuresaMohs**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0004;

	public class Ej_69_Pruebas_Programario_Ejercicio0004 {

		public static String determinaDuresaMohs(int duresa) throws DuresaIncorrecteException{ //devuelve el equivalente en texto (mineral) al valor de la dureza introducida
			if(duresa>0 && duresa<=10) {
				if (duresa==10) return "Diamant";
				else if (duresa>7) return "Topazi";
				else if (duresa>4) return "Apatita";
				else if (duresa>2) return "Calcita";
				else return "Talc";
			}
			else throw new DuresaIncorrecteException("Valor duresa " + duresa + " incorrecte."); 
		}
	}
```
```Java
	package ej_69_Pruebas_Programario_Ejercicio0004;

	@SuppressWarnings("serial")
	public class DuresaIncorrecteException extends Exception {
		public DuresaIncorrecteException(String missatge) {
			super(missatge);
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0005]()
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **determinaPermisos**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0005;
	
	public class Ej_69_Pruebas_Programario_Ejercicio0005 {
	
		public static String determinaPermisos(int permis) throws PermisIncorrecteException{
			if(permis>=0 && permis<=9) {
				if (permis==9) return "Total";
				else if (permis>6) return "Alt";
				else if (permis>3) return "Moderat";
				else if (permis>0) return "Baix";
				else return "Sense permisos";
			} else throw new PermisIncorrecteException("Permis " + permis + " incorrecte.");
		}
	}
```
```Java
	package ej_69_Pruebas_Programario_Ejercicio0005;
		@SuppressWarnings("serial")
		public class PermisIncorrecteException extends Exception {
		
		public PermisIncorrecteException(String missatge) {
			super(missatge);
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0006](https://github.com/sufigueroa87/Ejercicios/blob/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200006/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200006.pdf)
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **determinaCategoriaSaffirSimpson**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0006;
	public class Ej_69_Pruebas_Programario_Ejercicio0006 {
		public static String determinaCategoriaSaffirSimpson(int velocitat) throws VelocitatIncorrectaException{
			if(velocitat>118 && velocitat<=400) {
				if (velocitat>250) return "Cat. 5";
				else if (velocitat>209) return "Cat. 4";
				else if (velocitat>177) return "Cat. 3";
				else if (velocitat>153) return "Cat. 2";
				else return "Cat. 1";
			} else throw new VelocitatIncorrectaException("Velocitat del vent " + velocitat + " incorrecta.");
		}
	}
```
```Java
	package ej_69_Pruebas_Programario_Ejercicio0006;
		@SuppressWarnings("serial")
		public class VelocitatIncorrectaException extends Exception {
			public VelocitatIncorrectaException(String missatge) {
			super(missatge);
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0007]
  - A partir del siguiente diagrama de flujo, calcula la complejidad ciclomática y define el conjunto básico de caminos.
![69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0007](https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200007/Ej_69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200007.png)

- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0008]
  - A partir del siguiente diagrama de flujo, calcula la complejidad ciclomática y define el conjunto básico de caminos.  
![69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0008](https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200008/Ej_69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200008.png)

- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0001
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0002
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0003
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0004
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0005
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0006

### 70\. Herramientas para el control y documentación del programario / Control de versiones

- [70\. Refacción · Ejercicio 0001](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200001)
  - Reescribe la clase EAC3 para mejorar su método preuAmbDescompte, aplicando técnicas de refacción.
  - El método recibe un precio y devuelve el resultado de aplicarle distintos descuentos.
  - Concretamente:
    - a) Si el precio es negativo, lanza una excepción del tipo PreuException y acaba la ejecución.
    - b) Siempre aplica un 10% de descuento.
    - c) Si el precio está entre 5000 y 10000, los dos incluídos, aplica un 5% al resultado de haber aplicado el descuento indicado en el punto b.
    - d) Si el precio es superior a 10000, aplica un 10% al resultado de habet aplicado el descuento indicado en el punto b.
  ```Java
  	package ej_70_Refaccion_Ejercicio0001;
	
	public class Ej_70_Refaccion_Ejercicio0001 {
		public static float preuAmbDescompte(float preu) throws PreuException{
			float resultat;

			if(preu <0) throw new PreuException();
			
			resultat = preu - preu * 10 / 100; // descomptem el 10% al preu
			
			if(preu >= 5000 && preu <= 10000){ // entre 500 i 1000, tots dos inclosos
			
				resultat = preu - preu * 10 / 100; // descomptem el 10% al preu
				resultat = resultat - resultat * 5 / 100; // descomptem el 5% al resultat
			
			} else if (preu > 10000) { // per sobre de 10000
				resultat = preu - preu * 10 / 100; // descomptem el 10% al preu
				resultat = resultat - resultat * 10 / 100; // descomptem el 10% al descompte
			}
			return resultat;
		}
	}
  ```
  ```Java
	package refaccion_0001;

	public class PreuException extends Exception{
		public PreuException() {
		super("Preu negatiu");
		}
	}
  ```
- [70\. Refacción · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200002)
  - Reescribe el método souAmbEstadis para mejorarlo aplicando técnicas de refacción.
  - El método recibe una antigüedad y devuelve el resultado de aplicarle distintos aumentos de sueldo. Concretamente:
    - a) Si la antigüedad es inferior a 9 años, devuelve -1 y se acaba la ejecución.
    - b) Siempre aplica un 1% de aumento de sueldo.
    - c) Si la antigüedad es entre 15 y 20 años, se aplica un nuevo aumento de sueldo del 2% al resultado de haber aplicado el aumento indicado en el punto b.
    - d) Si la antigüedad es entre 21 y 26 años, se aplica un nuevo aumento de sueldo del 5% al resultado de haber aplicado el aumento indicado en el punto b.
    - e) Si la antigüedad es superior a 26 años, aplica un 8% al resultado de haber aplicado el aumento indicado en el punto b.
```Java
	package ej_70_Refaccion_Ejercicio0002;
	
	public class Ej_70_Refaccion_Ejercicio0002 {
		public static double souAmbEstadis (int antiguitat){
			double sou=0;
			double souBase=1400;

		if (antiguitat<9) {
			return -1;
		} if (antiguitat >=9 && antiguitat <=14) {
			sou=souBase+souBase*1/100;
		} if (antiguitat >=15 && antiguitat <=20) {
			sou=souBase+souBase*1/100;
			sou=sou+sou*2/100;
		} if (antiguitat >=21 && antiguitat <=26) {
			sou=souBase+souBase*1/100;
			sou=sou+sou*5/100;
		} else if (antiguitat>26) {
			sou=souBase+souBase*1/100;
			sou=sou+sou*8/100;
		}
			return sou;
		}
	}
```
- [70\. Refacción · Ejercicio 0003](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200003)
  - Reescribe la clase siguiente para mejorar el método resumIva de la clase ExRefaccio aplicando las refacciones que consideres.
  - El método calcula el IVA soportad, el IVA repercutido y el resultado de IVA a partir de los importes de compras y ventas.
```Java
	package ej_70_Refaccion_Ejercicio0003;
	public class Ej_70_Refaccion_Ejercicio0003{
		public static void resumIva (float importCompres, float importVendes) {
			System.out.printf("IVA suportat: %.2f\n", importCompres*0.21f);
			System.out.printf("IVA repercutit: %.2f\n", importVendes*0.21f);
			System.out.printf("Resultat IVA: %.2f\n",
			(importVendes* 0.21f - importCompres*0.21f));
		}
	}
```
- [70\. Refacción · Ejercicio 0004](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200004)
  - Reescribe la clase siguiente para mejorar el método calculaImportFactura de la clase Lloguer.
  - Este método se encarga de calcular el importe total de la factura con IVA incluido.
  - También imprime información relativa al número de productos y servicios.
```Java
	package ej_70_Refaccion_Ejercicio0004;

	public class Ej_70_Refaccion_Ejercicio0004 {
		// Área per definir variables globals
		
		/* 
		
		 * Aquest mètode s'encarrega de calcular l'import total de la factura amb IVA inclòs
		 * També imprimeix informació relativa al nombre de productes i serveis
		 * @param nroMinutsTarifa1
		 * @param nroMinutsTarifa2
		 * @param nroMinutsTarifa3
		 * @return importTotal
		 */
		public static Double calculaImportFactura(int nroMinutsTarifa1, int nroMinutsTarifa2, 
	int nroMinutsTarifa3) {
			Double importTarifa1 = 0.00;
			Double importTarifa2 = 0.00;
			Double importTarifa3 = 0.00;
			Double importTotal = 0.00;
			Double importTotalIVA = 0.00;
			
			importTarifa1 = nroMinutsTarifa1 * 0.03;
			System.out.println("El númreo de minuts de tarifa 1 és :"+nroMinutsTarifa1);
			System.out.println("El preu total per a tarifa 1 (sense IVA) és :"+importTarifa1+"€");
			
			importTarifa2 = nroMinutsTarifa2 * 0.06;
			System.out.println("El númreo de minuts de tarifa 2 és :"+nroMinutsTarifa2);
			System.out.println("El preu total per a tarifa 2 (sense IVA) és :"+importTarifa2+"€");
			
			importTarifa3 = nroMinutsTarifa3 * 0.10;
			System.out.println("El númreo de minuts de tarifa 3 és :"+nroMinutsTarifa3);
			System.out.println("El preu total per a tarifa 3 (sense IVA) és :"+importTarifa3+"€");
			
			importTotal = nroMinutsTarifa1 * 0.03 + nroMinutsTarifa1 * 0.06 + nroMinutsTarifa1 * 0.10;
			System.out.println("El preu total (sense IVA) és :"+importTotal+"€");
			importTotalIVA = importTotal + importTotal/100*21;
			System.out.println("El preu total (amb IVA) és :"+importTotalIVA+"€");
			return importTotalIVA;
		}
		
		// ...... altres mètodes de la classe
		
	} // fi de la classe
```
- [70\. Refacción · Ejercicio 0005](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200005)
  - Reescribe la clase siguiente para mejorar el método calculaImportLloguer de la clase Lloguer.
  - Este método se encarga de calcular el importe total del alquiler con IVA incluido.
  - También imprime información relativa a la cantidad de productos de cada tipo y el subtotal individual sin IVA.
```Java
	package ej_70_Refaccion_Ejercicio0005;
	public class Ej_70_Refaccion_Ejercicio0005 {
		public static Double calculaImportLloguer(int nroProductesTipus1, int
		nroProductesTipus2, int nroProductesTipus3) {
			Double importTipus1 = 0.00;
			Double importTipus2 = 0.00;
			Double importTipus3 = 0.00;
			Double importTotal = 0.00;
			importTipus1 = nroProductesTipus1 * 2.00;
			System.out.println ("El númreo de productes de tipus 1 és :"+nroProductesTipus1);
			System.out.println ("El preu total per a productes de tipus 1 (sense IVA) és :"+importTipus1+"€");
			importTipus1 = importTipus1 + importTipus1/100*21;
			importTipus2 = nroProductesTipus2 * 2.50;
			System.out.println ("El númreo de productes de tipus 2 és :"+nroProductesTipus2);
			System.out.println ("El preu total per a productes de tipus 2 (sense IVA) és :"+importTipus2+"€");
			importTipus2 = importTipus2 + importTipus2/100*21;
			importTipus3 = nroProductesTipus3 * 3.00;
			System.out.println ("El númreo de productes de tipus 3 és :"+nroProductesTipus3);
			System.out.println ("El preu total per a productes de tipus 3 (sense IVA) és :"+importTipus3+"€");
			importTipus3 = importTipus3 + importTipus3/100*21;
			importTotal = importTipus1+importTipus2+importTipus3;
			return importTotal;
		}
	// ...... altres mètodes de la classe
	} // fi de la classe
```
- [70\. Refacción · Ejercicio 0006](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200006)
  - Reescribe el método calculaImportFactura para mejorarlo usando técnicas de refacción.
```Java
	package ej_70_Refaccion_Ejercicio0006;

	public class Ej_70_Refaccion_Ejercicio0006 {
		
		public static Double calculaImportFactura(int article1, int article2, int article3) {
			Double importTarifa1 = 0.00;
			Double importTarifa2 = 0.00;
			Double importTarifa3 = 0.00;
			Double importTotal = 0.00;
			Double importTotalIVA = 0.00;
			
			importTarifa1 = article1 * 3.50;
			importTarifa1Iva = importTarifa1 * 1,21;
			System.out.println("S'han comprat "+article1+" unitats de l'article1");
			System.out.println("El preu total de l'article1 (sense IVA) és :"+importTarifa1+"€");
			System.out.println("El preu total de l'article1 (amb IVA) és :"+importTarifa1Iva+"€");
			
			importTarifa2 = article2 * 7.75;
			importTarifa2Iva = importTarifa2 * 1,21;
			System.out.println("S'han comprat "+article2+" unitats de l'article2");
			System.out.println("El preu total de l'article2 (sense IVA) és :"+importTarifa2+"€");
			System.out.println("El preu total de l'article2 (amb IVA) és :"+importTarifa2Iva+"€");
			
			importTarifa3 = article3 * 10.25;
			importTarifa3Iva = importTarifa3 * 1,21;
			System.out.println("S'han comprat "+article3+" unitats de l'article3");
			System.out.println("El preu total de l'article3 (sense IVA) és :"+importTarifa3+"€");
			System.out.println("El preu total de l'article3 (amb IVA) és :"+importTarifa3Iva+"€");
			
			importTotal = article1 * 3.50 + article2 * 7.75 + article3 * 10.25;
			System.out.println("El preu total (sense IVA) és :"+importTotal+"€");
			importTotalIVA = importTotal + importTotal/100*21;
			System.out.println("El preu total (amb IVA) és :"+importTotalIVA+"€");
			return importTotalIVA;
		}
	} 
```
- [70\. Refacción · Ejercicio 0007]()
  - Reescribe el método Salario para mejorarlo usando técnicas de refacción.
  - El método recibe como parámetro la antigüedad de un trabajador y realiza los cálculos que se indican en el mismo método, para saber su salario con bonificaciones.
  
```Java
	package ej_70_Refaccion_Ejercicio0007;

	public class Ej_70_Refaccion_Ejercicio0007 {
		
		public static float Salario (int antiguedad) {
			
			float salario = 0;
			
			if (antiguedad < 10) {
				salario = 1200 + 1200*1/100;
			} 
			else if (antiguedad >= 10 && antiguedad < 20) {
				salario = 1200 + 1200*1/100;
				salario = salario + salario*3/100;
			}
			else {
				salario = 1200 + 1200*1/100;
				salario = salario + salario*5/100;
			}
			
			return salario;
		}
	} 
```
- [70\. Refacción · Ejercicio 0008]()
  - Reescribe el método longitudCircumferencia(double radi1, double radi2) para mejorarlo usando técnicas de refacción.
  
```Java
	package ej_70_Refaccion_Ejercicio0008;

	public class Ej_70_Refaccion_Ejercicio0008 {
		
		public static void longitudCircumferencia(double radio1, double radio2) {
		
		System.out.println("La longitud de la primera circumferencia es " + 2*Math.PI*radio1);
		System.out.println("La longitud de la segunda circumferencia es " + 2*Math.PI*radio2);
		System.out.println("La diferencia entre las longitudes es " + (2*Math.PI*radio1-2*Math.PI*radio2));	
			
	}
```

- 70\. Git · Ejercicio 0001
  - 1. Clona el repositorio público https://github.com/ioc-dam-m05/EAC3.git.
  - 2. Sitúate en la carpeta EAC3 que se acaba de crear.
  - 3. Muestra todas las ramas por pantalla. Utiliza la opción -a del orden para que aparezcan todas las ramas remotas.
  - 4. Sitúate en la rama branca1.
  - 5. Sitúate en la rama branca2.
  - 6. Muestra todas las ramas.
  - 7. Muestra las diferencias entre la rama actual (branca2) y la branca1.
  - 8. Fusiona la rama actual (branca2) y la branca1.
  - 9. Qué ha sucedido?
  - 10. Engancha el contenido de la clase vehicles.Avio de la rama master.
- 70\. Git · Ejercicio 0002
  - 1. Inicializa un nuevo proyecto con Git llamado EAC3.
  - 2. Copia la clase Gos.java:
  ```Java
	package Mamifers;
	public class Gos {
		String raca;
		String origen;
	
		public void setRaca (String raca){
		this.raca=raca;
		}
	
		public String getRaca(){
			return raca;
		}
		
		public void setOrigen (String origen){
			this.origen=origen;
		}
		
		public String getOrigen(){
			return origen;
		}
	}
  ```
  - 3. Añade el fichero al control de versiones.
  - 4. Ejecuta la orden necesaria para que Git muestre los cambios pendientes de confirmar (juntamente con otra información).
  - 5. Confirma los cambios poniento "versión inicial - v1" como mensaje.
  - 6. Crea una nueva rama llamada branca1.
  - 7. Muestra el listado de ramas que hay y di en cuál estás situada.
  - 8. Sitúate en la nueva rama que has creado.
  - 9. Edita o crea el archivo Gos.java para que quede así:
```Java
	package Mamifers;
	public class Gos {
		String raca;
		int camadaMitjana;
		
		public void setRaca (String raca){
			this.raca=raca;
		}
		
		public String getRaca(){
			return raca;
		}
		
		public void setCamadaMitjana (String CamadaMitjana){
			this.camadaMitjana=camadaMitjana;
		}
		
		public int getCamadaMitjana(){
			return camadaMitjana;
		}
	}
```
  - 10. Sube los cambios al repositorio.
  - 11. Crea una nueva rama llamada branca2.
  - 12. Sitúate en la nueva rama que has creado.
  - 13. Edita o crea el archivo Gos.java para que quede así:
```Java
	package Mamifers;
	public class Gos {
		String raca;
		float pes;
		
		public void setRaca (String raca){
			this.raca=raca;
		}
		
		public String getRaca(){
			return raca;
		}
		
		public void setPes (String pes){
			this.pes=pes;
		}
		
		public int getPes(){
			return pes;
		}
	}
```
  - 14. Sube los cambios al repositorio.
  - 15. Muestra las diferencias entre la branca1 y la branca2.
  - 16. Fusiona la branca1 y la branca2.
- 70\. Git · Ejercicio 0003
  - 1. En tu carpeta de trabajo, crea la carpeta src y dentro una subcarpeta llamada aeronaus. En esta subcarpeta, crea el fichero .java con el código siguiente:
```Java
	package aeronaus;

	public class Aeronau {
		private String nom;
		private int costHoraVol;

		public String getNom() {
			return nom;
		}
	
		public void setNom(String nom) {
			this.nom= nom;
		}
		
		public int getCostHoraVol() {
			return costHoraVol;
		}
	
		public void setCostHoraVol(int costHoraVol) {
			this.costHoraVol= costHoraVol;
		}
	}
```
  - 2. Haz que Git considere la carpeta src como repositorio local. Sitúate y ejecuta el orden git init.
  - 3. Ejecuta el orden ls -a <fichero> si trabajas con GNU linux o ls - Hidden <fichero> con PowerShell si trabajas con Windows. Copia la ejecución de esta orden y de la anterior con el resultado.
  - 4. Configura tu nombre y correo en Git con las órdenes:
    - git config --global user.name "nombre"
    - git config --global user.email "correo"
  - 5. Añade todos los ficheros que cuelgan de la carpeta src al control de versiones.
  - 6. Ejecuta la orden necesaria para que Git muestre los cambios pendientes de confirmar (juntamente con otra información).
  - 7. Confirma los cambios poniendo "version inicial" como mensaje.
  - 8. Crea en la carpeta aeronaus el fichero AvioPassatgers.java con el siguiente contenido:
```Java
	package aeronaus;
		public class AvioPassatgers extends Aeronau {
			private int passatgers;
			public int getPassatgers() { return passatgers; }
		public void setPassatgers(int passatgers) { 
			this.passatgers= passatgers; 
		}
	}
```
  - 9. Modifica el fichero Aeronau.java añadiendo la palabra reservada final delante del único parámetro del método setNom.
```Java
	public void setNom(final String nom) {
		this.nom= nom;
} 
```
  - 9. Ejecuta la orden necesaria para que Git muestre los cambios pendientes de confirmar.
  - 10. Añade nuevamente todos los ficheros al control de versiones (con la orden git add).
  - 11. Confirma los cambios poniendo "segunda versión" como mensaje.
  - 12. Crea una rama llamada rama1.
  - 13. Muestra el listado de ramas con la comanda git branch.
  - 14. Haz que la rama activa sea la rama que acabas de crear, la rama1.
  - 15. Crea el fichero AvioCarrega.java en la carpeta aeronaus con el contenido siguiente:
```Java
	package aeronaus;
	public class AvioCarrega extends Aeronau {
		private int paquets;
		public int getPaquets() { 
			return paquets; }
	public void setPaquets(int paquets) { 
		this.paquets= paquets; }
	}
```
  - 16. Modifica el archivo AvioPassatgers (carpeta aeronaus) haciendo que el dato passatgers pase a ser protected.
  - 17. Modifica el archivo Aeronau.java para hacer que todos los datos sean protected.
  - 18. Haz un commit de los cambios con el mensaje "versión segunda rama".
- 70\. Git · Ejercicio 0004

* * *
