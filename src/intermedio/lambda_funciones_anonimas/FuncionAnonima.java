package intermedio.lambda_funciones_anonimas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class FuncionAnonima {
    public static void main(String[] args) {
        // DI
        List<Integer> numeros = Arrays.asList(1, 3, 6, 8, 2, 4);

        // P
        List<Integer> numerosFiltrados = numeros.stream().filter(num -> num > 5).collect(Collectors.toList());

        // S
        System.out.println("numerosFiltrados = " + numerosFiltrados);
    }

    static Predicate<Integer> getIntegerPredicate() {
        return (Integer num) -> {
            return num > 5;
        };
    }
}
