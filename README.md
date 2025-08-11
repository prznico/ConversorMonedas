# ConversorMonedas

# 💰 Conversor de Monedas 

El conversor de monedas preciso y haciendo uso de API, desarrollado como parte del programa ONE de Oracle G8 + Alura. 

## 🌟 Características Destacadas

- ✅ Conversión en tiempo real usando [ExchangeRate-API](https://www.exchangerate-api.com/)
- 🚀 Soporte para 9 divisas principales (USD, ARS, BRL, COP, MXN)
- 🎨 Interfaz intuitiva en terminal
- 🔄 Actualización automática de tasas cada 30 minutos gracias a la API utilizada

## 🛠️ Tecnologías Utilizadas

| Tecnología | Uso |
|------------|-----|
| ![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=java) | Lógica principal |
| ![Gson](https://img.shields.io/badge/Gson-2.10.1-000000?logo=google) | Manejo de JSON |
| ![HTTP Client](https://img.shields.io/badge/HTTP_Client-Java_11-ED8B00) | Conexión con API |
| ![Git](https://img.shields.io/badge/Git-F05032?logo=git) | Control de versiones |

## 📦 Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/prznico/ConversorMonedas.git
   ```
2. Importa el proyecto en tu IDE favorito (Eclipse, IntelliJ, VS Code)
3. Configura tu API Key en src/main/java/com/conversor/api/ApiConfig.java
4. Ejecuta la clase Main.java

## 🖥️ Cómo Usar

 Ejemplo de ejecución
 ```bash
************************************
Sea bienvenido(a) al Conversor de Moneda

1) Dólar => Peso Argentino
2) Peso argentino => Dólar
3) Dólar => Real brasileño
4) Real brasileño => Dólar
5) Dólar = Peso colombiano
6) Peso colombiano => Dólar
7) Peso mexicano = Dólar
8) Dólar => Peso mexicano
9) salir

Elija una opcion válida:
************************************
8
Ingrese el valor que desee convertir: 
10
El valor de: 10.00 USD corresponde al valor final de: 185.87 MXN
 ```

Hecho con ❤️ por Nicki como parte del Programa ONE de Oracle G8 + Alura

