package GroupTravel.Proyecto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import GroupTravel.Proyecto.Cliente.Cliente;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// Anotaciones para indicar que esta es una prueba de Spring Boot que debe iniciar un servidor web en un puerto aleatorio y usar el perfil 'test'
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ClienteTests {

    // Inyección de dependencias de TestRestTemplate, que es una plantilla de descanso que puedes usar para enviar solicitudes HTTP en tus pruebas
    @Autowired
    private TestRestTemplate restTemplate;

    // Prueba de carga para el método GET findAll
    @Test
    public void cargaTestFindAll() {
        // Envía 1000 solicitudes GET al endpoint /api/client/ en paralelo
        IntStream.range(0, 1000).parallel().forEach(i -> {
            // Envía la solicitud GET y guarda la respuesta
            ResponseEntity<Cliente[]> response = restTemplate.getForEntity("/api/client/", Cliente[].class);
            // Verifica que el código de estado de la respuesta sea 200 (OK)
            assertEquals(200, response.getStatusCodeValue());
            // Verifica que el cuerpo de la respuesta no sea nulo
            assertNotNull(response.getBody());
        });
    }

    // Prueba de carga para el método POST saveCliente
    @Test
    public void cargaTestSaveCliente() {
        // Envía 1000 solicitudes POST al endpoint /api/client/ en paralelo
        IntStream.range(0, 1000).parallel().forEach(i -> {
            // Crea una nueva instancia de Cliente para enviar en el cuerpo de la solicitud
            Cliente cliente = new Cliente(); // Aquí debes reemplazar 'new Cliente()' por una instancia válida de Cliente
            // Envía la solicitud POST y guarda la respuesta
            ResponseEntity<Cliente> response = restTemplate.postForEntity("/api/client/", new HttpEntity<>(cliente), Cliente.class);
            // Verifica que el código de estado de la respuesta sea 200 (OK)
            assertEquals(200, response.getStatusCodeValue());
            // Verifica que el cuerpo de la respuesta no sea nulo
            assertNotNull(response.getBody());
        });
    }

    // Prueba de carga para el método PUT updateCliente
    @Test
    public void cargaTestUpdateCliente() {
        // Envía 1000 solicitudes PUT al endpoint /api/client/1 en paralelo
        IntStream.range(0, 1000).parallel().forEach(i -> {
            // Crea una nueva instancia de Cliente para enviar en el cuerpo de la solicitud
            Cliente cliente = new Cliente(); // Aquí debes reemplazar 'new Cliente()' por una instancia válida de Cliente
            // Envía la solicitud PUT y guarda la respuesta
            ResponseEntity<Cliente> response = restTemplate.exchange("/api/client/1", HttpMethod.PUT, new HttpEntity<>(cliente), Cliente.class); // Aquí debes reemplazar '1' por el ID de un cliente que exista en tu base de datos de prueba
            // Verifica que el código de estado de la respuesta sea 200 (OK)
            assertEquals(200, response.getStatusCodeValue());
            // Verifica que el cuerpo de la respuesta no sea nulo
            assertNotNull(response.getBody());
        });
    }

    // Prueba de carga para el método DELETE deleteCliente
    @Test
    public void cargaTestDeleteCliente() {
        // Envía 1000 solicitudes DELETE al endpoint /api/client/1 en paralelo
        IntStream.range(0, 1000).parallel().forEach(i -> {
            restTemplate.delete("/api/client/1"); // Aquí debes reemplazar '1' por el ID de un cliente que exista en tu base de datos de prueba
        });
    }
}

