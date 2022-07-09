# Feign - What is it
Es un cliente Rest declarativo. Detras de esta estupenda definicion tenemos que se trata de un consumidor de endpoints rest que se auto inyecta anotando una interfaz. La principal ventaja de esto es que nos ahorra la necesidad de andar creando implementaciones  para consumir servicios ofrecidos por otros microservicios
### Why not implementing myself
Nos quita de un plumazo andar cubriendo y testando. Ofrece un punto de confiabilidad en nuestro codigo, abstrae con la misma idea (salvando las distancias) que las anotaciones para definir repositorios.

## How to use it
Just a 
```bash
mvn clean install
```
should get all the needed dependencies for this software to work. The test suite, as a previous goal of install, should run with no errors.
