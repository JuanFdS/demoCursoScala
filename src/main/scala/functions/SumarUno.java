package functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Prueba {

    public class SumarUno implements Function<Integer, Integer> {
        @Override
        public Integer apply(Integer numero) {
            return numero + 1;
        }
    }














    public void prueba(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3);

        List<Integer> numerosIncrementados = numeros
                .stream()
                .map(numero -> new SumarUno().apply(numero))
                .collect(Collectors.toList());
    }
}

