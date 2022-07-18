# ASTRAL TINDER - Spring Boot App 

# Proyecto final grupal/ Bootcamp EGG Tech - Programación Full Stack
<img src=https://user-images.githubusercontent.com/102770961/179436417-f4a82e85-a4fe-4231-91b2-dd24f0723a00.png width="700">

Astral Tinder es una app de citas desarrollada con Spring Boot implementando MVC cómo patrón de arquitectura.
Usamos el API de persistencia de Java para moldear capa de acceso a datos. Aprovechamos el soporte que JPA proporciona para la ejecución de consultas SQL, así logramos ensamblar una base de datos relacional para vincular los datos de 4 entidades User, Photo, AstralPlane y Vote, necesarias para llevar a cabo la lógica del negocio.

<img src=https://user-images.githubusercontent.com/102770961/179436193-43e9b36f-842d-41cb-adf0-52e933d5bf7b.png width="700">


Al igual que otras aplicaciones de citas, nuestro proyecto requiere un perfil, fotos y datos personales.  Pero también solicita su fecha, hora y lugar de nacimiento para crear una carta de nacimiento, o como nosotros le llamamos "Perfil Astral".
Los usuarios reciben coincidencias con otros usuarios, respecto a su compatibilidad astral general puntuada por nuestra app, pudiendo mandar "me gusta" o "siguiente" entre usuarios mostrados de manera aleatoria (nombre, foto, edad e info astral). Si ambos se gustan se desbloquea la posibilidad de acceder a información de contacto para comunicarse. Y lo más importante, esta aplicación hace que las cartas natales de los usuarios coincidentes ("Matches") estén disponibles entre sí para posteriores consultas.

<img src=https://user-images.githubusercontent.com/102770961/179436446-d5a5ed65-b682-47a0-8c32-54b7c7f3b85c.png width="700">

