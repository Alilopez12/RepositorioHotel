Allison Lopez Caranton
David Felipe Salazar Gonzalez
Daniel Valencia Arenas

PROBLEMA N°1: Sistema de Reservas de Hotel

CONTEXTO: Un sistema para gestionar reservas, habitaciones, clientes y servicios en un hotel.

CLASES:
*Habitación: Atributos incluyen número, tipo (simple, doble, suite), y precio.
*Reserva: Relaciona una habitación con un cliente e incluye fechas de entrada y salida.
*Cliente: Atributos incluyen nombre, DNI y reservas activas.
*Servicio: Clase base para servicios ofrecidos como spa, restaurante, y limpieza.
*ServicioDeHabitación: Hereda de Servicio, específico para servicios solicitados a la habitación.

RELACIONES:
Un Cliente puede tener varias Reservas.
Una Reserva está asociada a una Habitación.
Habitación puede tener asociados múltiples Servicios, incluyendo ServicioDeHabitación.

HERENCIA:
ServicioDeHabitación hereda de Servicio.

POLIMORFISMO:
Servicio puede implementar una interfaz Consumible con un método consumir(), que se implementa de manera diferente en ServicioDeHabitación y otros servicios, como spa o restaurante.
