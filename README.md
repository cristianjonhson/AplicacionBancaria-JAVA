# Aplicación Bancaria Interactiva

Esta es una aplicación bancaria interactiva desarrollada en Java que permite a un cliente realizar diversas operaciones bancarias a través de la consola. El cliente puede consultar su saldo, retirar dinero, depositar dinero y salir del programa. 

---

## Funcionalidades

1. **Consultar saldo**:  
Muestra el saldo actual de la cuenta.

2. **Retirar dinero**:  
   Permite retirar un monto del saldo disponible. Incluye validaciones para:
   - Saldo insuficiente.
   - Montos no válidos (negativos o cero).

3. **Depositar dinero**:  
   Permite agregar dinero al saldo de la cuenta. Incluye validaciones para:
   - Montos no válidos (negativos o cero).

4. **Salir del programa**:  
   Finaliza la ejecución con un mensaje de despedida.

---

## Tecnologías

- **Lenguaje**: Java 8 o superior.
- **Herramientas recomendadas**: IDEs como IntelliJ IDEA, Eclipse, o un editor de texto con soporte para Java.

---

## Cómo usar la aplicación

1. **Compilar el programa**:
   ```bash
   javac AplicacionBancaria.java
   ```

2. **Ejecutar el programa**:
   ```bash
   java AplicacionBancaria
   ```

3. **Interacción**:
    - Seleccione una opción del menú escribiendo el número correspondiente y presionando `Enter`.
    - Siga las instrucciones que aparecen en pantalla para cada operación.

---

## Ejemplo de ejecución

### Inicio
```plaintext
Bienvenido a la aplicación bancaria
Cliente: Tony Stark

Menú de opciones:
1. Consultar saldo
2. Retirar dinero
3. Depositar dinero
9. Salir
Seleccione una opción: 
```

### Operación 1: Consultar saldo
```plaintext
Seleccione una opción: 1
El saldo actual es: 1599.99
```

### Operación 2: Retirar dinero
```plaintext
Seleccione una opción: 2
Ingrese el monto a retirar: 500
Retiro exitoso. El saldo restante es: 1099.99
```

### Operación 3: Saldo insuficiente
```plaintext
Seleccione una opción: 2
Ingrese el monto a retirar: 2500
Saldo insuficiente para realizar esta transacción.
```

### Operación 4: Depositar dinero
```plaintext
Seleccione una opción: 3
Ingrese el monto a depositar: 600
Depósito exitoso. El saldo actual es: 1699.99
```

### Finalizar
```plaintext
Seleccione una opción: 9
Finalizando el programa. Muchas gracias por usar nuestros servicios.
```

---

## Contribuciones

Las contribuciones son bienvenidas. Siéntete libre de abrir un issue o enviar un pull request.
Para contribuir:

1. Haz un fork del repositorio.
2. Crea una rama para tu funcionalidad o corrección:

   ```bash
   git checkout -b mi-nueva-funcionalidad
   ```
3. Realiza tus cambios y haz un commit:
   ```bash
   git commit -m "feat: agrega nueva funcionalidad"
   ```
4. Envía un pull request con tus cambios.

---

## Mejoras futuras

- **Soporte para múltiples cuentas**: Implementar gestión de múltiples clientes.
- **Historial de transacciones**: Guardar un registro detallado de todas las operaciones.
- **Autenticación básica**: Introducir un sistema de inicio de sesión seguro.
- **Soporte multimoneda**: Manejo de diferentes tipos de divisas para transacciones internacionales.

---

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.


