# PrimerParcial
Primer Parcial Back End- DDS

-Magneto quiere reclutar la mayor cantidad de mutantes para poder luchar contra los X-Mens.

Te ha contratado a ti para que desarrolles un proyecto que detecte si un humano es mutante basándose en su secuencia de ADN.

Para eso te ha pedido crear un programa con un método o función con la siguiente firma:

boolean isMutant(String[] dna);

En donde recibirás como parámetro un array de Strings que representan cada fila de una tabla de (NxN) con la secuencia del ADN. Las letras de los Strings solo pueden ser: (A,T,C,G), las cuales representa cada base nitrogenada del ADN.

# Desafíos

Nivel 1:
Programa  en java spring boot que cumpla con el método pedido por Magneto utilizando una arquitectura en capas de controladores, servicios y repositorios.

Nivel 2:
Crear una API REST, hostear esa API en un cloud computing libre (Render), crear el servicio “/mutant/” en donde se pueda detectar si un humano es mutante enviando la secuencia de ADN mediante un HTTP POST con un Json el cual tenga el siguiente formato:

POST → /mutant/
{ “dna”:["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}

En caso de verificar un mutante, debería devolver un HTTP 200-OK, en caso contrario un 403-Forbidden

Nivel 3:
Anexar una base de datos en H2, la cual guarde los ADN’s verificados con la API. Solo 1 registro por ADN.
Exponer un servicio extra “/stats” que devuelva un Json con las estadísticas de las verificaciones de ADN: {“count_mutant_dna”:40, “count_human_dna”:100: “ratio”:0.4}

Tener en cuenta que la API puede recibir fluctuaciones agresivas de tráfico (Entre 100 y 1 millón de peticiones por segundo). Utilizar Jmeter 

Test-Automáticos, Code coverage > 80%, Diagrama de Secuencia / Arquitectura del sistema.
-------------------------------------------------------------------
BASE DE DATOS
- Configuracion de la base de datos H2
spring.datasource.url=jdbc:h2:file:./data/testdb

spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
-LEVANTAR H2 con este comando
 http://localhost:8081/h2-console/
---------------------------------------------------------------------
# Ejecucion 
El proyecto ha sido deployado a Render, se puede acceder mediante el siguiente link: https://primerparcial-kn69.onrender.com
- POST /adn - Recibe la matriz deL ADN a verificar.
- GET /obtenerEstadisticas - Devuelve la cantidad de mutantes y humanos verificados, con su respectivo ratio.
  


