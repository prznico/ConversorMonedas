import java.util.Map;

public record Moneda(
    String result,
    String documentation,
    String terms_of_use,
    long time_last_update_unix,
    String time_last_update_utc,
    long time_next_update_unix,
    String time_next_update_utc,
    String base_code,
    Map<String, Double> conversion_rates
) {

    public String formatoConversion(double cantidad, String monedaDestino) {
        double tasa = conversion_rates.get(monedaDestino);
        double valorConvertido = cantidad * tasa;
        
        return String.format(
            "El valor de: %.2f %s corresponde al valor final de: %.2f %s",
            cantidad,
            base_code,
            valorConvertido,
            monedaDestino
        );
    }
}
