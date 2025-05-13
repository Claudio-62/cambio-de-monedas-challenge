import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodigoDeMonedas {

    private static final Map<String, String> CURRENCY_CODES;

    static {
        CURRENCY_CODES = new HashMap<>();

        //Modifique esta librería para útilizar mas monedas compatibles con la Apicación Exchange Rate.
        // Formato: CURRENCY_CODES.put(display_name, currency_code);

        CURRENCY_CODES.put("Dólares estadounidenses","USD");
        CURRENCY_CODES.put("Pesos argentinos","ARS");
        CURRENCY_CODES.put("Reales brasileños","BRL");
        CURRENCY_CODES.put("Pesos chilenos", "CLP");
        CURRENCY_CODES.put("Euro","EUR");
        CURRENCY_CODES.put("Dolar canadiense","CAD");
        CURRENCY_CODES.put("Renminbi","CNY");
        CURRENCY_CODES.put("Yen", "JPY");
        CURRENCY_CODES.put("Libra esterlina", "GBP");
        CURRENCY_CODES.put("Won", "KRW");
        CURRENCY_CODES.put("Rublo ruso", "RUB");
    }

    public static String getCode(String name){
        return CURRENCY_CODES.get(name);
    }

    public static List<String> getNameList() {
        return new ArrayList<>(CURRENCY_CODES.keySet());
    }

}
