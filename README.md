# Proyecto Zapateria

Prueba de concepto para demostrar cómo crear con anotaciones @Autowiring un servicio REST con Spring e Hibernate.

Primero creamos la Base de Datos, instalamos MySQL o MariaDB como servicios o bien usamos un contenedor docker.
Despues creamos la BBDD "gestion_zapateria" desde PHPmyadmin. Seguidamente Conectar desde NetBeans o STS a la BBDD. La cual se hace de la siguiente forma; con Netbeans, pestaña "Servicios", botón derecho en "Databases" y creamos una nueva conexión. Si usamos MariaDB, tendremos que descargarnos el Conector Java desde su Web. En cadena de conexión ponemos: jdbc:mariadb://localhost:3306/database para forzar el driver MariaDB. Una vez que ya estamos conectados, creamos las tablas e introducimos los datos.

Siguiente paso (crear el proyecto), lo creamos desde la pagina de Spring Initializr.

Despues generamos las entidades nuevas desde la BBDD; con botón derecho en el proyecto, "new" -> "Entities from Database", tenemos que estar conectados a la base de datos para poder generar las clases entidad.

Seguidamente modificamos las clases entidad para evitar referencias recursivas en JSON, modificando la aplicación Spring, para conseguir que se genere JSON donde unas entidades aniden a otras, tenemos que añadir @EnableJpaRepositories(considerNestedRepositories = true) a nuestra aplicación. 

Despues creamos las interfaces de los distintos repositorios.

Gracias al "autowiring" de Spring, automáticamente estarán disponibles las consultas predefidas en Cliente (findById, findAll, findByNombre, findByApellidos....).

Siguiente paso (crear el controlador): implementamos las rutas y verbos HTTP y segudamente probamos el servicio; desde un navegador ("http://localhost:8080/rest/clientes").

Y por ultimo creamos el cliente Web que conecte al servicio utilizando HTML5+JS+jQuery.
